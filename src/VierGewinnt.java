public class VierGewinnt {

    int size = 7;
    static char [][] spielBrett;

    public VierGewinnt() {
        spielBrett = new char[7][7];

    }

    void initSpielBrett() {
        for(int i = 0; i < spielBrett.length; i++) {
            for(int j = 0; j < spielBrett.length; j++) {
                spielBrett[i][j] = ' ';
            }
        }
    }

    void dispSpiellBrett () {
        System.out.println("-----------------------------");
        for( int i = 0; i < spielBrett.length; i++) {
            System.out.print("| ");
            for(int j = 0; j < spielBrett.length; j++) {
                System.out.print(spielBrett[i][j] + " | ");
            }
        System.out.println();
        System.out.println("-----------------------------");
        }

    }

}
