package ru.mirea.PR27Hash;

import java.util.Hashtable;

public class HashTableTester {

    public static void main(String[] args) {
        Hashtable<Integer, Student> table = new Hashtable<>();
        Dictionary dict = new Dictionary();
        Student st1 = new Student("Ivan Ivanov", "547-21");
        Student st2 = new Student("Danil Petrov", "651-10");
        Student st3 = new Student("Petr Sidorov", "984-34");
        Student st4 = new Student("Denis Lobov", "897-25");
        Student st5 = new Student("Igor Petrov", "123-45");


        dict.hashTabAdd(125, st1, table);
        dict.hashTabAdd(51, st2, table);
        dict.hashTabAdd(12, st3, table);
        dict.hashTabAdd(451, st4, table);
        dict.hashTabAdd(47, st5, table);

        dict.hashTabLookup(table);


        dict.hashTabDelete(table, 12);
        dict.hashTabDelete(table, 125);

        System.out.println();
        System.out.println();

        dict.hashTabLookup(table);
    }

}
