package ru.mirea.PR9;

import java.util.Arrays;

public class SortingStudentsByGPA extends Student implements Comparable<Student>{

    public SortingStudentsByGPA(int id, String name, int examsScore) {
        super(id, name, examsScore);
    }

    public static void quickSort(Comparable[] sortArr, int low, int high) {

        if (sortArr.length == 0 || low >= high)
            return;

        int middle = low + (high - low) / 2;
        Comparable border = sortArr[middle];

        int i = low, j = high;
        while (i <= j) {
            while (sortArr[j].compareTo(border) < 0) j--;
            while (sortArr[i].compareTo(border) > 0) i++;
            if (i <= j) {
                Comparable swap = sortArr[i];
                sortArr[i] = sortArr[j];
                sortArr[j] = swap;
                i++;
                j--;
            }
        }

        if (low < j) quickSort(sortArr, low, j);
        if (high > i) quickSort(sortArr, i, high);
    }

    public static void main(String[] args) {
        Comparable[] exScores = {
                new SortingStudentsByGPA(9, "Dima", 125),
                new SortingStudentsByGPA(25, "Kamil", 131),
                new SortingStudentsByGPA(1, "Olya", 123),
                new SortingStudentsByGPA(2, "Nastya", 145),
                new SortingStudentsByGPA(19, "Angelina", 125)
        };

        quickSort(exScores, 0, exScores.length - 1);
        System.out.println(Arrays.toString(exScores));
    }

    @Override
    public int compareTo(Student s){
        return this.getExamsScore() < s.getExamsScore() ? -1 : this.getExamsScore() == s.getExamsScore() ? 0 : 1;
    }
}


