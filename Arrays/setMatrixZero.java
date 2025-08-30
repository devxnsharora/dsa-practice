//Leetcode 73.
//Space complexity is O(m*n) which is very bad
//instead of storinf in 2d matrix we store the visited elemnts in a 1d matrix
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[][] zeros = new boolean[matrix.length][matrix[0].length];
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    zeros[i][j] = true;
                }
            }
        }
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                if(zeros[i][j] == true){
                    setRowZero(matrix,i);
                    setColumnZero(matrix,j);
                }
            }
        }
    }
    public void setRowZero(int[][] matrix,int row){
        for(int j = 0;j<matrix[row].length;j++){
            matrix[row][j] = 0;
        }
    }
    public void setColumnZero(int[][] matrix,int col){
        for(int i=0;i<matrix.length;i++){
            matrix[i][col] = 0;
        }
    }
}

//by using space complexity 0(m+n)

class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] zeroRows = new boolean[matrix.length];
        boolean[] zeroColumns = new boolean[matrix[0].length];
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    zeroRows[i] = true;
                    zeroColumns[j] = true;
                }
            }
        }
        for(int i = 0;i<matrix.length;i++){
           if(zeroRows[i] == true){
            setRowZero(matrix,i);
           }
        }
        for(int j = 0;j<matrix[0].length;j++){
           if(zeroColumns[j] == true){
            setColumnZero(matrix,j);
           }
        }
    }
    public void setRowZero(int[][] matrix,int row){
        for(int j = 0;j<matrix[row].length;j++){
            matrix[row][j] = 0;
        }
    }
    public void setColumnZero(int[][] matrix,int col){
        for(int i=0;i<matrix.length;i++){
            matrix[i][col] = 0;
        }
    }
}

//Best case solution
//usinfg first row and column to store the state
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRowHasZero = false;
        boolean firstColumnHasZero = false;
        for(int  j = 0;j<matrix[0].length;j++){
            if(matrix[0][j] == 0){
                firstRowHasZero = true;
                break;
            }
        }
        for(int  i = 0;i<matrix.length;i++){
            if(matrix[i][0] == 0){
                firstColumnHasZero = true;
                break;
            }
        }
        for(int i = 1;i<matrix.length;i++){
            for(int j = 1;j<matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for(int i = 1;i<matrix.length;i++){
            for(int j = 1;j<matrix[i].length;j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(firstRowHasZero){
            for(int j = 0;j<matrix[0].length;j++){
                matrix[0][j] = 0;
            }
        }
        if(firstColumnHasZero){
            for(int i = 0;i<matrix.length;i++){
                matrix[i][0] = 0;
            }
        }
    }
}