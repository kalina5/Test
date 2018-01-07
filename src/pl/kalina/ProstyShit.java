package pl.kalina;

import java.util.Random;
import java.util.Scanner;

public class ProstyShit {
    public static void main(String[] args) {
        System.out.println("Drogi użytkowniku, maszyna wylosuje liter, ile wpiszesz!");
        System.out.println("Wpisz liter, ile potrzebujesz:  ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println("Wpisz maks liter szczęścia: ");
        int userInputMaks = scanner.nextInt();

        if (!validate(userInput)) {
            System.out.println("Zła liczba, Ty durniu!!! Koniec programu");
            System.exit(0);
        }

        Random random = new Random();
        int[] tab = new int[userInput];
        for (int a = 0; a < tab.length; a++) {
            tab[a] = random.nextInt(userInputMaks) + 1;
            if (userInput + 1 < userInputMaks)
                System.out.print(tab[a] + "\t\t");
            else
                System.out.println(tab[a]);
        }

        //tworzenie sumy szczęścia na dzisiaj
        int wynik = 0;
        for (int i = 0; i < tab.length; i++) {
            wynik = wynik + tab[i];
            System.out.println(wynik);
        }
    }


    private static boolean validate(float userInput) {
        boolean status = false;

        if (userInput >= -50 && userInput < -5)
            status = true;

        if (userInput >= 6 && userInput < 10)
            status = true;

        if (userInput > 11 && userInput <= 37)
            status = true;

        if (userInput > 40 && userInput <= 123)
            status = true;

        if (userInput > 135 && userInput <= 140)
            status = true;

        return status;

    }
}
