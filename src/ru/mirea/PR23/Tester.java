package ru.mirea.PR23;

import java.util.Random;

public class Tester {

    public static void main(String[] args) {
        int size = 7;

        ArrayQueueModule queue = new ArrayQueueModule<>(size);

        queue.clear();

        Random rand = new Random();

        for(int i = 0; i < size; i++){
            //queue.enQueue(rand.nextInt(10, 100));
            queue.enQueue(i+1);
        }

        queue.display();
        queue.deQueue();
        System.out.println();

        System.out.println("First item: " + queue.firstElem());

        queue.deQueue();
        System.out.println();
        queue.display();
        System.out.println();

        queue.enQueue(25);
        System.out.println();

        queue.display();
        queue.clear();
        System.out.println();
        queue.display();

    }
}
