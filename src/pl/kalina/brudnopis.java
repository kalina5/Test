package pl.kalina;

import java.util.Random;


public class brudnopis {
    public static void main(String[] args) {

        Random random = new Random();
        int c = 2;
        int d = 2;
        int[][] macierz = new int[c][d];
        //uzupelnianie macierzy
        for (int a = 0; a < macierz.length; a++) {
            for (int b = 0; b < macierz[a].length; b++) {
                macierz[a][b] = random.nextInt(100) + 1;
                if (b + 1 < d)
                    System.out.print(macierz[a][b] + "\t\t");
                else
                    System.out.println(macierz[a][b]);

            }
        }
        //liczenie sum według wierszy
        int[] addingValueRows = new int[c];
        for (int e = 0; e < macierz.length; e++) {
            for (int f = 0; f < macierz[e].length; f++) {
                addingValueRows[e] = addingValueRows[e] + macierz[e][f];
            }
            //pokazanie tych sum według wierszy w macierzy
            for (int g : addingValueRows) {
                System.out.println(g);
            }
            System.out.println("Oto suma wierszy!");


        }
    }
}

