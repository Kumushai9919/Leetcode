class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> row = new ArrayList<Integer>();
        ArrayList<Integer> col = new ArrayList<Integer>();

        for(int i=0; i<matrix.length; i++){
            int min = Integer.MAX_VALUE;
            for(int j=0; j<matrix[0].length; j++){
                
                min = Math.min(matrix[i][j], min);
            }

            row.add(min);
        }

        for(int i=0; i<matrix[0].length; i++){
            int max = Integer.MIN_VALUE;
            for(int j=0; j<matrix.length; j++){
                
                max = Math.max(matrix[j][i], max);
            }

            col.add(max);
        }
  
        row.retainAll(col);
        return row;
        
    }
}

 
