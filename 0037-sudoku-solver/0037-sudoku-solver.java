class Solution {
    private boolean isValid(char[][] board, int row, int column) {
    return (rowConstraint(board, row)
      && columnConstraint(board, column) 
      && subsectionConstraint(board, row, column));
}
private boolean rowConstraint(char[][] board, int row) {
    boolean[] constraint = new boolean[9];
    return IntStream.range(0, 9)
      .allMatch(column -> checkConstraint(board, row, constraint, column));
}
private boolean columnConstraint(char[][] board, int column) {
    boolean[] constraint = new boolean[9];
    return IntStream.range(0, 9)
      .allMatch(row -> checkConstraint(board, row, constraint, column));
}
private boolean subsectionConstraint(char[][] board, int row, int column) {
    boolean[] constraint = new boolean[9];
    int subsectionRowStart = (row / 3) * 3;
    int subsectionRowEnd = subsectionRowStart + 3;

    int subsectionColumnStart = (column / 3) * 3;
    int subsectionColumnEnd = subsectionColumnStart + 3;

    for (int r = subsectionRowStart; r < subsectionRowEnd; r++) {
        for (int c = subsectionColumnStart; c < subsectionColumnEnd; c++) {
            if (!checkConstraint(board, r, constraint, c)) return false;
        }
    }
    return true;
}
boolean checkConstraint(
  char[][] board, 
  int row, 
  boolean[] constraint, 
  int column) {
    char currentChar = board[row][column];
    if (currentChar != '.') {
        if (currentChar >= '1' && currentChar <= '9') {
            if (!constraint[currentChar - '1']) {
                constraint[currentChar - '1'] = true;
            } else {
                return false;
            }
        } else {
            return false; // Not a valid digit
        }
    }
    return true;
}

    public boolean solveSudoku(char[][] board) {
    for (int row = 0; row < 9; row++) {
        for (int column = 0; column < 9; column++) {
            if (board[row][column] == '.') {
                for (char k = '1'; k <= '9'; k++) {
                    board[row][column] = (k);
                    if (isValid(board, row, column) && solveSudoku(board)) {
                        return true;
                    }
                    board[row][column] = '.';
                }
                return false;
            }
        }
    }
    return true;
}}