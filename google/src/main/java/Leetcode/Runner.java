package Leetcode;

public class Runner {
    private static int gridSize = 9;
    public static void main(String[] args) {
        int[][] board = {
                {7, 0, 2, 0, 5, 0, 6, 0, 0},
                {0, 0, 0, 0, 0, 3, 0, 0, 0},
                {1, 0, 0, 0, 0, 9, 5, 0, 0},
                {8, 0, 0, 0, 0, 0, 0, 9, 0},
                {0, 4, 3, 0, 0, 0, 7, 5, 0},
                {0, 9, 0, 0, 0, 0, 0, 0, 8},
                {0, 0, 9, 7, 0, 0, 0, 0, 5},
                {0, 0, 0, 2, 0, 0, 0, 0, 0},
                {0, 0, 7, 0, 4, 0, 2, 0, 3}
        };
    }
    private static boolean isNumberInRow(int[][] board, int row, int number) {
        for (int i = 0; i < gridSize; i++) {
            if (board[row][i] == number) {
                return true;
            }
        }
        return false;
    }
    private static boolean isNumberInColumn(int[][] board, int column, int number) {
        for (int i = 0; i < gridSize; i++) {
            if (board[i][column] == number) {
                return true;
            }
        }
        return false;
    }
    private static boolean isNumberInBox(int[][] board, int number, int row, int column) {
        int localBoxBow = row - row % 3;
        int localBoxColumn = column - column % 3;

        for (int i = localBoxBow; i < localBoxBow + 3; i++) {
            for (int j = localBoxColumn; j < localBoxColumn + 3; j++) {
                if (board[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }
}
