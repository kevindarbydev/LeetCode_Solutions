package Java.ValidSudoku;

public class Solution {

    public static void main(String[] args) {
        //generate char[][] input for leetcode question 36. Valid Sudoku
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        boolean rowValid = true;
        boolean columnValid = true;
        boolean subBoxValid = true;

        for (int i = 0; i < 9; i++) {//row
            for (int j = 0; j < 9; j++) {//column
                rowValid = isRowValid(board[i]);
                columnValid = isColumnValid(board[j]);
                subBoxValid = isSubBoxValid(board, i, j);
                if (!rowValid || !columnValid || !subBoxValid) return false;
            }
        }

        return true;
    }

    public static boolean isRowValid(char[] row) {

        return false;
    }


    public static boolean isColumnValid(char[] col) {
        return false;
    }

    public static boolean isSubBoxValid(char[][] board, int row, int col) {
        boolean[] subBoxValid = new boolean[9];

        int subBoxIndex = (row / 3) * 3 + col / 3;

        for (int i = row / 3 * 3; i < row / 3 * 3 + 3; i++) {
            for (int j = col / 3 * 3; j < col / 3 * 3 + 3; j++) {
                char currentChar = board[i][j];

            }
        }


        return true;
    }
}
