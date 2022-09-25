package ru.mirea.PR3.Format;

import java.util.Scanner;

public class Converter {

    private double dollars = 0;
    private double Euros = 0;
    private double money = 0;

    public Converter( double dollars, double Euros){
        this.dollars = dollars;
        this.Euros = Euros;
    }

    public void setMoney(double money){
        this.money = money;
    }

    public void setDollars(double dollars) {
        this.dollars = dollars;
    }

    public void SetEuros(double Euros){
        this.Euros = Euros;
    }

    public double RubToEuro(double money){
        return (money/Euros);
    }

    public double RubToDollars(double money){
        return (money/dollars);
    }

    public double DollarsToRub(double money){
        return (money * dollars);
    }

    public double EurosToRub(double money){
        return (money * Euros);
    }
}

class Work{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Converter conv = new Converter(51.8, 56.48);

        System.out.println("Choose convert: 1 -  RubToEuro, 2 - RubToDollars, 3 - DollarsToRub, 4 - EurosToRub");
        int choice = scan.nextInt();

        while(choice < 1 || choice > 4){
            System.out.println("Error, Try again:");
            choice = scan.nextInt();
        }

        System.out.println("Enter count of money: ");
        int count = scan.nextInt();

        switch (choice){
            case 1:
                System.out.println("Result: " + conv.RubToEuro(count) + " Euro");
                break;
            case 2:
                System.out.println("Result: " + conv.RubToDollars(count) + "$");
                break;
            case 3:
                System.out.println("Result: " + conv.DollarsToRub(count) + " Rub");
                break;
            case 4:
                System.out.println("Result: " + conv.EurosToRub(count) + " Rub");
                break;
        }


    }
}


