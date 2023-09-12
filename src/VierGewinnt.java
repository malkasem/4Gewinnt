public class VierGewinnt {

    int size = 7;
    static char [][] board;

    public VierGewinnt() {
        board = new char[7][7];

    }

    void initBoard() {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                board[i][j] = ' ';
            }
        }
    }

    void displayBoard () {
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


    boolean placeToken (int row, int col, char token){
        for ( row = 6; row >= 0; row--){
           if(board[row][col] == ' ') {
               board[row][col] = token;
               return true;
           }
        }
        return false;
    }





}
