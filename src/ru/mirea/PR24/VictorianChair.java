package ru.mirea.PR24;

public class VictorianChair implements Chair {
    private int age;

    VictorianChair(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void sit() {
        System.out.println("This Victorian chair is great!");
    }
}
