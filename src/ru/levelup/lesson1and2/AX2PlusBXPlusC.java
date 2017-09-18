package ru.levelup.lesson1and2;

import java.util.Scanner;

public class AX2PlusBXPlusC {
    public static void main(String[] args) {
        int a, b, c;
        double x1, x2;
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter A: ");
        a = reader.nextInt();

        System.out.println("Enter B: ");
        b = reader.nextInt();

        System.out.println("Enter C: ");
        c = reader.nextInt();

        x1 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2 * a);
        x2 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2 * a);

        System.out.println("X1 equals: " + x1 + "\tX2 equals: " + x2);
    }
}