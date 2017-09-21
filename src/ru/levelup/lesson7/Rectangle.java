package ru.levelup.lesson7;

public class Rectangle {

    public static void main(String[] args) {
    }

    public Rectangle(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public class Point {
        private Point (long x, long y) {
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

    private Point point1;
    private Point point2;

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public static boolean checkInterception(Rectangle r1, Rectangle r2) {
        return
                r1.getPoint1().getY() < r2.getPoint2().getY()
                || r1.getPoint2().getY() > r2.getPoint1().getY()
                || r1.getPoint2().getX() < r2.getPoint1().getX()
                || r1.getPoint1().getX() > r2.getPoint2().getX();
    }
}
