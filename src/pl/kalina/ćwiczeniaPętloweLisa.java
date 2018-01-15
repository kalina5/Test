package pl.kalina;

public class ćwiczeniaPętloweLisa {
    public static void main(String[] args) {
        //Ćwiczenie 9.1.
        //        Wykorzystując pętlę for, napisz program, który wyświetli liczby całkowite od 1 do 10
        //          podzielne przez 2.

/*        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0)
                System.out.print(" " + i + " ");
        }*/

        // Pętla nieparzystych od 1 do 10

/*        for (int a = 0; a < 10; a++) {
            if (a % 2 != 0)
                System.out.print("  " + a + "  ");
        }*/

        // Ćwiczenie 9.2.
        //Nie zmieniając żadnej instrukcji wewnątrz pętli, zmodyfikuj kod z listingu 2.28 w taki
        //sposób, aby był funkcjonalnym odpowiednikiem kodu z listingu 2.29.

        // listing 2.28
        // int i = 0;
        // while(i < 10){
        // System.out.println("Pętle w Javie");}
        // i++;}}

        // listing 2.29
/*        int i = 0;
          while(i++ < 10){
          System.out.println("Pętle w Javie");
          }}
          }*/

       /*

       int i = 0;
        while (i++ < 10) {
            System.out.print( "Pętle w Javie  ");
        }

        */

        //Ćwiczenie 9.3.
        // Wykorzystując pętlę while, napisz program, który wyświetli liczby całkowite od 0 do 20
        // niepodzielne przez 3. 1,2,[3],4,5,[6],7,8,[9],10,11,[12],13,14,[15],16,17,[18],19,20


/*        int i = 0;

        while (i < 20) {
            if (i % 3 != 0)
                System.out.print(" " + i + " ");
            i++;
        }*/




        /*Ćwiczenie 9.4.
                Zmodyfikuj kod z listingu 2.30 w taki sposób, aby w wyrażeniu warunkowym pętli
        do…while zamiast operatora < wykorzystać <=.*/
        // listing 2.30
        //
        // int i = 0;
        //do {
        //    System.out.println("[i = " + i + "] Pętle w Javie");
        //}
        //while (i++ < 9);

        /*

        int i = 0;

        do {
            System.out.println("[i = " + i + "] Pętle w Javie");
        }
        while (i++ <= 8);
        */

        /*
        Ćwiczenie 9.5.

                Napisz program, który wyświetli na ekranie liczby od 1 do 20 i zaznaczy przy każdej
        z nich, czy jest to liczba parzysta, czy nieparzysta. Zrób to:
        a) wykorzystując pętlę for,
        b) wykorzystując pętlę while,
        c) wykorzystując pętlę do…while */

        // podpunkt a )
/*        for (int i = 1; i < 20; i++) {
            if (i % 2 == 0)
                System.out.println("O to parzysta cyfra: " + i);
            else
                System.out.println("O to nieparzysta cyfra: " + i);
        }*/

        // podpunkt b)
/*        int i = 0;
        while (i++ < 20) {

            if (i % 2 == 0)
                System.out.println("O to parzysta cyfra: " + i);
            else
                System.out.println("O to nieparzysta cyfra: " + i);
        }*/

        // podpunkt c)

/*        int i = 1;
        do {
            if (i % 2 == 0)
                System.out.println("O to parzysta cyfra: " + i);
            else
                System.out.println("O to nieparzysta cyfra: " + i);

        }

        while (i++ < 20);*/
    }
}




