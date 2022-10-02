package ru.mirea.PR4.Second;

public class TShirt extends Clothes implements MenClothing, WomenClothing{
    public TShirt(Sizes size, int price, String colour, String type){
        super(size, price, colour, type);
    }

    @Override
    public void dressMan() {
        System.out.println("Man trying on a T-Shirt");
    }

    @Override
    public void dressWomen() {
        System.out.println("Woman trying on a T-Shirt");
    }
}
