package Lesson1and2;

public class HelloWorldCycle {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            System.out.println("Hello World!");
        }

        int i = 1;
        while (i <= 4) {
            System.out.println("Hello World!");
            i++;
        }

        i = 1;

        do {
            System.out.println("Hello World!");
            i++;
        } while (i <= 4);
    }
}
