package ru.mirea.PR4.First;

import org.w3c.dom.ls.LSOutput;

public class SeasonsTest {
    public void info(Seasons season) {
        switch (season) {
            case WINTER:
                System.out.println("Happy New Year and snow!");
            case SPRING:
                System.out.println("Nature comes to life");
            case SUMMER:
                System.out.println("Time for rest and entertainment");
            case AUTUMN:
                System.out.println("Beautiful nature");
        }
    }

    public static String season;


    public static void main(String[] args) {
        Seasons favourite = Seasons.SUMMER;
        for (Seasons s : Seasons.values()) {
            System.out.println(s + " " + s.getAvg() + " " + s.getDescription()  );
        }
    }

}
