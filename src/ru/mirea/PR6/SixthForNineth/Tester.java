package ru.mirea.PR6.SixthForNineth;

public class Tester {

    public static void main(String[] args) {

        Printable[] arr = {

                new Book("The Sea-Wolf", "Jack London"),

                new Shop("Beauty girl", "Fashion")

        };

        for (Printable pr: arr){

            pr.print();

        }

    }

}
