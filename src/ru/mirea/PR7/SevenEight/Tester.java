package ru.mirea.PR7.SevenEight;

public class Tester {

    public static void main(String[] args) {
        Printable[] printables = {
                new Book("Remark", "Three Comrades"),
                new Book("London", "Martin Iden"),
                new Magazine("Fashion"),
                new Magazine("Sports")};

        Book b = new Book();
        Magazine m = new Magazine();

        b.printBook(printables);
        System.out.println();
        m.printMagazines(printables);

        }

}

