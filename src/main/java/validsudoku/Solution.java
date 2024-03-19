package validsudoku;

public class Solution {

        public boolean isValidSudoku(char[][] board) {
            for(int i=0; i<9; i++) {
                for(int j=0; j<9; j++) {

                    if(board[i][j] != '.') {
                        if(!isValid(board, i, j, board[i][j])) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }

        public static boolean isValid(char[][] board, int row, int col, char c) {
            for(int i=0; i<9; i++) {

                if(i != col && board[row][i] == c) return false;

                if(i != row && board[i][col] == c) return false;

                int l = 3 * (row / 3) + i / 3;
                int r = 3 * (col / 3) + i % 3;

                if(l != row && r != col) {
                    if(board[l][r] == c) return false;
                }

            }

            return true;
        }

}
