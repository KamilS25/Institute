package ru.mirea.PR3;

import java.util.Random;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {

        Random rand = new Random();

        double[] arr_rand = new double[10];

        double[] arr_math = new double[10];

        for(int i = 0; i < arr_rand.length; i++) {

            arr_rand[i] = rand.nextDouble();

            arr_math[i] = Math.random();

        }

        System.out.println(Arrays.toString(arr_math));

        System.out.println(Arrays.toString(arr_rand));

        Arrays.sort(arr_math);

        Arrays.sort(arr_rand);

        System.out.println();

        System.out.println(Arrays.toString(arr_math));

        System.out.println(Arrays.toString(arr_rand));

    }

}
