class Solution {
    public boolean search(int[] nums, int target) {
        //1. using Hashset
        HashSet<Integer> set = new HashSet<>();

        for(int i: nums){
            set.add(i);
        }


        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            if(target == it.next()) return true;
        }
        return false;



        //2. using Binary search
        // Arrays.sort(nums);
        // int start = 0;
        // int end = nums.length-1;

        // while(start <= end){
            
        //         int mid = (start+end)/2; 

        //         if(nums[mid] == target){
        //             return true;
        //         }
                
        //         else if(nums[mid] < target){
        //             start = mid+1;
        //         }

        //         else{
        //             end = mid-1;
        //         }
        // }

        //  return false;
        
    
    
    }  
         
    
}
        
  
