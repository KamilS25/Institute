package ru.mirea.PR3;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Double fex = Double.valueOf(25);
        Double sexample = Double.valueOf(7);
        System.out.println(fex);
        System.out.println(sexample);


        String parse = scan.nextLine();
        Double Parse = Double.parseDouble(parse);
        System.out.println(Parse);

        Double a = Double.valueOf(10.01);

        int b = a.intValue();
        System.out.println(b);

        double c = a.doubleValue();
        System.out.println(c);

        byte d = a.byteValue();
        System.out.println(d);

        short g = a.shortValue();
        System.out.println(g);

        float h = a.floatValue();
        System.out.println(h);

        long l = a.longValue();
        System.out.println(l);

        String str = Double.toString(3.14);
        System.out.println(str);

    }
}
