#  217. Contains Duplicate

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 
#### Example 1:
````
Input: nums = [1,2,3,1]
Output: true
````

#### Example 2:
````
Input: nums = [1,2,3,4]
Output: false
````

#### Example 3:

````
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 ````

#### Constraints:
````
1 <= nums.length <= 105
-109 <= nums[i] <= 109
````

#### Solution in Java:

In order to solve this problem we can use bruteforce algoritm where to determine the duplicates we comare with have to check every other value in the array and it will take O(1) space complexity, 
but O(n^2) time complexity which is not efficient. However we can sacrifice our memory by sorting the array or using extra memory data structure like HashSet. By using hashset we check duplicates
in the array and if it's not put the value in Hashset so we can compare later if this value already contains in the set. Time complexity with HashSet will be O(n), since
we had to do operation with every value and only had to scan through the list of inputs once.

````
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i: nums){
            if(set.contains(i)){
                return true;
            }

            set.add(i);
        }

         return false;

    }
}

//Time complexity : O(n)
// Space complexity: O(n) - set
````


