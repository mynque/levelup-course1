package ru.levelup.lesson6.structure;

public class Queue<T> extends LinkedList<T> {

    public void enqueue(T value) {
        this.add(value);
    }

    public void dequeue() {
        if (head == null) {
            System.out.println("Empty queue");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            System.out.println("Queue is emptied");
            return;
        }

        head = head.next;
        head.prev = null;
    }
}
