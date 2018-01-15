package pl.kalina;

public class ćwiczeniaTablicoweLisa {
    public static void main(String[] args) {

        /*
        Ćwiczenie 11.2.
        Napisz program, w którym zostanie utworzona 10-elementowa tablica liczb typu int.
        Użyj pętli for do wypełnienia jej danymi w taki sposób, aby w kolejnych komórkach
        znalazły się liczby od 10 do 100 (czyli 10, 20, 30 itd.). Zawartość tablicy wyświetl na
        ekranie.
        */

/*        int[] tablica = new int[10];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = 10 * i + 10;
        }*/
//        for (int a : tablica)
//            System.out.print(a + "\t");
/*        for ( int a = 0; a < tablica.length; a++) {
            System.out.println(tablica[a]);
        }*/

        // ZADANIE OD KUBSONA
        // K1. Stwórz tablicę jednowymiarową przechowującą nazwy dni tygodnia.

/*        String[] weekDays = new String[7];
        weekDays[0] = "Poniedziałek";
        weekDays[1] = "Wtorek";
        weekDays[2] = "Sroda";
        weekDays[3] = "Czwartek";
        weekDays[4] = "Piątek";
        weekDays[5] = "Sobota";
        weekDays[6] = "Niedziela";*/

/*        for (String x : weekDays)
            System.out.println(x);*/

/*for (int a = 0; a<weekDays.length; a++)
    System.out.println(weekDays[a]);*/

// ZADANIE OD KUBSONA
        // K2. Stwórz tablicę jednowymiarową i wypełnij ją elementami od 0 do 100.
/*
        int table[] = new int[101];
        for (int i = 0; i < table.length; i++) {
            table[i] = i;
        }
*//*
        for (int x : table) {
            System.out.println(x);
        }*//*

        for (int x = 0; x < table.length; x++) {
            System.out.println(table[x]);
        }*/


        // ZADANIE OD KUBSONA
        // K3. Stwórz tablicę jednowymiarową 10-elementową i wypełnij ją elementami od 100 do 1000.

/*        int[] tablex = new int[10];
        for (int k = 0; k < tablex.length; k++) {
            tablex[k] = 100 * k + 100;
        }
        for (int g : tablex) {
            System.out.print(g + "\t");
        }

        for (int i = 0; i < tablex.length; i++) {
            System.out.print(tablex[i]);
        }*/

        //Ćwiczenie 11.3.
        /*        Napisz program, w którym zostanie utworzona 20-elementowa tablica typu boolean.
                Komórkom o indeksie parzystym przypisz wartość true, a o indeksie nieparzystym —
        false (zero możesz uznać za wartość parzystą). Zawartość tablicy wyświetl na ekranie */

/*        boolean tablica[] = new boolean[20];
        for (int i = 0; i < tablica.length; i++)
            tablica[i] = i % 2 == 0;

        for (int a = 0; a < tablica.length; a++)
        System.out.println("[" + a + "] = " + tablica[a]);*/

        //TODO praca domowa 15.01.2018!!!
        //Cwiczenie 11.5
        // Napisz program, w którym powstanie 100 elementowa tablica typu Int
        // Komórkom o indeksach 0, 10, 20 ,30 , 40, ... , 90 przypisz wartość 0.
        // Komórkom o indeksach 1, 11, 21, 31, 41,... ,91 przypisz wartość 1.
        // Komórkom o indeksach 2, 22, 32, 42, ..., 92 przypisz wartość 2
        // itd.

/*        int[] t = new int[100];

        for (int i = 0; i < t.length; i++) {
            if ( i % 10 == 0)
                t[i] = 0;
            //String b = String.valueOf(i).;
            else if (10 * i + 1 == 10 * i + 1)
                t[i] = 1;
        }

for (int x = 0; x < t.length; x++)
    System.out.println("[" + x + "]" + "=" + t[x]);*/


        //Cwiczenie 11. 6 Tablica typu char, przechowywująca znaki od a do z, 26 - elementowa

  /*      char t[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (char x : t)
            System.out.println(x);*/


        // Cwiczenie 11.7
        // Zmodyfikować program z listingu 2.41 , tak, aby był z pętla while
        // listing 2.41
/*        short tablica[] = new short[10];
        for (short i = 0; i < tablica.length; i++) {
            tablica[i] = i;
        }
        for (short i = 0; i < tablica.length; i++) {
            System.out.println("tablica[" + i + "] = " + tablica[i]);
        }
    }*/

/*        short tablica[] = new short[10];
        //for (short i = 0; i < tablica.length; i++)
        short i = 0;
        while ( i < tablica.length) {
            tablica[i] = i;
            i++;
        }
        int e = 0;
        while (e < 10) {
            System.out.println("tablica[" + e + "] = " + tablica[e]);
            e++;
        }*/


    }
}

