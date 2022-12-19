package ru.mirea.PR32;

import java.util.Scanner;

public class AlgorithmJohnsonTrotter {

    public static int maxK(int n, int[] array, boolean[] f) {

        int k = -1, max = 0;
        for (int i = 0; i < n; i++) {

            if (!f[i]) {
                if (i > 0 && array[i] > array[i - 1] && array[i] > max) {
                    k = i;
                    max = array[i];
                }
            }

            else {
                if (i < n - 1 && array[i] > array[i + 1] && array[i] > max) {
                    k = i;
                    max = array[i];
                }
            }
        }
        return k;
    }


    public static void swap2(int[] array, boolean[] f, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        boolean temp1 = f[i];
        f[i] = f[j];
        f[j] = temp1;
    }


    public static void ReverseId(int[] array, int k, boolean[] f) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[k]) {
                f[i] = !f[i];
            }
        }
    }

    public static void Jt(int n) {

        boolean[] flag = new boolean[n];

        int[] iData = new int[n];

        int k;

        for (int i = 0; i < n; i++) {
            iData[i] = i + 1;
            flag[i] = false;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(iData[i]);
            System.out.print(flag[i]);
        }
        System.out.println();

        k = maxK(n, iData, flag);

        while (k != -1) {

            if (flag[k]) {

                swap2(iData, flag, k, k + 1);

                k++;
            }

            else {
                swap2(iData, flag, k, k - 1);
                k--;
            }
            ReverseId(iData, k, flag);

            for (int i = 0; i < n; i++) {
                System.out.print(iData[i]);
                System.out.print(flag[i]);
            }
            System.out.println();
            k = maxK(n, iData, flag);
        }
    }

    public static void main(String[] args) {
        System.out.print("Please put in n :");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Jt(n);
        scan.close();
    }
}
