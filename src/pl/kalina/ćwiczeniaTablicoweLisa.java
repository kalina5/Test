package pl.kalina;

public class ćwiczeniaTablicoweLisa {
    public static void main(String[] args) {
        //Ćwiczenie 11.2.
        /*        Napisz program, w którym zostanie utworzona 10-elementowa tablica liczb typu int.
                Użyj pętli for do wypełnienia jej danymi w taki sposób, aby w kolejnych komórkach
        znalazły się liczby od 10 do 100 (czyli 10, 20, 30 itd.). Zawartość tablicy wyświetl na
        ekranie.  */

        int[] tablica = new int[10];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = 10 * i + 10;
        }
        for (int a : tablica)
            System.out.print(a + "\t");
        /*for (int i = 0; i < tablica.length; i++) {
            System.out.print(i);
        }*/

        //Ćwiczenie 11.3.
        /*        Napisz program, w którym zostanie utworzona 20-elementowa tablica typu boolean.
                Komórkom o indeksie parzystym przypisz wartość true, a o indeksie nieparzystym —
        false (zero możesz uznać za wartość parzystą). Zawartość tablicy wyświetl na ekranie */

        /*boolean tablica[] = new boolean[20];
        for (int i = 0; i <tablica.length; i++) {
            tablica[i] = false;
        }
        for (boolean a = true)
        }*/
    }
}
