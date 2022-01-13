class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curBracket = s.charAt(i);
            if (curBracket == '(' || curBracket == '{' || curBracket == '[') {
                stack.push(curBracket);
            } else {
                if(stack.isEmpty()) return false;
                char openBracket = stack.peek();
                stack.pop();
                if (curBracket - openBracket == 1 || curBracket - openBracket == 2)
                    continue;
                else return false;
            }
        }
        if (!stack.isEmpty()) return false;
        return true;
    }
} 
