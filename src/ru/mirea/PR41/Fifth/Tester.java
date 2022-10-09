package ru.mirea.PR41.Fifth;

public class Tester {

    public static void main(String[] args) {
        Reader[] arr = {
                new Reader("Попов И.И", 1, "Исторический", "01.01.2001", "8 985 934 54 21"),
                new Reader("Лихачев И.И", 2, "Лингвистический", "10.0.1.1997", "8 985 921 67 21"),
                new Reader("Стрельцов И.И", 3, "Технологический", "12.05.2000", "8 960 912 31 68")
        };

        arr[0].takeBook();
        arr[1].takeBook("Приключения", "Словарь", "Энциклопедия");
        arr[2].takeBook(new Book("Мартин Иден", "Джек Лондон"),
                new Book("Унесенные ветром", "Маргарет Митчел"),
                new Book("Мастер и Маргаритта", "Михаил Булгаков"));
        System.out.println();
        arr[0].returnBook();
        arr[1].returnBook("Приключения", "Словарь", "Энциклопедия");
        arr[2].returnBook(new Book("Мартин Иден", "Джек Лондон"),
                new Book("Унесенные ветром", "Маргарет Митчел"),
                new Book("Мастер и Маргаритта", "Михаил Булгаков"));
    }
}
