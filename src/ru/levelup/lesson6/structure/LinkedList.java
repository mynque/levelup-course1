package ru.levelup.lesson6.structure;

public class LinkedList<T> implements CustomList<T> {

    protected Element head;

    protected Element tail;

    protected class Element {
        Element next;
        Element prev;
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
            tail = element;
        } else {
//            Element current = head;
//            while (current.next != null) {
//                current = current.next;
//            }
//            current.next = element;
            tail.next = element;
            element.prev = tail;
            tail = element;
        }
    }

    @Override
    public void delete(int index) {
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
