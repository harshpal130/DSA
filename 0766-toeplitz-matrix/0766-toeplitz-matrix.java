class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length; //for row
        if(m==1){
            return true;
        }
        int n = matrix[1].length; // column
        
        
        for(int i =1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]!=matrix[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;
        
    }
}