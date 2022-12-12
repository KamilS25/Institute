package ru.mirea.PR28TreeSet;

public class Student implements Comparable<Student> {
    String name;
    String surname;

    Student(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        return this.getSurname().compareTo(s.getSurname());
    }
}
