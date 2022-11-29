package ru.mirea.PR26Collections;

import java.util.Stack;

public class First<T> {

    public static <T> void reverse(T[] arr){
        Stack<T> arr1 = new Stack<>();

        for(T el: arr){
            arr1.push(el);
        }

        for (int i = 0; i < arr.length; i++){
            arr[i] = arr1.pop();
        }

        for (T el: arr){
            System.out.print(el + " ");
        }
    }

    public static void main(String[] args) {

        Integer[] arr = new Integer[10];

        System.out.println("Initial: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = i;
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Finite: ");
        reverse(arr);
    }
}
