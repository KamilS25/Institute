package ru.mirea.PR2;

public class ReverseArray {
    public static void main (String[] args){
        String[] arr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String curr;

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }

        System.out.println();

        for (int i = 0; i < arr.length/2; i++){
            curr = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = curr;

        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }

    }
}
