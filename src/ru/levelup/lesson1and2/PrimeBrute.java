package ru.levelup.lesson1and2;

public class PrimeBrute {
    public static void main(String[] args) {
        System.out.print("Prime numbers are: ");

        for (int i = 0; i < 10000; i++) {
            int counter = 0;

            // 0 and 1 are not prime, skipping
            if (i == 0 || i == 1) {
                continue;
            }

            // Counting divisors for each number
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }

            // The number is prime if there's only one divisor
            if (counter == 1) {
                System.out.print(i + "\t");
            }
        }
    }
}