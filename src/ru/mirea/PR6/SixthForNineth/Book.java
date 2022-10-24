package ru.mirea.PR6.SixthForNineth;

public class Book implements Printable {

    String nameBook;

    String author;

    public Book(String nameBook, String author) {

        this.nameBook = nameBook;

        this.author = author;

    }

    @Override

    public void print() {

        System.out.println("Book: " + nameBook + ", " + author);

    }
}