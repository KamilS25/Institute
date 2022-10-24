package ru.mirea.PR6.Eleven;

public class Tester implements Convertable {


    public double t;

    public Tester(double t){
        this.t = t;
    }


    @Override
    public void convertFar() {
        double res = (9/5)*t + 32;
        System.out.println("Farenheit: " + res);
    }

    @Override
    public void convertK() {
        double res = t + 273;
        System.out.println("Kelvin: " + res);

    }

    public static void main(String[] args) {
        Tester test = new Tester(25);

        test.convertFar();
        test.convertK();
    }
}
