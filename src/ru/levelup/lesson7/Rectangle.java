package ru.levelup.lesson7;

public class Rectangle {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(
                new Point(2,5),
                new Point(4, 3)
        );

        Rectangle r2 = new Rectangle(
                new Point(1,6),
                new Point(3, 4)
        );

        System.out.println(Rectangle.checkOverlap(r1, r2));
    }

    public Rectangle(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    private Point point1;
    private Point point2;

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public static boolean checkOverlap(Rectangle r1, Rectangle r2) {
        return
                r1.getPoint1().getX() < r2.getPoint2().getX()
                && r1.getPoint2().getX() > r2.getPoint1().getX()
                && r1.getPoint1().getY() > r2.getPoint2().getY()
                && r1.getPoint2().getY() < r2.getPoint1().getY();
    }
}


