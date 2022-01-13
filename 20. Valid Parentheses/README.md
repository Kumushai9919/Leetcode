# 20. Valid Parentheses

#### Problem Description
````
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
```` 

#### Example 1:
````
Input: s = "()"
Output: true
````
#### Example 2:
````
Input: s = "()[]{}"
Output: true
````
#### Example 3:
````
Input: s = "(]"
Output: false
```` 

#### Constraints:
````
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
````

# Solution Code
#### Support Language - Java
````
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
````
