package ru.levelup.lesson3;

import java.util.Random;

public class ArrayUtils {

    public static int min(int[] array) {
        int min = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == 0) min = array[0];
            if (array[i] < min) min = array[i];
        }

        return min;
    }

    public static int max(int[] array) {

        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == 0) max = array[0];
            if (array[i] > max) max = array[i];
        }

        return max;
    }

    public static double average(int[] array) {

        double average = 0;

        for (int i = 0; i < array.length; i++) {
            average += array[i];
            if (i == (array.length - 1)) {
                average /= array.length;
            }
        }

        return average;
    }

    public static int[] bubbleSort(int[] array) {

        for (int a = 1; a < array.length; a++) {
            for (int b = array.length - 1; b >= a; b--) {
                if (array[b - 1] > array[b]) {
                    int t = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = t;
                }
            }
        }

        return array;
    }

    public static int[] bubbleSortReverse(int[] array1) {

        for (int a = 1; a < array1.length; a++) {
            for (int b = array1.length - 1; b >= a; b--) {
                if (array1[b - 1] < array1[b]) {
                    int t = array1[b - 1];
                    array1[b - 1] = array1[b];
                    array1[b] = t;
                }
            }
        }

        return array1;
    }

    public static int[] generateArray() {

        Random random = new Random();
        int[] arr = new int[5 + random.nextInt(25)];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        return arr;
    }
}