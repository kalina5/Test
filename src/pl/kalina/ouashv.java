package pl.kalina;

import java.util.Random;
import java.util.Scanner;

public class ouashv {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Wpisz n:    ");
        int n = scanner.nextInt();
        System.out.print("Wpisz m:   ");
        int m = scanner.nextInt();
        int[][] tab = new int[n][m];
        for (int a = 0; a < tab.length; a++) {
            for (int b = 0; b < tab[a].length; b++) {
                tab[a][b] = random.nextInt(6) + 1;
            }
        }
        for (int a = 0; a < tab.length; a++) {
            for (int b = 0; b < tab[a].length; b++) {
                System.out.print(tab[a][b] + "\t");
            }
            System.out.println();
        }


        System.out.println("O to przemnożona tablica przez dwa:  ");
        int[][] tab1 = new int[n][m];
        for (int a = 0; a < tab1.length; a++) {
            for (int b = 0; b < tab1[a].length; b++) {
                tab1[a][b] = tab[a][b] * 2;
            }
        }
        for (int a = 0; a < tab.length; a++) {
            for (int b = 0; b < tab1[a].length; b++) {
                System.out.print(tab1[a][b] + "\t");
            }
            System.out.println();
        }

        System.out.println("O to suma tejże tablicy:  ");
        int sum = 0;
        for (int a = 0; a < tab.length; a++) {
            for (int b = 0; b < tab[a].length; b++) {
                sum = sum + tab1[a][b];
            }
            System.out.print(sum);
        }

    }
}



