package ru.levelup.lesson1and2;

public class PrimeEratosthenes {
    public static void main(String[] args) {
        System.out.print("Prime numbers are: 0\t1\t");

        int number = 10000;

        // Filling the sieve with true
        // sieve[0] does not count for better representation
        int sieveSize = number + 1;
        boolean[] sieve = new boolean[sieveSize];
        for (int i = 1; i < sieveSize; i++) sieve[i] = true;

        // Leaving only prime numbers true
        for (int i = 2; i <= number; i++) {
            if (sieve[i]) {
                for (int j = i * i; j <= number; j += i) {
                    sieve[j] = false;
                }
            }
        }

        for (int i = 2; i <= number; i++) {
            if (sieve[i]) System.out.print(i + "\t");
        }
    }
}
