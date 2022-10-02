package ru.mirea.PR2;

import java.util.Scanner;
import java.util.Random;


public class Poker {
    static void randomize(String arr[], int n) {
        Random rand = new Random();

        for (int i = n - 1; i > 0; i--) {
            int j = rand.nextInt(i);

            String curr = arr[i];
            arr[i] = arr[j];
            arr[j] = curr;
        }
    }


    public static void main(String[] args) {
        String[] arr1 = {"2", "3", "4", "5", "6", "7", "8", "10", "J", "Q", "K", "A"};
        String[] arr2 = {"Diamonds", "Hearts", "Clubs", "Spades"};
        String[] CardDeck = new String[48];

        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                CardDeck[count] = arr1[i] + " " + arr2[j];
                count += 1;
            }
        }

        randomize(CardDeck, 48);

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n * 5 > 48) {
            System.out.println("Error, please kick persons off the table!");
        } else {

            int countC = 47;
            for (int j = 0; j < n; j++) {
                System.out.printf("Player: %d ", j + 1);
                System.out.println();
                for (int i = countC; i > countC - 5; i--) {
                    System.out.println(CardDeck[i]);
                }
                countC -= 5;
                System.out.println();
            }
        }

    }
}