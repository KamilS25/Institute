package ru.mirea.PR29;

import java.util.Scanner;

public class MilkyWay {

    public static void main(String[] args) {
        MilkyWay ex = new MilkyWay();
        System.out.println(ex.solve());
    }


    private int solve(){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int sum = 0;

        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if (arr[i][j] == 1) {
                    sum++;
                }
            }
            System.out.println();
        }
        scan.close();
        return sum/2;
    }

}