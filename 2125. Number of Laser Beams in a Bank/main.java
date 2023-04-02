 class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0;
        for(int i=0; i<bank[0].length(); i++){
            if(bank[0].charAt(i)=='1')++prev;
        }

        int curr = 0;
        int ans = 0;
        for(int i=1; i<bank.length; i++){
            for(int j=0; j<bank[i].length(); j++){
                if(bank[i].charAt(j)=='1')curr++;
            }
            if(curr!=0){
                ans +=prev*curr;
                prev=curr;
                curr=0;
            }
        }

        return ans;


       
    }
}

 
