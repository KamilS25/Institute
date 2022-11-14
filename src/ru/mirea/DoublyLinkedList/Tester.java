package ru.mirea.DoublyLinkedList;

public class Tester {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addFirst(5);
        linkedList.addLast(7);
        linkedList.addLast(3);
        linkedList.addLast(10);
        linkedList.addLast(11);
        linkedList.addLast(13);
        linkedList.addLast(17);
        linkedList.addFirst(1);
        linkedList.print();
        System.out.println();

        System.out.println(linkedList.getByind(4));

        linkedList.addByIndex(1, 5);
        linkedList.addByIndex(6, 111);
        linkedList.print();
        linkedList.removeLast();
        System.out.println();
        linkedList.print();
        System.out.println();
        linkedList.removeFirst();
        linkedList.print();
        System.out.println();
        linkedList.removeAtInd(2);
        linkedList.print();
    }
}
