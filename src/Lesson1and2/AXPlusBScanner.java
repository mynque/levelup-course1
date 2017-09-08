package Lesson1and2;

import java.util.Scanner;

public class AXPlusBScanner {
    public static void main(String[] args) {
        int a, b;

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter A: ");
        a = reader.nextInt();

        System.out.println("Enter B: ");
        b = reader.nextInt();

        double x = -b/a;

        System.out.println("X equals: " + x);
    }
}
