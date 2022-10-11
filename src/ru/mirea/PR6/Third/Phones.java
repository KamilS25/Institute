package ru.mirea.PR6.Third;

public class Phones implements Nameable {

    protected String modelPhone;

    public Phones(String modelPhone){
        this.modelPhone = modelPhone;
    }

    @Override
    public void getName() {
        System.out.println("Model: " + modelPhone);
    }
}
