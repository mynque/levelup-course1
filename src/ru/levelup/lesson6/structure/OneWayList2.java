package ru.levelup.lesson6.structure;

public class OneWayList2<T> implements CustomList<T> {

    private Element head;
    private int size;

    private class Element {
        Element next;
        T value;

        Element(T value) {
            this.value = value;
        }
    }

    @Override
    public void add(T value) {
        Element element = new Element(value);
        if (head == null) {
            head = element;
        } else {
            Element current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = element;
        }
        size++;
    }

    @Override
    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Index must be positive " +
                    "and less than size.");
        }
        int currentIndex = 0;
        Element current = head;
        Element prev = null;

        if (index == 0) {
            head = head.next;
        } else {
            while (currentIndex != index) {
                prev = current;
                current = current.next;
                currentIndex++;
            }

            prev.next = current.next;
        }
        size--;
    }

    public void printOut() {
        Element current = head;
        do {
            System.out.println(current.value);
            current = current.next;
        }
        while (current != null);
    }
}
