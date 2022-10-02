package ru.mirea.PR2;

import java.util.Scanner;

public class Circle {
    double R = 0, S = 0, L = 0;


    public Circle(double R){
        this.R = R;
    }

    public double getR() {
        return R;
    }

    Scanner scan = new Scanner(System.in);

    public void setR() {
        this.R = scan.nextDouble();
    }

    public double Square(double R) {
        this.S = Math.PI * Math.pow(R, 2);
        return S;
    }

    public double Length(double R) {
        this.L = 2 * Math.PI * R;
        return L;
    }

    public String compare(double circ1, double circ2){
        if (circ1 > circ2){
            return "Circle1 bigger then Circle2";
        }
        else if (circ1 == circ2) {
            return "Circle1 is equal Circle2";
        }
        else{
            return "Circle2 bigger then Circle1";
        }
    }
}
