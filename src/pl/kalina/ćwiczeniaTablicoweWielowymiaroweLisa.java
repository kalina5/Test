package pl.kalina;

public class ćwiczeniaTablicoweWielowymiaroweLisa {
    public static void main(String[] args) {
        // Ćwiczenie 12.1.
        //Zmodyfikuj kod z listingu 2.45 tak, aby w kolejnych komórkach tablicy znalazły się
        //liczby malejące od 10 do 1.
//         //Rozwiązanie zadania
//        int[][] tab = new int[4][];
//        tab[0] = new int[4];
//        tab[1] = new int[2];
//        tab[2] = new int[1];
//        tab[3] = new int[3];
//        int licznik = 10;
//        for(int i = 0; i < tab.length; i++){
//            for(int j = 0; j < tab[i].length; j++){
//                tab[i][j] = licznik--;
//            }
//        }
//        for(int i = 0; i < tab.length; i++){
//            System.out.print("tab[" + i + "] = ");
//            for(int j = 0; j < tab[i].length; j++){
//                System.out.print(tab[i][j] + " ");
//            }
//            System.out.println("");
//        }
        // LISTING 2.45
//        int[][] tab = new int[4][];
//        tab[0] = new int[4];
//        tab[1] = new int[2];
//        tab[2] = new int[1];
//        tab[3] = new int[3];
//        int licznik = 1;
//        for(int i = 0; i < tab.length; i++){
//            for(int j = 0; j < tab[i].length; j++){
//                tab[i][j] = licznik++;
//            }
//        }
//        for(int i = 0; i < tab.length; i++){
//            System.out.print("tab[" + i + "] = ");
//            for(int j = 0; j < tab[i].length; j++){
//                System.out.print(tab[i][j] + " ");
//            }
//            System.out.println("");
//        }

        //Ćwiczenie 12.2.
        //Zmodyfikuj program z listingu 2.46 tak,
        // aby do wypełnienia tablicy danymi były wykorzystywane pętle typu while.
//        int[][] tab = new int[4][];
//        tab[0] = new int[4];
//        tab[1] = new int[3];
//        tab[2] = new int[2];
//        tab[3] = new int[1];
//        int licznik = 1;
//        for(int i = 0; i < tab.length; i++){
//            for(int j = 0; j < tab[i].length; j++){
//                tab[i][j] = licznik++;
//            }
//        }
//        for(int i = 0; i < tab.length; i++){
//            System.out.print("tab[" + i + "] = ");
//            for(int j = 0; j < tab[i].length; j++){
//                System.out.print(tab[i][j] + " ");
//            }
//            System.out.println("");
//        }

//        int[][] tab = new int[4][];
//        tab[0] = new int[4];
//        tab[1] = new int[3];
//        tab[2] = new int[2];
//        tab[3] = new int[1];
//
//        int i = 0;
//        int j = 0;
//        while (i < tab.length && j < tab[i].length)
//        i++;
//        j++;
//        int licznik = 1;
//        tab[i][j] = licznik++;

        //Ćwiczenie 12.3.
        //Utwórz tablicę liczb typu int zaprezentowaną na rysunku 2.43.
        // Wypełnij kolejne komórki wartościami malejącymi od 10 do 1. Do utworzenia tablicy i wypełnienia jej
        //danymi wykorzystaj pętle typu for.

//        int[][] tab = new int[4][];
//        tab[0] = new int[1];
//        tab[1] = new int[2];
//        tab[2] = new int[3];
//        tab[3] = new int[4];
//
//        int licznik = 1;
//        for (int i = 0; i < tab.length; i++) {
//            for (int j = 0; j < tab[i].length; j++){
//                tab[i][j] = licznik++;
//            }
//        }
//
//        for (int i =0; i<tab.length; i++) {
//            for (int j = 0; j<tab[i].length; j++) {
//                System.out.print(tab[i][j] + " " );
//            }
//
//            System.out.println("");
//        }

        //Ćwiczenie 12.4.
        //Utwórz trójwymiarową tablicę dla wartości typu int (będzie to struktura, którą można
        //sobie wyobrazić jako prostopadłościan składający się z sześcianów; każdy sześcian będzie
        //pojedynczą komórką). Powinna umożliwiać przechowywanie trzydziestu wartości.
        //Poszczególne komórki wypełnij liczbami od 30 do 59. Zawartość wyświetl na ekranie.
        //Zastanów się, ile wersji tego typu tablicy można utworzyć.

//        int a = 10;
//        int b = 10;
//        int c = 10;
//
//        int[][][] tab = new int[10][10][10];
//
//        int licznik = 0;
//        for (int i = 0; i < tab.length; i++) {
//            for (int j = 0; j <tab[i].length; j++){
//                for (int k = 0; k <tab[j].length; k++){
//                    tab[i][j][k] = licznik++;
//                }
//            }
//        }
//
//        for (int i = 0; i < tab.length; i++) {
//            for (int j = 0; j < tab[i].length; j++) {
//                for (int k = 0; k < tab[j].length; k++) {
//                    System.out.print(i + " " + j + " " + k);
//                    System.out.println(tab[i][j][k]);
//
//                }
//            }
//        }

        //Ćwiczenie 12.5.
        //Utwórz tablicę dwuwymiarową, w której liczba komórek w kolejnych rzędach będzie
        //równa dziesięciu kolejnym wartościom ciągu Fibonacciego, poczynając od elementu
        //o wartości 1 (1, 1, 2, 3, 5 itd.). Wartość każdej komórki powinna być jej numerem w danym wierszu w kolejności malejącej (czyli dla wiersza o długości trzech komórek kolejne
        //wartości to 3, 2, 1). Zwartość tablicy wyświetl na ekranie.


        //Ćwiczenie 12.6.
        //Zmodyfikuj kod z ćwiczenia 12.5 w taki sposób, aby w kolejnych rzędach znajdowała się
        //liczba komórek wynikająca z kolejnych wartości ciągu Fibonacciego, ale tylko tych
        //nieparzystych (czyli 1, 1, 3, 5, 13, 21 itd.)
    }
}
