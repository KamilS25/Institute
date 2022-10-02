package ru.mirea.PR4.Second;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Sizes size, int price, String colour, String type) {
        super(size, price, colour, type);
    }

    @Override
    public void dressWomen() {
        System.out.println("Woman trying on a skirt");
    }

}
