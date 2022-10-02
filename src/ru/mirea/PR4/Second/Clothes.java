package ru.mirea.PR4.Second;

public abstract class Clothes {
    Sizes size;
    protected int price;
    protected String colour;

    protected String type;

    Clothes(Sizes size, int price, String colour, String type){
        this.size = size;
        this.price = price;
        this.colour = colour;
        this.type = type;
    }

    protected void setSize(Sizes size){
        this.size = size;
    }

    protected void setPrice(int price){
        this.price = price;
    }

    protected void setColour(String colour){
        this.colour = colour;
    }

    protected void setType(String type){
        this.type = type;
    }

    protected Sizes getSize(){
        return size;
    }

    protected double getPrice(){
        return price;
    }

    protected String getColour(){
        return colour;
    }

    protected String getType(){
        return type;
    }
}
