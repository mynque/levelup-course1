package ru.levelup.lesson6.structure;

public class OneWayList<T> implements CustomList<T> {

    private Element head;

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
    }

    @Override
    public void delete(int index) {
        if (index < 0) {
            System.out.println("Index should be >= 0");
            return;
        }

        if (head == null) {
            System.out.println("The list is empty!");
            return;
        }

        if (index == 0) {
            head = head.next;
        } else {

            Element current = head;
            Element prev = null;
            int counter = 0;

            // Counting elements up to index
            while (counter < index && current.next != null) {
                prev = current;
                current = current.next;
                counter++;
            }

            // If there are less element than index, show an error
            if (counter < index) {
                System.out.println("No such an index");
                return;
            }
            prev.next = current.next;
        }
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
