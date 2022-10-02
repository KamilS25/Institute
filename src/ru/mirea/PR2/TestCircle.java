package ru.mirea.PR2;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args){
        System.out.println("Would you enter 2 Circles or 1 ?");
        Scanner scan = new Scanner(System.in);
        int check = scan.nextInt();

        if (check == 2){

            Circle circle1 = new Circle(0);
            Circle circle2 = new Circle(0);

            System.out.println("Enter R1:");
            circle1.setR();
            System.out.println("Enter R2:");
            circle2.setR();

            System.out.printf("Square of Circle1: %f", circle1.Square(circle1.getR()));
            System.out.println();
            System.out.printf("Square of Circle2: %f", circle2.Square(circle2.getR()));
            System.out.println();

            System.out.printf("Length of Circle1: %f", circle1.Length(circle1.getR()));
            System.out.println();
            System.out.printf("Length of Circle2: %f", circle2.Length(circle2.getR()));
            System.out.println();

            System.out.println(circle1.compare(circle1.getR(), circle2.getR()));

        }

        else if (check == 1){
            Circle circle = new Circle(0);

            System.out.println("Enter R:");
            circle.setR();

            System.out.printf("Square of Circle1: %f", circle.Square(circle.getR()));
            System.out.println();


            System.out.printf("Length of Circle1: %f", circle.Length(circle.getR()));
            System.out.println();
        }
        else{
            System.out.println("Error!");
        }
    }
}
