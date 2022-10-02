package ru.mirea.PR4.Second;

public class Atelier implements MenClothing, WomenClothing{
    Clothes[] arr = {
            new TShirt(Sizes.S, 2500, "White", "T-Shirt"),
            new Pants(Sizes.L, 1750, "Black", "Pants"),
            new Skirt(Sizes.XXS, 900, "Purple", "Skirt"),
            new Tie(Sizes.M, 1200, "White and Black", "Tie")
    };
    @Override
    public void dressMan() {
        System.out.println("Men clothes:");
        for(Clothes cloth: arr){
            if(cloth instanceof MenClothing){
                System.out.println("Type: " + cloth.type + "\n" +
                        "Size: " + cloth.size.getDescription() + "\n" + "Price: " + cloth.price + "\n" +  "Colour: " + cloth.colour);
            }
            System.out.println();
        }
    }

    @Override
    public void dressWomen() {
        System.out.println("Women clothes:");
        for(Clothes cloth: arr){
            if(cloth instanceof WomenClothing){
                System.out.println("Type: " + cloth.type + "\n" +
                        "Size: " + cloth.size.getDescription() + "\n" + "Price: " + cloth.price + "\n" +  "Colour: " + cloth.colour);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Atelier atelier = new Atelier();
        atelier.dressMan();
        atelier.dressWomen();
    }
}
