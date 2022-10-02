package ru.mirea.PR4.Second;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Sizes size, int price, String colour, String type) {
        super(size, price, colour, type);
    }

    @Override
    public void dressMan() {
        System.out.println("Man trying on pants");
    }

    @Override
    public void dressWomen() {
        System.out.println("Woman trying on pants");
    }
}