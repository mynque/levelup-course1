package ru.levelup.lesson6.structure;

import sun.invoke.empty.Empty;

public class Stack<T> extends LinkedList<T> {

    public void push(T value) {
        this.add(value);
    }

    public void pop() throws EmptyStackException {

        if (head == null) throw new EmptyStackException("The stack is empty!");

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
