package ru.mirea.PR8;
import java.util.Scanner;
public class Recursion {

    public static String triangleSequence(int n){
        int k = 0;
        int j = 0;

        if (n == 1){
            return "1";
        }

        else{
            for (int i = 1; k < n; i++){
                k += i;
                j = i;
            }
            return triangleSequence(--n) + " " + j;
        }
    }

    public static String OneToN(int n){
        if (n == 1){
            System.out.print("1");
        }

        else{
            System.out.print(OneToN(n - 1) + " " + n);
        }
        return "";
    }

    public static String AtoB(int A, int B){
        if (A == B){
            return Integer.toString(A);
        }

        else if(A < B){
            return A + " " + AtoB(A + 1, B);
        }

        else{
            return A + " " + AtoB(A - 1, B);
        }
    }

    public static int SumNumb(int len, int sum, int k, int s) {
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += SumNumb(len + 1, sum + i, k, s);
        }
        return res;
    }

    public static int SumOfNumb(int a){
        if (a == 0)
            return 0;
        return a%10 + SumOfNumb(a/10);

    }

    public static boolean isPrime(int a, int i){
        if (a < 2) {
            return false;
        }
        else if (a == 2) {
            return true;
        }
        else if (a % i == 0) {
            return false;
        }
        else if (i < a/2) {
            return isPrime(a, i + 1);
        }
        else {
            return true;
        }
    }

    public static void factor(int a, int n){
        if (n > a/2){
            System.out.print(a);
            return;
        }

        if (a % n == 0){
            System.out.print(n);
            System.out.print(' ');;
            factor(a/n, n);
        }
        else {
            factor(a, n+1);
        }
    }

    public static String isPalindrome(String str) {
        if (str.length() == 1) {
            return "YES";
        }
        else {
            if (str.substring(0, 1).equals(str.substring(str.length() - 1, str.length()))) {
                if (str.length() == 2) {
                    return "YES";
                }
                return isPalindrome(str.substring(1, str.length() - 1));
            }
            else {
                return "NO";
            }
        }
    }

    public static int withoutTwoZeroes(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return withoutTwoZeroes(a, b - 1) + withoutTwoZeroes(a - 1, b - 1);
    }

    public static int reverse(int a, int i){
        if (a == 0){
            return i;
        }

        else {
            return reverse(a/10, i*10 + a%10);
        }
    }

    public static int quantityUnit(){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if (n == 1){
            int a = scan.nextInt();
            if (a == 1){
                return quantityUnit() + a + n;
            }
            else{
                int b = scan.nextInt();
                if (b == 1){
                    return quantityUnit() + a + b + n;
                }
                else{
                    return a + b + n;
                }
            }
        }
        else {
            int k = scan.nextInt();
            if (k == 1){
                return quantityUnit() + k + n;
            }
            else{
                return k + n;
            }
        }
    }

    public static void oddNumb(){
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        if (a > 0){
            if (a % 2 != 0){
                System.out.println(a);
                oddNumb();
            }
            else{
                oddNumb();
            }
        }
    }

    public static void oddIndNumber() {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        if (a > 0) {
            System.out.println(a);
            int b = scan.nextInt();

            if (b > 0) {
                oddIndNumber();
            }
        }
    }

    public static String numbersLeft(int a){

        if (a<10){
            return Integer.toString(a);
        }
        else {
            return numbersLeft(a / 10) + " " + a % 10;
        }
    }

    public static int numbersRight(int a){

        if (a<10){
            return a;
        }
        else{
            System.out.print(a%10 + " ");
            return numbersRight(a/10);
        }
    }

    public static void maxNumberCount(int max, int count){
        Scanner scan = new Scanner(System.in);
         int a = scan.nextInt();

         if (a > 0){
             if (a > max){
                 maxNumberCount(a, 1);
             }
             else if (a == max){
                 maxNumberCount(a, ++count);
             }
             else{
                 maxNumberCount(max, count);
             }
         }
         else{
             System.out.println(count);
         }

    }

    public static int maxNumb() {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        if (a == 0) {
            return 0;
        }
        else {
            return Math.max(a, maxNumb());
        }
    }



    public static void main(String[] args) {
        System.out.println(triangleSequence(7));
        OneToN(7);
        System.out.println();
        System.out.println(AtoB(9, 3));
        System.out.println(SumNumb(0, 0, 3, 27));
        System.out.println(SumOfNumb(123));
        System.out.println(isPrime(967, 2));
        factor(100, 2);
        System.out.println();
        System.out.println(isPalindrome("gaag"));
        System.out.println(withoutTwoZeroes(7, 8));
        System.out.println(reverse(123, 0));
        System.out.println(quantityUnit());
        oddNumb();
        System.out.println();
        oddIndNumber();
        System.out.println();
        System.out.println(numbersLeft(123));
        System.out.println(numbersRight(123));
        maxNumberCount(0,0);
        System.out.println();
        System.out.println(maxNumb());
    }
}
