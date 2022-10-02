package ru.mirea.PR1;

import java.util.Scanner;

public class Seven {
    public static int fact(int n){

        int ans = 1;

        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(fact(scan.nextInt()));
    }
}
