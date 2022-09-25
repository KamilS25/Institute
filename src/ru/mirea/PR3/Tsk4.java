package ru.mirea.PR3;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Tsk4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter length of array:");
        int n = scan.nextInt();

        while (n <= 0){
            System.out.println("Error");
            System.out.println("Try to enter again:");
            n = scan.nextInt();
        }

        int arr[] = new int[n];
        Random rand = new Random();
        ArrayList<Integer> evenArr = new ArrayList<>();

        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt();

            if (arr[i] % 2 == 0){
                evenArr.add(arr[i]);
            }
        }

        System.out.println("Initial array:");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.println("Even array:");
        for (int i = 0; i < evenArr.size(); i++){
            System.out.print(evenArr.get(i) + " ");
        }

    }
}
