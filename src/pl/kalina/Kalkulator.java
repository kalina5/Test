package pl.kalina;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Uzytkowniku, będzie teraz dodawanie");
        System.out.println("Wybierz pierwszą liczbę do dodawania:  ");
        System.out.print("a =  ");
        int a = scanner.nextInt();

        System.out.println("Wybierz drugą liczbę, żeby dodać do tej pierwszej:  ");
        System.out.print("b =  ");
        int b = scanner.nextInt();

        System.out.println("O to Twój wynik dodawania:  ");
        System.out.print(a + b);
    }
}
