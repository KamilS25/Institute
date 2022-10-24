package ru.mirea.PR6.SixthForNineth;

public class Shop implements Printable{

    String nameShop;

    String content;

    public Shop(String nameShop, String content){

        this.nameShop = nameShop;

        this.content = content;

    }

    @Override

    public void print() {

        System.out.println("Shop: " + nameShop + ", " + content);

    }

}
