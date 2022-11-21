package ru.mirea.PR18;

import java.util.Scanner;
import java.util.Objects;

public class ThrowsDemo {
    public static void main(String[] args) {

        int arr[] = new int[]{0, 2, 3, 0, 2, 5, 2, 7};
        try {

            for (int i = arr.length - 1; i > 0; i--) {
                System.out.println(i + "/" + arr[i] + "= " + i / arr[i]);
            }
        } catch (ArithmeticException e) {
            System.out.println("Division by 0!");
        }

        System.out.println("End of 1/2 program");

        ThrowsDemo td = new ThrowsDemo();
        td.getKey();

    }


    public void getKey() {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter key: ");
            String key = scan.next();
            try {
                printDetails(key);
            } catch (Exception exc) {
                exc.printStackTrace();
            }
        }
    }

    private void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {

        if (Objects.equals(key, "none")) {
            throw new Exception("This key is not available");
        }

        return key + ": " + "data for this key";
    }

}

