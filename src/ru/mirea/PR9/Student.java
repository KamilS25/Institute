package ru.mirea.PR9;

import java.util.Arrays;

public class Student implements Comparable<Student>{

    private final int id;
    private final String name;

    private final int examsScore;


    public Student(int id, String name, int examsScore){
        this.id = id;
        this.name = name;
        this.examsScore = examsScore;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getExamsScore() {
        return examsScore;
    }

    public static void insertionSort(Comparable[] list){

        for (int left = 0; left < list.length; left++){

            Comparable value = list[left];
            int i = left - 1;

            for(; i >= 0; i--){

                if (value.compareTo(list[i]) < 0){
                    list[i + 1] = list[i];
                }
                else{
                    break;
                }
            }
            list[i+1] = value;
        }
    }

    public static void main(String[] args) {
        Comparable[] idNumb = {
                new Student(9, "Dima", 5),
                new Student(25, "Kamil", 5),
                new Student(1, "Olya", 5),
                new Student(2, "Nastya", 5),
                new Student(19, "Angelina", 5)
        };

        insertionSort(idNumb);
        System.out.println(Arrays.toString(idNumb));
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' + ", " + "examsScores = " + examsScore +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        return this.getId() < s.getId() ? -1 : this.getId() == s.getId() ? 0 : 1;
    }
}
