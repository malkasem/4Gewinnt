import java.util.Random;
import java.util.Scanner;

public class AISpieler extends Spieler {

    AISpieler(String name, char stone) {
        this.name = name;
        this.stone = stone;
    }

    void makeMove(){
       // Scanner scan = new Scanner(System.in);
        int col;
        do {
            System.out.println("Geben die  Spalte ein:  ");
            Random r = new Random();
            col = r.nextInt(7);
        } while (isValidMove(col));
        int row = findAvailableRow(col);

        VierGewinnt.dropToken(row, col, stone);
    }
}
