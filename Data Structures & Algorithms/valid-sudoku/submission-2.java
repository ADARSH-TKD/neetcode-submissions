
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> seenR = new HashSet<>(); 
            Set<Character> seenC = new HashSet<>(); 
            for (int j = 0; j < 9; j++) {
                // Check Row independently
                if (board[i][j] != '.') {
                    if (!seenR.add(board[i][j])) return false;
                }
                // Check Column independently
                if (board[j][i] != '.') {
                    if (!seenC.add(board[j][i])) return false;
                }
            }    
        }

        // 3x3 Block check logic is already completely correct!
        for (int s = 0; s < 9; s++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int r = (s / 3) * 3 + i;
                    int c = (s % 3) * 3 + j;

                    if (board[r][c] == '.') continue;
                    if (!seen.add(board[r][c])) return false;
                }
            }
        }

        return true;
    }
}