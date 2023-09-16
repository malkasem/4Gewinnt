import java.util.Scanner;

public class MenschSpieler extends Spieler{

    MenschSpieler(String name, char stone) {
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
}
