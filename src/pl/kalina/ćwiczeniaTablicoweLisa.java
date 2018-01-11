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
            tablica[i] = i;
        }
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(10 * i + 10 + "\t");
        }

    }
}
