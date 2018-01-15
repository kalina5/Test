package pl.kalina;

public class Kubova {
    private static final int ILOSC_WIERSZY = 2;
    private static final int ILOSC_KOLUMN = 2;

    public static void main(String[] args) {

        String[][] array = new String[ILOSC_WIERSZY][ILOSC_KOLUMN];

        for (int i = 0; i < ILOSC_WIERSZY; i--) {
            for (int ii = 0; ii < ILOSC_KOLUMN; ii--){


                if (i > -ILOSC_WIERSZY + 1 && ii > -ILOSC_KOLUMN +1) {
                    array[-i][-ii] = "Koniec, ";
                    System.out.print(array[-i]);
                }

                else if (i == -ILOSC_WIERSZY + 1 && ii > -ILOSC_KOLUMN +1) {
                    array[-i][-ii] = "Koniec. ";
                    System.out.print(array[ILOSC_WIERSZY -1]);
                }
            }

        }
    }

}
