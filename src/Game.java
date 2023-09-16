import java.util.Scanner;

public class Game {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ein Game Mode Auswählen: ");
        System.out.println("1. Für Mensch vs. Mensch");
        System.out.println("2. Für Mensch vs. KI");
        Spieler p1;
        Spieler p2;

        int choice = scan.nextInt();
        VierGewinnt g = new VierGewinnt();



       // Spieler p1 = new Spieler("Spieler_1", 'X');
       // Spieler p2 = new Spieler("Spieler_2", 'O');

        if (choice == 1)
        {
            p1 = new MenschSpieler("Spieler_1", 'X');
            p2 = new MenschSpieler("Spieler_2", 'O' );
        }
        else if (choice == 2)
        {
            p1 = new MenschSpieler("Spieler_1", 'X');
            p2 = new AISpieler("Spieler_KI", 'O' );

        }
        else
        {
            System.out.println("Ungültige Auswahl. Das Spiel wird beendet!");
            return;
        }

        Spieler cp; // Current Player
        cp = p1;


        while (true) {
            System.out.println(cp.name + " ist am Zug. Sein Zeichen ist " + cp.stone);
            cp.makeMove();
            VierGewinnt.displayBoard();

            if (VierGewinnt.checkWinVertical(cp.stone) || VierGewinnt.checkWinhorizontal(cp.stone)
                    || VierGewinnt.checkWinDiagonal(cp.stone))
            {
                System.out.println(cp.name + "  Won!");
                break;
            }
            else
            {
                if (cp == p1)
                {
                    cp = p2;
                }
                else
                {
                    cp = p1;
                }
            }
        }
    }
}
