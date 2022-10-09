package ru.mirea.PR41.Second;

public class Tester {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Samsung", "8 925 456 76 34", 195);
        Phone phone2 = new Phone("Asus", "8 999 999 99 99", 180);
        Phone phone3 = new Phone("Huawei", "8 999 123 45 67", 200);

        System.out.printf("%s\n%s\n", phone1.receiveCall("Olya"), phone1.getNumber());
        System.out.printf("%s\n%s\n", phone2.receiveCall("Mr. VV"), phone2.getNumber());
        System.out.printf("%s\n%s\n", phone3.receiveCall("Crack"), phone3.getNumber());
        System.out.println();
        System.out.println(phone1.receiveCall("Maga", "8 001 001 11 00"));
        System.out.println();
        phone2.sendMessage(
                "8 925 456 76 34",
                "8 999 999 99 99",
                "8 001 001 11 00");
    }
}
