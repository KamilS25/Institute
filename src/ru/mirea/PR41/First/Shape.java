package ru.mirea.PR41.First;

public class Shape {
    public String type;

    public Shape(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public double getArea(){
        return 0;
    }

    public double getPerimetr(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "type='" + type + '\'' +
                '}';
    }
}
