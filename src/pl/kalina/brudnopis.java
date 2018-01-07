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

    }
        }

