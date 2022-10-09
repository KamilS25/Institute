package ru.mirea.PR41.Third;

public class Tester {
    public static void main(String[] args) {
        Person pers1 = new Person();
        Person pers2 = new Person("Lionel Messi", 36);

        pers1.talk();
        pers2.move();
    }
}
