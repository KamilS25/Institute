package ru.mirea.PR4.Eight;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        width = 4;
        length = 8;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String getColor() {
        return color;
    }
    @Override
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public boolean isFilled() {
        return filled;
    }
    @Override
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "Length: " + length +
                "Width: " + width +
                "Area: " + getArea() +
                "Perimeter: " + getPerimeter() +
                "}";
    }
}
