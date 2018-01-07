package pl.kalina;

//import java.util.Random;


public class brudnopis {
    public static void main(String[] args) {


        //Random random = new Random();

        int[][] tablica = new int[4][5];
        for (int a = 0; a < tablica.length; a++) {
            for (int b = 0; b < tablica[a].length; b++) {
                tablica[a][b] = a + 1;
            }
            for (int[] x : tablica) {

                System.out.print(x + "\t");
            }
        }

    }

}