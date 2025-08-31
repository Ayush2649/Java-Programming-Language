class Solution {
    public void solveSudoku(char[][] sudoku) {
        sudokuSolver(sudoku, 0, 0);
    }

    public static boolean isSafe(char[][] sudoku, int row, int col, char digit) {
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false; // Check column
            }
        }

        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == digit) {
                return false; // Check row
            }
        }

        int sr = (row / 3) * 3; // Starting row of the 3x3 block
        int sc = (col / 3) * 3; // Starting column of the 3x3 block

        for (int i = sr; i < sr + 3; i++) { // Change <= to <
            for (int j = sc; j < sc + 3; j++) { // Change <= to <
                if (sudoku[i][j] == digit) {
                    return false; // Check 3x3 grid
                }
            }
        }
        return true;
    }

    public static boolean sudokuSolver(char[][] sudoku, int row, int col) {
        if (row == 9) { // Adjusted condition to check only the row
            return true; // Completed all rows
        }

        int nextRow = row;
        int nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0; // Move to next row
        }

        if (sudoku[row][col] != '.') {
            return sudokuSolver(sudoku, nextRow, nextCol); // Skip filled cells
        }

        for (char digit = '1'; digit <= '9'; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit; // Place digit
                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true; // Continue solving
                }
                sudoku[row][col] = '.'; // Backtrack
            }
        }
        return false; // No valid digit found
    }
}