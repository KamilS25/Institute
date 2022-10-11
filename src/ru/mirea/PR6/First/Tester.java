package ru.mirea.PR6.First;

public class Tester {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 2, 1);
        MovableCircle circle = new MovableCircle(5, 0, 0, 1, 1);
        MovableRectangle rectangle = new MovableRectangle(0, 0, 3, -2, 1, 1);

        System.out.println(point);
        System.out.println(circle);
        System.out.println(rectangle);

        point.moveDown();
        point.moveRight();
        point.moveRight();
        System.out.println(point);

        circle.moveLeft();
        circle.moveUp();
        System.out.println(circle);

        rectangle.checkSpeed();
        rectangle.moveRight();
        rectangle.moveRight();
        rectangle.moveUp();
        System.out.println(rectangle);
    }
}
