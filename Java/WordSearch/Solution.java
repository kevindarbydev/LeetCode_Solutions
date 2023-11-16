package Java.WordSearch;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
       char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
       String word = "ABCB";

       boolean output = exist(board,word);
        System.out.println(output);
    }
 //   public static char[] visited = {};

    public static boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        Stack<Character> wordAsStack = new Stack<>();
        String reverse = new StringBuilder(word).reverse().toString();
        char[] wordAsChars = reverse.toCharArray();
        for (char x : wordAsChars) {
            wordAsStack.push(x);
        }

        boolean[][] visited = new boolean[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (board[row][col] == wordAsStack.peek() && !visited[row][col]) {
                    if (dfs(board, rows, cols, row, col, wordAsStack, visited)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean dfs(char[][] board, int rows, int cols, int row, int col, Stack<Character> stack, boolean[][] visited) {
        if (stack.isEmpty()) {
            return true;
        }

        if (isValid(rows, cols, row, col) && board[row][col] == stack.peek() && !visited[row][col]) {
            visited[row][col] = true;
            char current = stack.pop();

            boolean res = dfs(board, rows, cols, row + 1, col, stack, visited) ||
                    dfs(board, rows, cols, row - 1, col, stack, visited) ||
                    dfs(board, rows, cols, row, col + 1, stack, visited) ||
                    dfs(board, rows, cols, row, col - 1, stack, visited);

            stack.push(current); //push back onto the stack
            visited[row][col] = false;

            return res;
        }
        return false;
    }


    public static boolean isValid(int rows, int cols ,int row ,int col){
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }
}