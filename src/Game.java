public class Game {
    public static void main(String[]args) {


        VierGewinnt g = new VierGewinnt();

        Spieler p1 = new Spieler("Spieler_1", 'X');
        Spieler p2 = new Spieler("Spieler_2", 'O');

        Spieler cp;
        cp = p1;


        while (true) {

            System.out.println(cp.name + " ist am Zug. Sein Zeichen ist " + cp.stone);

            cp.makeMove();
            VierGewinnt.displayBoard();

            if (VierGewinnt.checkWinVertical(cp.stone) || VierGewinnt.checkWinhorizontal(cp.stone)
                    || VierGewinnt.checkWinDiagonal(cp.stone)
            ) {
                System.out.println(cp.name + "  Won!");
                break;
            } else {
                if (cp == p1) {
                    cp = p2;
                } else {
                    cp = p1;
                }
            }
        }
    }
}
