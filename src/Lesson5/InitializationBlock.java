package Lesson5;

public class InitializationBlock {
    private String name;

    public InitializationBlock() {
        System.out.println("Constructor");
    }

    static {
        System.out.println("Second");
    }

    {
        name = "Dmitry";
        System.out.println("Name");
    }

    static {
        System.out.println("First");
    }
}
