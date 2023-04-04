class Solution {
    public int numRescueBoats(int[] people, int limit) {
      
        Arrays.sort(people);
        int boats = 0;
        int left = 0;
        int right = people.length-1;

        while(left <= right){
            if(people[left] + people[right] <= limit){
                left++;
            }
                right--;
                boats++;
        }
        
        return boats;
        

         
    }
}

 
// Time complexity:
// The time complexity of this approach is O(nlogn)O(n log n)O(nlogn) , where n is the length of the people array. 
//This is because we use the sort function to sort the array in nondecreasing order, which has a time complexity of O(nlogn)O(n log n)O(nlogn), and we use two pointers to traverse the sorted array, which has a time complexity of O(n)
