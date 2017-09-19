package ru.levelup.lesson6.structure;

public class Stack<T> extends LinkedList<T> {

    public void push(T value) {
        this.add(value);
    }

    public void pop() {
        if (head == null) {
            System.out.println("Empty stack");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            System.out.println("Stack is emptied");
            return;
        }

        tail.prev.next = null;
        tail = tail.prev;
    }
}
