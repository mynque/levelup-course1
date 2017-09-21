package ru.levelup.lesson7;

public class Point {
    public Point (long x, long y) {
        this.x = x;
        this.y = y;
    }

    private long x, y;

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }
}