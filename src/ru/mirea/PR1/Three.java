package ru.mirea.PR1;
import java.util.Scanner;

public class Three {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[scan.nextInt()];
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
            sum += arr[i];
        }

        float avg = (float) sum / arr.length;
        System.out.println(sum + " " + avg);

    }
}