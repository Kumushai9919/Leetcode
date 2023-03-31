class Solution {
    public int thirdMax(int[] nums) {
         HashSet<Integer> set = new HashSet<>();

         for(int i: nums){
             set.add(i);
         }

         int[] arr = new int[set.size()];
         int c = 0;

         for(int i: set){
             arr[c] = i;
             c++;
         }

         Arrays.sort(arr);

         if(arr.length < 3){
             return arr[arr.length-1];
         }

         return arr[arr.length-3];

    }
}


 
