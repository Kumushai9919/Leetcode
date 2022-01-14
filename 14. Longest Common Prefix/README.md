# 14. Longest Common Prefix

#### Problem Description
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

##### Example 1:
````
Input: strs = ["flower","flow","flight"]
Output: "fl"
````
#### Example 2:
````
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 ````

#### Constraints:
````
1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lower-case English letters.
````

# Code
#### Support Language: Java
````
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common = "";
        if(strs.length == 0) return common;
        common = strs[0];
        for(int i=1; i<strs.length; i++){
            while(strs[i].indexOf(common) != 0){
                common = common.substring(0, common.length() - 1);
            }
        }
        return common;
    }
}
````
