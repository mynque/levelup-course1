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

            // If it's the first element
            if (counter == 0 && index == 0) {
                // And it's the only element, reset head
                if (current.next == null) {
                    head = null;
                    return;
                } else {
                    // If there's a following element, set head to it
                    head = head.next;
                    return;
                }
            }

            // If it's the last element, set previous.next to null
            if (current.next == null) {
                prev.next = null;
            } else {
                // If it's an element in between, set prev.next to prev.next.next
                prev.next = current.next;
            }
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
