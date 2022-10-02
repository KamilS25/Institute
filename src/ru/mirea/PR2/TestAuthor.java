package ru.mirea.PR2;

public class TestAuthor {
    public static void main(String[] args){
        Author author = new Author("Kamil", "mirea@yandex.ru", 'm');

        System.out.println(author);
        author.setEmail();
        System.out.println("New email: " + author.getEmail());
    }
}
