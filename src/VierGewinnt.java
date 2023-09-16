public class VierGewinnt {

    //int size = 7;
    static char [][] board;

    public VierGewinnt() {
        board = new char[7][7];
        initBoard();

    }

    void initBoard() {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                board[i][j] = ' ';
            }
        }
    }

    static void displayBoard () {
        System.out.println("-----------------------------");
        for( int i = 0; i < board.length; i++) {
            System.out.print("| ");
            for(int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " | ");
            }
        System.out.println();
        System.out.println("-----------------------------");
        }
    }


   static int dropToken ( int row, int chosenColumn, char stone){
        int col = chosenColumn;
        for (  row = 6; row >= 0; row--){
           if(board[row][col] == ' ') {
               board[row][col] = stone;
               return row;
           }
        }
        return -1;
    }

    // Check Win Vertically
    static boolean checkWinVertical(char stone) {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 7; col++) {
                if (board[row][col] == stone &&
                        board[row + 1][col] == stone &&
                        board[row + 2][col] == stone &&
                        board[row + 3][col] == stone) {
                    return true;
                }
            }
        }
        return false;
    }

    // Check Win horizontally

    static boolean checkWinhorizontal(char stone) {
        for ( int row = 0; row < 7; row++ ){
            for(int col = 0; col < 4; col++){
                if (board[row][col] == stone &&
                    board[row][col + 1] == stone &&
                    board[row][col + 2] == stone &&
                    board[row][col + 3] == stone) {
                    return true;
                }
            }
        }
            return false;
    }

    // Check Win Diagonally

    static boolean checkWinDiagonal(char stone) {
        // Check upward diagonal (from bottom-left to top-right)
        for (int row = 3; row < 7; row++) {
            for (int col = 0; col < 4; col++) {
                if (board[row][col] == stone &&
                        board[row - 1][col + 1] == stone &&
                        board[row - 2][col + 2] == stone &&
                        board[row - 3][col + 3] == stone) {
                    return true;
                }
            }
        }
        // Check downward diagonal (from top-left to bottom-right)
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (board[row][col] == stone &&
                        board[row + 1][col + 1] == stone &&
                        board[row + 2][col + 2] == stone &&
                        board[row + 3][col + 3] == stone) {
                    return true;
                }
            }
        }
        return false;
    }
}
