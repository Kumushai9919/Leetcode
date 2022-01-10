import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> nmap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target-nums[i];
            if(nmap.containsKey(complement)){
                return new int[]{nmap.get(complement), i};
            }
            else{
                nmap.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
