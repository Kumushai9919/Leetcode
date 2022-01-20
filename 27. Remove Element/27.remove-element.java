class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        
        int valid_size=0; 
        
        for(int j=0; j<nums.length; j++){
            if(nums[j] != val){
                nums[valid_size] = nums[j];
                valid_size++;  
            }
        }
        
        return valid_size;
    }
}
