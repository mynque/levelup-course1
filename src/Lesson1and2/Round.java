package Lesson1and2;

import java.util.Scanner;

public class Round {
    public static void main(String[] args) {

        double number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        number = scanner.nextDouble();

        System.out.println("\nLesson1and2.Round of " + number + " is " + Math.round(number));
    }
}
