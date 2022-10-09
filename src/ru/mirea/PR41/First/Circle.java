package ru.mirea.PR41.First;

public class Circle extends Shape {

    public double R;

    public Circle(String type, double R) {
        super(type);
        this.R = R;
    }

    @Override
    public double getArea(){
        return Math.PI*Math.pow(R, 2);
    }

    @Override
    public double getPerimetr(){
        return 2*Math.PI*R;
    }

    @Override
    public String getType(){
        return type;
    }

    @Override
    public String toString() {
        return type + "{" +
                "R=" + R +
                "}" + "\n" + "Area = " + getArea() + "\n" + getPerimetr();
    }
}
