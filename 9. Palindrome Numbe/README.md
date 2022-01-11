# 9. Palindrome Number

##### Problem Description


Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.
 


#### Example 1:

```
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:
````
````
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:
````
````
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
````

#### Constraints:
````
-231 <= x <= 231 - 1
````
## Solution code
#### Support Language - Java 
````
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

````
