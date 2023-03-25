class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int columns = matrix[0].length;
        int[][] res = new int[columns][row];

        for(int i=0; i<row; i++){
            for(int j=0; j<columns; j++){
                res[j][i] = matrix[i][j];
            }
        }

        return res;
        
    }
}

 
        
