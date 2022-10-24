package ru.mirea.PR7.SevenEight;

public class Book implements Printable {

    private String author;
    private String nameB;

    public Book(String author, String nameB){
        this.author = author;
        this.nameB = nameB;
    }

    public Book() {}

    public void printBook(Printable[] printables){
        for (Printable p: printables){
            if (p instanceof Book)
                p.print();
        }
    }

    public String getAuthor() {
        return author;
    }

    public String getNameB() {
        return nameB;
    }

    @Override
    public void print() {
        System.out.println("Book: " + getAuthor() + ", " + getNameB());
    }
}
