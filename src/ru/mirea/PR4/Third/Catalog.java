package ru.mirea.PR4.Third;

public enum Catalog {

    IPHONE(Category.PHONES, 75000),
    SAMSUNG(Category.PHONES, 70000),
    APPLES(Category.FOOD, 300),
    TANGERINES(Category.FOOD, 500),
    TRUCK(Category.TOYS, 2500),
    GUN(Category.TOYS, 1700),
    ;

    private final Category category;
    private final int price;

    Catalog(Category category, int price){
        this.category = category;
        this.price = price;
    }

    public Category getCategory(){
        return category;
    }

    public int getPrice(){
        return price;
    }


}

