package ru.mirea.PR7.Five;

public class Tester implements WorkWithStrings {
    @Override
    public int numbSymb(String str) {

        int numb = str.length();
        return numb;
    }

    @Override
    public String newstr(String str) {

        int len = str.length();
        char[] CharArray = new char[len];
        int k = 0;

        for (int i = 0; i < len; i++) {

            if ((i + 1) % 2 != 0) {
                CharArray[k] = str.charAt(i);
                k += 1;
            }
        }

        String str1 = new String(CharArray);
        return str1;
    }

    @Override
    public String invstr(String str) {

        int len = str.length();
        char[] CharArray = new char[len];

        for (int i = 0; i < len; i++) {
            CharArray[i] =
                    str.charAt(len - 1 - i);
        }

        String str1 = new String(CharArray);
        return str1;
    }


    public static void main(String[] args) {

        WorkWithStrings strings = new Tester();

        System.out.println(strings.numbSymb("I like hockey"));
        System.out.println(strings.newstr("GoLittleRockstar"));
        System.out.println(strings.invstr("wocsoM"));
    }
}
