package pl.kalina;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);

        System.out.println("Użytkowniku, program działa!");
        System.out.println("Proszę wpisać n: ");
        int userInputN = userInputScanner.nextInt();
        System.out.println("Wpisz m:  ");
        int userInputM = userInputScanner.nextInt();
        System.out.println("Wpisz maks w tablicy:  ");
        int userInputMaks = userInputScanner.nextInt();

        if (!validate(userInputN, userInputM, userInputMaks)) {
            System.out.println("Koniec działania programu!");
            System.exit(0);
        }

        int matrix[][] = new int[userInputN][userInputM];

        matrixInitialization(matrix, userInputM, userInputMaks);

        int sum = 0;

        for (int[] a : matrix) {
            for (int b : a) {
                sum = sum + b;
            }
        }

        double average = ((double) sum / (userInputN * userInputM));
        System.out.println();
        System.out.println("Suma: " + sum);
        System.out.println("Srednia:  " + average);

        // druga tablica jednowymiarowa dla sumów

        int sumy[] = new int[userInputN];
        for (int wiersz = 0; wiersz < sumy.length; wiersz++) {
            for (int kolumna = 0; kolumna < userInputN; kolumna++) {
                sumy[wiersz] = sumy[wiersz] + matrix[wiersz][kolumna];
            }

        }

        System.out.println("Sumy wartosci kolejnych wierszy");

        for (int sumaWiersza : sumy) {
            System.out.print(sumaWiersza + "\t");
        }
    }

    private static void matrixInitialization(int[][] matrix, int userInputM, int userInputMaks) {
        Random random = new Random();

        for (int wiersz = 0; wiersz < matrix.length; wiersz++) {
            for (int kolumna = 0; kolumna < matrix[wiersz].length; kolumna++) {
                matrix[wiersz][kolumna] = random.nextInt(userInputMaks) + 1;
                if (kolumna + 1 < userInputM)
                    System.out.print(matrix[wiersz][kolumna] + "\t\t");
                else
                    System.out.println(matrix[wiersz][kolumna]);
            }
        }
    }

    private static boolean validate(int n, int m, int maks) {
        boolean status = true;

        if (maks < 10 || maks > 20)
            status = false;

        if (n < 1 || n > 10)
            status = false;

        if (m < 1 || m > 10)
            status = false;

        if (n < 1 || n > maks)
            status = false;

        if (m < 1 || m > maks)
            status = false;

        return status;
    }
}
