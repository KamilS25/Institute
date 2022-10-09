package ru.mirea.PR41.Third;

public class Person {

    String fullName;
    int age;

    public Person() {
        fullName = "Cristiano Ronaldo";
        age = 37;
    }

    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        System.out.println(fullName + " идёт.");
    }

    public void talk(){
        System.out.printf("%s говорит.\n", fullName);
    }


}
