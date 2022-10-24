package ru.mirea.PR6.Ten;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.List;

public class Shop implements Manage {

    private static final List<Computer> arr = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void add(Computer computer){
        if (!arr.contains(computer)){
            arr.add(computer);
        }
        else{
            System.out.println("This computer has already been added!");
        }
    }

    public void delete(Computer computer){
        arr.remove(computer);
    }

    public Computer search(int price){
        Computer com = null;
        for (Computer c: arr) {
            if (price == c.getPrice()) {
                com = c;
                break;
            }
        }

        return com;
    }

    public void getArr() {
        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }

    public static void main(String[] args) {

        Shop sh = new Shop();

        Monitor m1 = new Monitor(15, "1280x1000");
        Processor p1 = new Processor(4, 151);
        Memory mem1 = new Memory(25412);

        Computer c1 = new Computer(Models.LG, p1, m1, mem1, 125000);

        Monitor m2 = new Monitor(20, "1280x1000");
        Processor p2 = new Processor(3, 170);
        Memory mem2 = new Memory(5410);

        Computer c2 = new Computer(Models.APPLE, p2, m2, mem2, 540000);

        Monitor m3 = new Monitor(20, "1280x1000");
        Processor p3 = new Processor(3, 170);
        Memory mem3 = new Memory(7580);

        sh.add(new Computer(Models.ASUS, p3, m3, mem3, 142000));

        sh.getArr();

        sh.delete(c1);

        sh.search(142000);

        sh.getArr();

    }
}
