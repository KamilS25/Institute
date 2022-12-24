package ru.mirea;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high){

        if (arr.length == 0 || low >= high){
            return;
        }

        int middle = low + (high - low)/2;
        int i = low, j = high, border = arr[middle];

        while(i <= j){

            while (arr[i] < border){
                i++;
            }

            while (arr[j] > border){
                j--;
            }

            if (i <= j){

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(arr, low, j);
        if (high > i)
            quickSort(arr, i, high);
    }


    public static void main(String[] args) {

        int[] arr = new int[]{1, 25, 3, 7, 2, 3, 4, 8, 17, 23, 1, 0};

        quickSort(arr, 0, arr.length - 1);

        for (int elem: arr){
            System.out.print(elem + " ");
        }
    }
}
