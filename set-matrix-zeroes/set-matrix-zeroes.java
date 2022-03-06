class Solution {
    public void setZeroes(int[][] matrix) {
        int[] rows = new int[matrix.length];
        int[] columns = new int[matrix[0].length];
        
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("rows " + rows[i]);
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
                if (rows[i] == 1 || columns[j] == 1) {
                    if (matrix[i][j] == 0) {
                       
                        columns[j] = 1;

                        for (int k = 0; k < i; k++) {
                            matrix[k][j] = 0;
                        }
                        
                        if (rows[i] == 0) {
                            rows[i] = 1;
                            i--;
                            break;
                        }
                         rows[i] = 1;
                        
                        System.out.println("A");
                    } else {
                        matrix[i][j] = 0;
                        System.out.println("B");
                    }
                } else if (matrix[i][j] == 0) {
                    rows[i] = 1;
                    columns[j] = 1;
                    
                    for (int k = 0; k < i; k++) {
                        matrix[k][j] = 0;
                    }
                    System.out.println("C");
                    i--;
                    break;
                } else {
                    System.out.println("D");
                }
            }
            System.out.println("-----------------------");
        }
        printA(rows);
        printA(columns);
    }
    
    public void printA(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
}