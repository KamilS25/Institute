package ru.mirea.PR4.Third;

import java.util.Scanner;
import java.util.ArrayList;


public class EShop {
    Scanner scan = new Scanner(System.in);

    private final String login = "Kam@yandex.ru";
    private final String password = "12345";

    ArrayList<Catalog> buy = new ArrayList<>();
    public int count;


    public void Auth() {
        while (true) {
            System.out.println("Enter Login: ");
            String input_log = scan.nextLine();
            System.out.println("Enter Password: ");
            String input_pas = scan.nextLine();

            if (!input_pas.equals(password) || !input_log.equals(login)) {
                System.out.println("You entered wrong login or password, Please, Tru again: ");
            }

            else{
                System.out.println("You have been authorized");
                break;
            }

        }
    }

    public void WatchCategory(){
        for (int i = 0; i < Category.values().length; i++){
            System.out.println(i+1 + ". " + Category.values()[i]);
        }
    }

    public void WatchCatalog(){
        System.out.println("Choose category: ");
        int choice = scan.nextInt();
        Category chosen = null;

        switch (choice){
            case 1:
                chosen = Category.PHONES;
                count = 0;
                break;
            case 2:
                chosen = Category.FOOD;
                count = 2;
                break;
            case 3:
                chosen = Category.TOYS;
                count = 4;
                break;
        }

        for (Catalog cat: Catalog.values()){
            if (chosen == cat.getCategory()){
                System.out.println(cat);
            }
        }
    }

    public void toBuy(){
        System.out.println("Enter number of product for put it to the cart: ");
        System.out.println("If you wanna stop enter '0'");

        while (true){
            int product = scan.nextInt();
            if (product == 0){
                break;
            }
            if (count == 0){
                buy.add(Catalog.values()[product - 1]);
            }
            else if (count == 2){
                buy.add(Catalog.values()[product - 1 + count]);
            }

            else if (count == 4){
                buy.add(Catalog.values()[product - 1 + count]);
            }

        }
    }

    public void Payment(){
        int sum = 0;

        for(Catalog cat: buy){
            sum += cat.getPrice();
        }

        System.out.println("Final amount: " + sum);
    }

    public static void main(String[] args) {
        EShop client = new EShop();
        Scanner scan = new Scanner(System.in);

        client.Auth();
        client.WatchCategory();
        client.WatchCatalog();
        client.toBuy();
        System.out.println("If you wanna pay enter '1' or enter '2' for choose other category: ");
        while (true){
            int choice = scan.nextInt();
            if (choice == 1){
                break;
            }
            else if(choice == 2){
                client.WatchCatalog();
                client.toBuy();
            }
            System.out.println("If you wanna pay enter '1' or enter '2' for choose other category: ");
        }
        client.Payment();
    }
}
