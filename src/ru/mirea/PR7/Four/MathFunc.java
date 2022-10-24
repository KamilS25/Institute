package ru.mirea.PR7.Four;

public class MathFunc implements MathCalculable {



    @Override
    public double power(double a, double d) {
        return Math.pow(a, d);
    }

    @Override
    public double abs(double re, double im) {
        return Math.sqrt(re*re + im*im);
    }

    public double length(double r){
        return 2*pi*r;
    }



    public static void main(String[] args) {
        MathCalculable mc = new MathFunc();
        MathFunc mfc = new MathFunc();

        System.out.println(mc.power(2, 7));
        System.out.println(mc.abs(2, -3));
        System.out.println(mfc.length(4));
    }
}
