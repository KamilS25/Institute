package ru.mirea.PR10;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

public class Tester{

    private static final ArrayList<Student> iDNumber = new ArrayList<>();

    public static void setArray(ArrayList<Student> iDNumber){

        while(true){
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter info about student:");

            String name, surname;
            String specialization, group;
            int course, exscores;

            System.out.println("Enter name:");
            name = scan.nextLine();
            System.out.println("Enter surname:");
            surname = scan.nextLine();
            System.out.println("Enter specialization:");
            specialization = scan.nextLine();
            System.out.println("Enter group:");
            group = scan.nextLine();
            System.out.println("Enter course:");
            course = scan.nextInt();
            System.out.println("Enter exam scpres:");
            exscores = scan.nextInt();

            iDNumber.add(new Student(name, specialization, surname, group, course, exscores));

            System.out.println("Would you like to enroll another student ? \n 1. Yes \n 2. No");
            int choice = scan.nextInt();
            if (choice == 1){
                continue;
            }
            else{
                break;
            }

        }
    }

    public static void quickSort(ArrayList<Student> sortArr, int low, int high) {

        if (sortArr.size() == 0 || low >= high)
            return;

        int middle = low + (high - low) / 2;
        Student border = sortArr.get(middle);

        int i = low, j = high;
        while (i <= j) {
            while (sortArr.get(j).compareTo(border) < 0) j--;
            while (sortArr.get(i).compareTo(border) > 0) i++;
            if (i <= j) {
                Student swap = sortArr.get(i);
                sortArr.set(i, sortArr.get(j));
                sortArr.set(j, swap);
                i++;
                j--;
            }
        }

        if (low < j) quickSort(sortArr, low, j);
        if (high > i) quickSort(sortArr, i, high);
    }

    public static void outArray(ArrayList<Student> iDNumber){
        System.out.println(iDNumber);
    }

    public static void sortBy(ArrayList<Student> iDNumber){

        System.out.println("Choose which value sort by:\n" +
                "1. Name\n" +
                "2. Surname\n" +
                "3. Specialization\n" +
                "4. Course\n" +
                "5. Exam Scores\n" +
                "6. Group");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        switch (choice){
            case 1 -> iDNumber.sort(Comparator.comparing(Student::getName));
            case 2 -> iDNumber.sort(Comparator.comparing(Student::getSurname));
            case 3 -> iDNumber.sort(Comparator.comparing(Student::getSpecialization));
            case 4 -> iDNumber.sort(Comparator.comparing(Student::getCourse));
            case 5 -> iDNumber.sort(Comparator.comparing(Student::getexScores));
            case 6 -> iDNumber.sort(Comparator.comparing(Student::getGroup));
        }

        for (Student student : iDNumber){
            System.out.println(student);
        }
    }


    public static void main(String[] args) {

        Student[] arr = {
                new Student("Ivan", "KLO", "Ivanov", "KPU-12-22", 1, 243 ),
                new Student("Boris", "LKO", "Dyatlov", "JKP-10-22", 1, 254)
        };


        setArray(iDNumber);

        iDNumber.addAll(List.of(arr));

        quickSort(iDNumber, 0, iDNumber.size() - 1);
        for(Student stud : iDNumber){
            System.out.println(stud);
        }

        sortBy(iDNumber);


    }

}
