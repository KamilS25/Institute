package ru.mirea.PR19;

import java.util.Random;
import java.util.Scanner;


public class CheckBase {
    public class INN_Exception extends Exception {
        INN_Exception(String errmessage) {
            super(errmessage);
        }
    }
    public boolean isINNvalid(String INN){
        Random rand = new Random();
        return rand.nextBoolean();
    }

    public void EnterData() throws INN_Exception{

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Full name: ");

        String fullname = scan.nextLine();

        System.out.println();
        System.out.println("Enter your INN: ");

        String INN = scan.nextLine();

        if (isINNvalid(INN)){
            System.out.println("Your data is correct, please pay for purchase");
        }
        else{
            throw new INN_Exception("Your INN is wrong!");
        }
    }

    public static void main(String[] args) {
        CheckBase cb = new CheckBase();
        try {
            cb.EnterData();
        }

        catch (INN_Exception exc){
            exc.printStackTrace();
        }
    }
}
