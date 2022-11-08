package ru.mirea.SingleLinkedList;

public class Tester {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addFirst(10);
        linkedList.addFirst(7);
        linkedList.addFirst(12);
        linkedList.addFirst(25);
        linkedList.addFirst(9);
        linkedList.printList();

        System.out.println();
        linkedList.addLast(2);
        linkedList.addLast(123);
        linkedList.printList();
        System.out.println();

        linkedList.removeLast();
        linkedList.printList();
        System.out.println();
        linkedList.remove();
        linkedList.printList();
        System.out.println();

        System.out.println(linkedList.get(7));
        linkedList.removeAtdata(12);
        linkedList.printList();
        System.out.println();
        System.out.println(linkedList.get(10));
        linkedList.removeAtpos(2);
        linkedList.printList();
        System.out.println();
        linkedList.removeAtdata(1);
        linkedList.removeAtpos(3);



    }
}

