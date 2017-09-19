package ru.levelup.lesson6.structure;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        DynamicArrayCustomList<String> list = new DynamicArrayCustomList<>(5);
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        list.delete(3);

        list.printOut();


//        OneWayList<String> aList = new OneWayList<>();
//        aList.add("1");
//        aList.add("2");
//        aList.add("3");
//
//        aList.delete(2);
//
//        aList.printOut();

//        Queue<String> queue = new Queue<>();
//        queue.enqueue("1");
//        queue.enqueue("2");
//        queue.enqueue("3");
//
//        queue.dequeue();
//        queue.dequeue();
//        queue.printOut();
//
//        Stack<String> stack = new Stack<>();
//
//        stack.push("1");
//        stack.push("2");
//        stack.push("3");
//
//        stack.pop();
//        stack.pop();
//
//        stack.printOut();

    }
}
