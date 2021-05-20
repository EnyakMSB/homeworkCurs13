package exceptions.exercises.birth;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BirthYearAPP {
    public void run() {
        int age = -1;
        Scanner scanner = new Scanner(System.in);
        BirthYearCalculator birthYearCalculator = new BirthYearCalculator();
        do {
            System.out.print("Introdu varsta: ");

            try {
                age = scanner.nextInt();
                System.out.println("Anul nasterii este: " + birthYearCalculator.calculateYear(age));
            } catch (InvalidAgeException ex) {
                System.out.println("Varsta incorecta! introduceti varsta corect!");
            } catch (InputMismatchException ime) {
                System.out.println("Varsta incorecta! introduceti varsta corect!");
                scanner = new Scanner(System.in);
            }
        } while (age != -1);
    }

    public static void main(String[] args) {
        new BirthYearAPP().run();
    }
}
