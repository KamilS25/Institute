package PR1;

import java.util.Scanner;

public class Four {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[scan.nextInt()];

        int min = 10000000, max = 0, sum = 0, i = 0;

        while (i < arr.length) {

            arr[i] = scan.nextInt();
            sum += arr[i];

            if (arr[i] < min) {
                min = arr[i];
            }

            else if (arr[i] > max) {
                max = arr[i];
            }

            i += 1;
        }

        System.out.printf("Sum of elements: %d", sum);
        System.out.println();
        System.out.printf("Min value: %d, max value: %d", min, max);
    }
}
