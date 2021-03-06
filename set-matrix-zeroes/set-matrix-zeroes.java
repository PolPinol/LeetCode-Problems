class Solution {
    public void setZeroes(int[][] matrix) {
        int[] rows = new int[matrix.length];
        int[] columns = new int[matrix[0].length];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    if (columns[j] == 0) {
                        columns[j] = 1;
                        for (int k = 0; k < i; k++) {
                            matrix[k][j] = 0;
                        }  
                    }
                    
                    if (rows[i] == 0) {
                        rows[i] = 1;
                        i--;
                        break;
                    }
                    
                } else if (rows[i] == 1 || columns[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}