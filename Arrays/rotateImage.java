//Leetcode 48.
//Rotate the 2d array by 90 degreee clockwise
//just mapping where we see the pattern 
class Solution {
    public void rotate(int[][] matrix) {
        int rotatedMatrix[][] = new int[matrix.length][matrix[0].length];
        for(int i= 0;i<matrix.length;i++){
            for(int j = 0;j<matrix.length;j++){
                rotatedMatrix[j][matrix.length-1-i] = matrix[i][j];
            }
        }
        for(int i= 0;i<matrix.length;i++){
            for(int j = 0;j<matrix.length;j++){
                matrix[i][j] = rotatedMatrix[i][j];
            }
        }        
    }
}

//More optimal way by doing tranpose and reverse
class Solution {
    public void rotate(int[][] matrix) {
        for(int i= 0;i<matrix.length;i++){
            for(int j = i;j<matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i= 0;i<matrix.length;i++){
            for(int j = 0;j<matrix.length/2;j++){
                int temp = matrix[i][matrix.length-j-1];
                matrix[i][matrix.length-j-1] = matrix[i][j];
                matrix[i][j] = temp; 
            }
        }        
    }
}