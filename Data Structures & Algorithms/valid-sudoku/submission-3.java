class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> seen = new HashSet<>(); 
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                    if (!seen.add(board[i][j])) {
                    return false; 
                }
            }    
        }
        for (int i = 0; i < 9; i++) {
            Set<Character> seen = new HashSet<>(); 
            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.') continue;
                    if (seen.contains(board[j][i])) {
                    return false; 
                }
                else{
                    seen.add(board[j][i]);
                }
            }    
        }

        for(int s = 0 ; s<9; s++){
            Set<Character> seen = new HashSet<>();
            for(int i =0 ; i<3;i++){
                for(int j = 0; j <3; j++){
                    int r = (s/3)*3+i;
                    int c  = (s%3)*3+j;

                    if(board[r][c] == '.') continue;
                    if(seen.contains(board[r][c])) {
                        return false;
                    }
                    else{

                    seen.add(board[r][c]);
                    }
                }
            }
        }

        return true;



    }
}