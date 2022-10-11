package ru.mirea.PR6.Third;

public class Tester {
    public static void main(String[] args) {
        Phones iphone = new Phones("Iphone 11");
        Phones samsung = new Phones("Galaxy super pro x128");

        Teams boston = new Teams("Boston Bruins");
        Teams real = new Teams("Real Madrid");

        iphone.getName();
        samsung.getName();

        boston.getName();
        real.getName();
    }
}
