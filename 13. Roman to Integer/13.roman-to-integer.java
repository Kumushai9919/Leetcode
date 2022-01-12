class Solution {
    int res = 0;
    public int romanToInt(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        Map<Character, Integer> romanVal = new HashMap<>();
        romanVal.put('I', 1);
        romanVal.put('V', 5);
        romanVal.put('X', 10);
        romanVal.put('L', 50);
        romanVal.put('C', 100);
        romanVal.put('D', 500);
        romanVal.put('M', 1000);
        
        int length = s.length();
        int result = romanVal.get(s.charAt(length-1));
        for(int i = length-2; i>=0; i--){
            if(romanVal.get(s.charAt(i)) >= romanVal.get(s.charAt(i+1))){
                result += romanVal.get(s.charAt(i));
            }else{
                result -= romanVal.get(s.charAt(i));
            }
        }
        return result;
        
    }
}
