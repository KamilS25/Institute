package ru.mirea.PR28TreeSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {

    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();


        Student st1 = new Student("Ivan", "Ivanov");
        Student st2 = new Student("Dima", "Danilov");
        Student st3 = new Student("Angelina", "Angelova");

        students.add(st1);
        students.add(st2);
        students.add(st3);

        System.out.println(students);

        Set<Student> studentTreeSet = new TreeSet<>(students);

        System.out.println();

        System.out.println(studentTreeSet);


    }

}
