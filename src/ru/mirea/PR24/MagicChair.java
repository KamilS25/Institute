package ru.mirea.PR24;

public class MagicChair implements Chair{

    void doMagic(){
        System.out.println("Back massage, that's the magic for you!");
    }


    @Override
    public void sit() {
        System.out.println("Wonderful magic chair!");
    }
}
