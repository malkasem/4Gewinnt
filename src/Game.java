public class Game {
    public static void main(String[]args) {

        VierGewinnt g = new VierGewinnt();

        Spieler p1 = new Spieler("P1", 'X');
        Spieler p2 = new Spieler("P2", 'O');

        Spieler cp;
        cp = p1;


        Spieler.makeMove();

        g.initBoard();
        g.displayBoard();

    }
}
