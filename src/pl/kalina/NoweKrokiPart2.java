package pl.kalina;

import java.util.Random;

public class NoweKrokiPart2 {
    public static void main(String[] args) {

        Random random = new Random();

        int rozmiarPoWierszach = 8;
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
            /*int rozmiarPoWierszachDrugiejTablowe = rozmiarPoWierszach;
            int rozmiarPoKolumnachDrugiejTablowe = rozmiarPoKolumnach;
            int[][] drugieTablowe = new int[rozmiarPoWierszachDrugiejTablowe][rozmiarPoKolumnachDrugiejTablowe];
            for (int wierszeDrugiejTablowe = 0; wierszeDrugiejTablowe < drugieTablowe.length; wierszeDrugiejTablowe++) {
                for (int kolumnyDrugiejTablowe = 0; kolumnyDrugiejTablowe < drugieTablowe[wierszeDrugiejTablowe].length; kolumnyDrugiejTablowe++) {
                    drugieTablowe[wierszeDrugiejTablowe][kolumnyDrugiejTablowe] = tablowe[wiersze][kolumny] / 2;
                    if (kolumnyDrugiejTablowe + 1 < rozmiarPoKolumnachDrugiejTablowe)
                        System.out.print(drugieTablowe[wierszeDrugiejTablowe][kolumnyDrugiejTablowe] + "\t");
                    else {
                        System.out.println(drugieTablowe[wierszeDrugiejTablowe][kolumnyDrugiejTablowe]);
                    }
                }
            }*/
            }

        }
    }
}
