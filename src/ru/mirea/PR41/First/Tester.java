package ru.mirea.PR41.First;

public class Tester {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle("Rectangle", 5, 2);
        Square sq = new Square("Square", 7);
        Circle circ = new Circle("Circle", 4.5);

        System.out.println(rect);
        System.out.println(sq);
        System.out.println(circ);
    }
}
