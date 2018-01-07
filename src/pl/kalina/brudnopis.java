package pl.kalina;

import java.util.Random;


public class brudnopis {
    public static void main(String[] args) {

        Random random = new Random();
        int c = 10;
        int d = 2;
        int[][] macierz = new int[c][d];
        //uzupelnianie macierzy
        for (int a = 0; a < macierz.length; a++) {
            for (int b = 0; b < macierz[a].length; b++) {
                macierz[a][b] = random.nextInt(100);
                //wypelnianie i wyswietlanie macierzy
                if (b + 1 < d)
                    System.out.print(macierz[a][b] + "\t\t");
                else
                    System.out.println(macierz[a][b]);

            }
        }
        // suma wierszy
        int addingValueRows[] = new int[c];
        for (int wiersz = 0; wiersz < macierz.length; wiersz++) {
            for (int kolumna = 0; kolumna < d; kolumna++) {
                addingValueRows[wiersz] = addingValueRows[wiersz] + macierz[wiersz][kolumna];
            }

        }
        for (int sumaWierszy : addingValueRows) {
            System.out.print(sumaWierszy + "\t");
        }
        System.out.println("<-------- O to suma kolejno wierszy");
        // suma kolumn
        int addingValueColumns[] = new int[d];
        for (int wiersze = 0; wiersze < macierz.length; wiersze++) {
            for (int kolumny = 0; kolumny < d; kolumny++) {
                addingValueColumns[kolumny] = addingValueColumns[kolumny] + macierz[wiersze][kolumny];
            }
        }
        for (int sumaKolumn : addingValueColumns) {
            System.out.print(sumaKolumn + "\t");
        }
        System.out.println("<------- Suma kolumn");

        // liczenie średniej wierszy
        // ustalenie najpierw sumy wierszy
        int sum = 0;
        for (int[] a : macierz) {
            for (int b : a) {
                sum = sum + b;
            }
        }
        // ustalenie średniej wierszy
        int average = (sum / (c * d));
        System.out.println("O to średnia wierszy:  " + average);

        int mediumValueRows[] = new int[c];
        for (int wiersze = 0; wiersze < macierz.length; wiersze++) {
            for (int kolumny = 0; kolumny < c; kolumny++) {
                mediumValueRows[wiersze] = wiersze / macierz[wiersze][kolumny];
            }
        }
        /*for (int sumaSredniejWierszy : mediumValueRows) {
            System.out.println("O to suma średniej wierszy:  " + sumaSredniejWierszy);
        }*/
        // srednia kolumn
        //najpierw suma kolumn
        int sumO = 0;
        for (int[] a : macierz) {
            for (int b : a) {
                sumO = sumO + b;
            }
        }
        //wypelnianie sumy
        int averageO = sumO / c * d;
        System.out.println("o to średnia kolumn:  " + averageO);
    }



        /*//liczenie sum według wierszy
        int addingValueRows[] = new int[c];
        for (int e = 0; e < addingValueRows.length; e++) {
            for (int f = 0; f < c; f++) {
                addingValueRows[e] = addingValueRows[e] + macierz[e][f];
            }
            //pokazanie tych sum według wierszy w macierzy
            for (int g : addingValueRows) {
                System.out.println("O to suma wierszy:  "  + g);
            }

        //lliczenie sum według kolumn
            int[] addingValueColumns = new int[d];
            for (int h = 0; h < addingValueColumns.length; h++) {
                for (int i = 0; i < d; i++) {
                    addingValueColumns[i] = addingValueColumns[i] + macierz[h][i];

                }
         // pokazanie tej macierzy sumy wedlug kolumn
            for (int l : addingValueColumns) {
                System.out.println("O to suma kolumn:  " + l);
            }
            }


        }
    }*/
}

