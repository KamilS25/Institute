package ru.mirea.PR3.Format;

import java.util.Scanner;

public class Shop {

    Scanner scan = new Scanner(System.in);
    private double dollars = 0;
    private double Euros = 0;
    private double price = 0;

    public Shop( double dollars, double Euros){
        this.dollars = dollars;
        this.Euros = Euros;
    }

    public double getPrice(double price){
        return price;
    }

    public void setPrice(){
        this.price = scan.nextInt();
    }

    public void setDollars(double dollars) {
        this.dollars = dollars;
    }

    public void SetEuros(double Euros){
        this.Euros = Euros;
    }

    public double RubToEuro(double price){
        return (price/Euros);
    }

    public double RubToDollars(double price){
        return (price/dollars);
    }

}

class Buy{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("1 - T-Shirt: 7000 Rub, 2 - Trousers: 4000 Rub, 3 - Cap: 2500 Rub");

        int cloth = scan.nextInt();
        while (cloth < 1 || cloth > 3){
            System.out.println("Error, Try again: ");
            cloth = scan.nextInt();
        }

        System.out.println("Choose valuta: 1 - Rub, 2 - USD, 3 - Euro");

        int choice = scan.nextInt();

        while (choice < 1 || choice > 3){
            System.out.println("Error, Try again: ");
            choice = scan.nextInt();
        }

        Shop shop = new Shop(51.8, 56.48);

        if (cloth == 1){
            switch (choice){
                case 1:
                    System.out.println("Price: " + shop.getPrice(7000) + "Rub");
                    break;
                case 2:
                    System.out.println("Price: " + shop.RubToDollars(7000) + "$");
                case 3:
                    System.out.println("Price: " + shop.RubToEuro(7000)+ "Euro");
            }
        }

        else if(cloth == 2){
            switch (choice){
                case 1:
                    System.out.println("Price: " + shop.getPrice(4000) + "Rub");
                    break;
                case 2:
                    System.out.println("Price: " + shop.RubToDollars(4000) + "$");
                case 3:
                    System.out.println("Price: " + shop.RubToEuro(4000)+ "Euro");
            }
        }

        else if(cloth == 3){
            switch (choice){
                case 1:
                    System.out.println("Price: " + shop.getPrice(2500) + " Rub");
                    break;
                case 2:
                    System.out.println("Price: " + shop.RubToDollars(2500) + " $");
                    break;
                case 3:
                    System.out.println("Price: " + shop.RubToEuro(2500) + " Euro");
                    break;
            }
        }
        

    }
}
