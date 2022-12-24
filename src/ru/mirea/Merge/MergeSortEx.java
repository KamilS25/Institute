package ru.mirea.Merge;

import java.util.Arrays;

public class MergeSortEx {

    public static int[] Sort(int[] arr) {

        int[] temp;
        int[] arr1 = new int[arr.length];

        int size = 1;
        while (size < arr.length) {

            for (int i = 0; i < arr.length; i += 2 * size) {
                merge(arr, i, arr, i + size, arr1, i, size);
            }

            temp = arr;
            arr = arr1;
            arr1 = temp;

            size = size * 2;

        }
        return arr;
    }

    private static void merge(int[] arr1, int low1, int[] arr2, int low2, int[] dest,
                              int lowdest, int size) {
        int ind1 = low1;
        int ind2 = low2;

        int high1 = Math.min(low1 + size, arr1.length);
        int high2 = Math.min(low2 + size, arr2.length);

        if (low1 + size > arr1.length) {

            for (int i = low1; i < high1; i++) {
                dest[i] = arr1[i];
            }

            return;
        }

        int count = high1 - low1 + high2 - low2;

        for (int i = lowdest; i < lowdest + count; i++) {

            if (ind1 < high1 && (ind2 >= high2 || arr1[ind1] < arr2[ind2])) {

                dest[i] = arr1[ind1];
                ind1++;
            }

            else {
                dest[i] = arr2[ind2];
                ind2++;
            }
        }
    }


    public static void main(String[] args) {

        int[] arr = new int[]{3, 4, 78, 4, 5, 3, 9, 7, 10, 54, 12};

        MergeSortEx merge = new MergeSortEx();

        merge.Sort(arr);

        for (int elem: arr){
            System.out.print(elem + " ");
        }
    }
}
