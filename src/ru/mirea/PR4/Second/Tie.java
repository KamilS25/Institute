package ru.mirea.PR4.Second;

public class Tie extends Clothes implements MenClothing{
    public Tie(Sizes size, int price, String colour, String type) {
        super(size, price, colour, type);
    }

    @Override
    public void dressMan() {
        System.out.println("Man trying on a tie");
    }

}
