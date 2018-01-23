package pl.kalina;


public class brudnopis {
    public static void main(String[] args) {

        int wiersz = 4;
        int kolumna = 7;
        int[][] tab = new int[wiersz][kolumna];
        int licznik = 1;
        for (int a = 0; a < tab.length; a++) {
            for (int b = 0; b < tab[a].length; b++) {
                tab[a][b] = licznik++;
            }
        }

        for (int a = 0; a < tab.length; a++) {
            for (int b = 0; b < tab[a].length; b++) {
                System.out.print(tab[a][b] + "\t");

            }
            System.out.println();
        }
    }
}

