package ru.mirea.PR41.First;

public class Rectangle extends Shape{

    double a, b;

    public Rectangle(String type, double a, double b) {
        super(type);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public double getPerimetr() {
        return (a+b)*2;
    }

    @Override
    public String toString() {
        return type + "{" +
                "a=" + a +
                ", b=" + b +
                '}' + "\n" + "Area = " + getArea() + "\n" + "Perimetr = " + getPerimetr();
    }
}
