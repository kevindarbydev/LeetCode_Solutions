package Java.EqualRowAndColumnPairs;

class Solution {
    public static void main(String[] args) {
        int[][]input = {{3,2,1}, {1,7,6}, {2,7,7}};
        System.out.println(equalPairs(input));
    }
    public static int equalPairs(int[][] grid) {
        int numOfPairs = 0;
        int rows = grid.length;
        int columns = grid[0].length;
        int[] holder = new int[rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                //holder[j] =j;
                boolean equalSoFar = true;
                for (int k = 0; k < rows; k++) {
                    if (grid[i][k] != grid[k][j]) {
                        equalSoFar = false;
                        break;
                    }
                }
                if (equalSoFar) numOfPairs++;
            }
        }

        return numOfPairs;
    }
}