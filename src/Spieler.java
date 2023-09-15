import java.util.Scanner;

public class Spieler {

    String  name;
    char stone;

    Spieler(String name, char stone){
        this.name = name;
        this.stone = stone;
    }

    void makeMove(){
        Scanner scan = new Scanner(System.in);
       // int row;
        int col;
         do {
             System.out.println("Geben die  Spalte ein:  ");
           // row = scan.nextInt();
             col = scan.nextInt();
         } while (isValidMove(col));
         int row = findAvailableRow(col);

         VierGewinnt.dropToken(row, col, stone);
    }

    static boolean isValidMove(int col){
        if(col < 0 || col >= VierGewinnt.board.length) {
            System.out.println("Die Spalte ist ungültig. Bitt eine andere Spalte auswählen!");
            return false;
        }
        /**
        for( row = VierGewinnt.board.length -1; row >= 0; row--){
            if (VierGewinnt.board[row][col] == ' ') {
                return true;
            }
        }
         **/
        if (findAvailableRow(col) == -1){

        System.out.println("Die Spalte ist voll. Eine andere Spalte bitte auswählen! ");
        return false;
        }
        return true;
    }


    static int findAvailableRow(int col) {
        for( int row = VierGewinnt.board.length -1; row <= 0; row--){
            if(VierGewinnt.board[row][col] == ' ') {
                return row;
            }
        }
        return -1;
    }



}
