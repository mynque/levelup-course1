package Lesson3;

public class Car {

    private int weight;
    int maxSpeed;
    String name;

    Car(int weight, int maxSpeed, String name) {
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.name = name;
    }

    Car(int maxSpeed, String name) {
        this.weight = 1000;
        this.maxSpeed = maxSpeed;
        this.name = name;
    }

    Car(String name) {
        this.weight = 0;
        this.maxSpeed = 0;
        this.name = name;
    }

    void go() {
        System.out.println("GOOOOOOO");
    }

    void go(String destination) {
        System.out.println("Go to " + destination);
    }

    void go(String destination, int averageSpeed) {
        System.out.println("Go to " + destination + " at " + averageSpeed + "kmh");
    }

    int getDoubleMaxSpeed() {
        return this.maxSpeed * 2;
    }

    public void setWeight(int weight) {
        this.weight = weight < 0 ? 0 : weight;
    }

    public int getWeight() {
        return this.weight;
    }
}
