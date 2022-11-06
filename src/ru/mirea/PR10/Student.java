package ru.mirea.PR10;

public class Student implements Comparable<Student> {
    private String name, surname;
    private String specialization, group;
    private int course, exscores;

    public Student(String name, String specialization, String surname, String group, int course, int exscores){
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.course = course;
        this.exscores = exscores;
    }

    public int getexScores() {
        return exscores;
    }

    public void setexScores(int scores) {
        this.exscores = scores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", specialization='" + specialization + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", exscores=" + exscores +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.exscores < o.getexScores() ? -1: this.exscores == o.getexScores() ? 0:1;
    }
}
