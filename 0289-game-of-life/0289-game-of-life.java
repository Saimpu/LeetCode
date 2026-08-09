class Solution {
    public static int many(int i, int j, int[][] board) {
    int count = 0;

    if (i - 1 >= 0 && board[i - 1][j] == 1) {
        count++;
    }

    if (i - 1 >= 0 && j + 1 < board[0].length 
            && board[i - 1][j + 1] == 1) {
        count++;
    }

    if (j + 1 < board[0].length && board[i][j + 1] == 1) {
        count++;
    }

    if (i + 1 < board.length && j + 1 < board[0].length 
            && board[i + 1][j + 1] == 1) {
        count++;
    }

    if (i + 1 < board.length && board[i + 1][j] == 1) {
        count++;
    }

    if (i + 1 < board.length && j - 1 >= 0 
            && board[i + 1][j - 1] == 1) {
        count++;
    }

 
    if (j - 1 >= 0 && board[i][j - 1] == 1) {
        count++;
    }

    if (i - 1 >= 0 && j - 1 >= 0 
            && board[i - 1][j - 1] == 1) {
        count++;
    }

    return count;
}
    public void gameOfLife(int[][] board) {
        int[][] original = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                original[i][j] = board[i][j];
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int count = many(i,j,original);
                if(board[i][j] == 1){
                    if(count<2){
                        board[i][j] = 0;
                    }else if(count==2 || count==3){
                        board[i][j]=1;
                    }else if(count>3){
                        board[i][j] = 0;
                    }
                }
                else{
                    if(count==3){
                        board[i][j]=1;
                    }
                }
            }
        }
    }
}