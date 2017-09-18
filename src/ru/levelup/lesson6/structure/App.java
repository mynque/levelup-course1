package ru.levelup.lesson6.structure;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
//        DynamicArrayCustomList<String> list = new DynamicArrayCustomList<>(5);
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        list.add("4");
//
//        list.delete(0);
//
//        for (Object element : list.getArray()) {
//            if (element != null) System.out.println(element);
//        }


/*        OneWayList<String> aList = new OneWayList<>();
        aList.add("one");

        aList.delete(0);

        aList.printOut();*/

//    Queue<String> queue = new Queue<>();
//    queue.enqueue("1");
//
//    queue.dequeue();
//    queue.printOut();

        Stack<String> stack = new Stack<>();

        stack.push("1");
        stack.push("2");
        stack.push("3");

        stack.pop();

        stack.printOut();

    }
}
