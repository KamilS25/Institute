package ru.mirea.PR41.First;

public class Square extends Shape{

    double a;

    public Square(String type, double a) {
        super(type);
        this.a = a;
    }

    @Override
    public double getArea() {
        return Math.pow(a, 2);
    }

    @Override
    public double getPerimetr() {
        return a*4;
    }

    @Override
    public String toString() {
        return type + "{" +
                "a=" + a +
                '}'+ "\n" + "Area = " + getArea() + "\n" + "Perimetr = " + getPerimetr();
    }
}
