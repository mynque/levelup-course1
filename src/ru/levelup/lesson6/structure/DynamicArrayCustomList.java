package ru.levelup.lesson6.structure;

public class DynamicArrayCustomList<T> implements CustomList<T> {

    private Object[] array;
    private int size;

    public DynamicArrayCustomList() {
        this(5);
    }

    public DynamicArrayCustomList(int initialLength) {
        this.array = new Object[initialLength];
        this.size = 0;
    }

    @Override
    public void add(T value) {
        if (size == array.length) {
            // Increase length
            System.out.println("Increase length. Current size: " + size + ", new size = " + array.length * 1.5);
            Object[] oldArray = array;
            array = new Object[(int) (array.length * 1.5)];
            System.arraycopy(oldArray, 0, array, 0, size);
        }
        // array[size] = value;
        // size++;
        array[size++] = value;
    }

    @Override
    public void delete(int index) {
        if (index < 0) {
            System.out.println("Index should be >= 0");
            return;
        }
        if (index >= size) {
            System.out.println("No such an index");
            return;
        }
        System.arraycopy(array, index + 1, array, index, size - (index + 1));
        array[size - 1] = null;
        size--;
    }

    @Override
    public void printOut() {
        for (Object element : array) {
            if (element == null) return;
            System.out.println(element.toString());
        }
    }
}
