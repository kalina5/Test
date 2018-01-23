package pl.kalina2;

import java.util.Random;
import java.util.Scanner;


public class brudnopis2 {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj liczbe wierszy: ");
        int row = input.nextInt();
        System.out.print("\nPodaj liczbe kolumn: ");
        int col = input.nextInt();
        int[][] theArray1 = new int[row][col];
        int[][] theArray2 = new int[row][col];
        int[][] theArraySum = new int[row][col];

        for (int a = 0; a < theArray1.length; a++) {
            for (int b = 0; b < theArray1[a].length; b++) {
                theArray1[a][b] = rand.nextInt(100);
                theArray2[a][b] = rand.nextInt(100);
            }
        }

        for (int i = 0; i < theArray1.length; i++) {
            for (int j = 0; j < theArray1[i].length; j++) {
                theArraySum[i][j] = theArray1[i][j] + theArray2[i][j];
            }
        }

        printArray(theArray1);
        printArray(theArray2);
        printArray(theArraySum);

    }

    private static void printArray(int[][] passedArray) {

        System.out.println("Tablica: \n");

        for (int a = 0; a < passedArray.length; a++) {
            for (int b = 0; b < passedArray[a].length; b++) {
                System.out.print("[" + passedArray[a][b] + "]" + "\t");

            }
            System.out.println();
        }

        System.out.println("\n");
    }
}

