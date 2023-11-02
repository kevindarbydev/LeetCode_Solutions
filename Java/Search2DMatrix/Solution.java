package Java.Search2DMatrix;

class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length; // Assuming all rows have the same number of columns
        //start on first row
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int currentValue = matrix[i][j]; // Access element at row i, column j
                if (currentValue == target) return true;
            }
        }        
        return false;
    }
}