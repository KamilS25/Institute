package ru.mirea.PR41.Fifth;

import java.util.Arrays;

public class Reader {
    String fullName;
    int number;
    private String facult;
    private String birthdayDate;
    private String phoneNumber;

    public Reader(String fullName,
    int number,
    String facult,
    String birthdayDate,
    String phoneNumber){
        this.fullName = fullName;
        this.number = number;
        this.facult = facult;
        this.birthdayDate = birthdayDate;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(){
        System.out.println(fullName + " взял книгу.");
    }

    public void takeBook(String... books){
        System.out.printf("%s взял  %d книги.\n", fullName, books.length);
    }

    public void takeBook(Book... bookName){
        System.out.printf("%s взял книги: %s\n", fullName, Arrays.toString(bookName));
    }

    public void returnBook() {
        System.out.printf("%s вернул книгу\n", fullName);
    }

    public void returnBook(String... books) {
        System.out.printf("%s вернул %d книги\n", fullName, books.length);
    }

    public void returnBook(Book... bookName) {
        System.out.printf("%s вернул книги: %s\n", fullName, Arrays.toString(bookName));
    }
}

