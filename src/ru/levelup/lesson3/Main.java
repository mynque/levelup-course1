package ru.levelup.lesson3;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(1002, 140, "Ford");
        car.setWeight(-12);
        System.out.println(car.getWeight());
    }
}
