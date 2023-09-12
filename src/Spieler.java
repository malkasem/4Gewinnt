import java.util.Scanner;

public class Spieler {

    String  name;
    char token;

    Spieler(String name, char token){
        this.name = name;
        this.token = token;
    }

   static void makeMove(){
        Scanner scan = new Scanner(System.in);
        int row;
        int col;
        System.out.println("geben Sie die Ziele und Spalte ein:  ");
         row = scan.nextInt();
         col = scan.nextInt();
    }

    boolean isValidMove(int row, int col){
        if(row >= 0 && row <= 6 && col >= 0 && col <= 6) {
            if (VierGewinnt.board[row][col] == ' ') {
                return true;
            }
        }
        return false;

    }



}
