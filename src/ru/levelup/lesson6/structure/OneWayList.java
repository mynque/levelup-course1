package ru.levelup.lesson6.structure;

public class OneWayList<T> implements CustomList<T> {

    private Element head;

    private Element tail;

    private class Element {
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
}
