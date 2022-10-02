package ru.mirea.PR2;

import java.util.Scanner;

public class HowMany {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();
        System.out.println(line);

        String[] countW = line.split(" ");
        System.out.println("Word count: " + countW.length);
    }
}
