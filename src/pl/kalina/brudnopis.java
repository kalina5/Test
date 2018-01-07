package pl.kalina;

import java.util.Random;


public class brudnopis {
    public static void main(String[] args) {

        Random random = new Random();
        int c = 5;
        int d = 5;
        int[][] macierz = new int[c][d];
        //uzupelnianie macierzy
        for (int a = 0; a < macierz.length; a++) {
            for (int b = 0; b < macierz[a].length; b++) {
                macierz[c][d] = random.nextInt(100);
            }
            for (int[] e : macierz) {
                for (int f : e) {
                    System.out.println(f);
                }
            }
            }
        }

}