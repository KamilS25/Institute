package ru.mirea.BinarySearch;

public class BinarySearch {

    public static int binarySearch(int[] arr, int value, int low, int high){

        if (high < low) {
            return -1;
        }

        int middle = (low + high)/2;

        if (value < arr[middle]){
            return binarySearch(arr,value, low, middle - 1);
        }

        else if (value > arr[middle]){
            return binarySearch(arr, value, middle + 1, high);
        }

        return middle;
    }


    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 10;
        }

        for (int elem: arr){
            System.out.print(elem + " ");
        }

        System.out.println();
        System.out.println(binarySearch(arr, 11, 0, arr.length));
    }
}
