package pl.kalina;

import java.util.Random;

public class NoweKrokiPart2 {
    public static void main(String[] args) {

        Random random = new Random();

        int rozmiarPoWierszach = 5;
        int rozmiarPoKolumnach = 10;
        int[][] tablowe = new int[rozmiarPoWierszach][rozmiarPoKolumnach];
        for (int wiersze = 0; wiersze < tablowe.length; wiersze++) {
            for (int kolumny = 0; kolumny < tablowe[wiersze].length; kolumny++) {
                tablowe[wiersze][kolumny] = random.nextInt(9) + 1;
                if (kolumny + 1 < rozmiarPoKolumnach)
                    System.out.print(tablowe[wiersze][kolumny] + "\t");
                else {
                    System.out.println(tablowe[wiersze][kolumny]);
                }
            }
        }
    }
}
