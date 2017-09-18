package ru.levelup.lesson6;

public class GenericExample<T extends Number> {

    public void sort(T[] array) {}

    public void sortO(Object[] array) {
        for (Object e1 : array) {
            User user = (User) e1;
        }
    }

    public <E> void sort1(E[] array, Class clazz) {}

    public static void main(String[] args) {
        new GenericExample<Integer>().sortO(new Object[] {1, "String"});
        new GenericExample<>().sort1(new Integer[] {1, 2}, Integer.class);
    }

//    public void sort(int[] array) {
//        // sort
//    }
//
//    public void sort(double[] array) {}
//
//    public void sort(Object[] array) {}
}
