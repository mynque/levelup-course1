package Lesson1and2;

import java.util.Arrays;
import java.util.Random;

public class RandomArrayMaxMin {
    public static void main(String[] args) {

        int[][] arr = new int[10][10];
        int arrMin = 0, arrMax = 0;

        Random random = new Random();

        // Filling arr with random numbers
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }

        // Finding arr min and max
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                // Set both minimum and maximum the the first value
                if (i == 0 && j == 0) {
                    arrMin = arr[i][j];
                    arrMax = arr[i][j];
                }

                if (arr[i][j] > arrMax) {
                    arrMax = arr[i][j];
                } else if (arrMin > arr[i][j]) {
                    arrMin = arr[i][j];
                }
            }
        }

        System.out.println(Arrays.deepToString(arr) + "\n");

        System.out.println("Minimum is: " + arrMin + "\tMaximum is: " + arrMax);
    }
}
