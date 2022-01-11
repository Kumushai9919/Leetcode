class Solution {
    public boolean isPalindrome(int x) {
       if(x<0)  return false;
       // 123 - 3 -> 
        int original = x;// copy
        int reversed = 0;
        while(original != 0){
            int lastNumber = original%10; //get last digit  12 -> 1
            original/=10; //cut 123 - 1 -> 0
            reversed = reversed * 10 + lastNumber; 0 -> 3 -> 321
        }
        return x == reversed;
    }
    
}
