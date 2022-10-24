package ru.mirea.PR8;

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

    public static void main(String[] args) {
        System.out.println(triangleSequence(7));
        OneToN(7);
        System.out.println();
        System.out.println(AtoB(9, 3));
    }
}
