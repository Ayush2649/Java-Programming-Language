import java.util.*;

class Spreadsheet {
    private int[][] grid; // Stores cell values
    private static final int COLS = 26; // Fixed 26 columns

    public Spreadsheet(int rows) {
        grid = new int[rows][COLS]; // Initialize with 0s
    }

    public void setCell(String cell, int value) {
        int[] pos = parseCell(cell);
        grid[pos[0]][pos[1]] = value;
    }

    public void resetCell(String cell) {
        int[] pos = parseCell(cell);
        grid[pos[0]][pos[1]] = 0;
    }

    public int getValue(String formula) {
        if (!formula.startsWith("=")) { 
            return Integer.parseInt(formula); // Direct integer value
        }

        String[] parts = formula.substring(1).split("\\+");
        int sum = 0;

        for (String part : parts) {
            sum += isNumeric(part) ? Integer.parseInt(part) : getCellValue(part);
        }
        return sum;
    }

    private int getCellValue(String cell) {
        int[] pos = parseCell(cell);
        return grid[pos[0]][pos[1]];
    }

    private int[] parseCell(String cell) {
        char colChar = cell.charAt(0);
        int col = colChar - 'A'; // Convert A-Z to 0-25
        int row = Integer.parseInt(cell.substring(1)) - 1; // Convert 1-based index to 0-based
        return new int[]{row, col};
    }

    private boolean isNumeric(String str) {
        return str.matches("\\d+"); // Checks if it's a number
    }
}


/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */