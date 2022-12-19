package ru.mirea.PR30;

public class Tester {

    public static void main(String[] args) {

        BinaryTree bin = new BinaryTree();

        bin.insert(8);
        bin.insert(7);
        bin.insert(1);
        bin.insert(6);
        bin.insert(17);
        bin.insert(25);
        bin.insert(10);
        bin.insert(9);
        bin.insert(5);
        bin.insert(4);
        bin.insert(23);
        bin.insert(26);

        bin.displayTree();

        System.out.println(bin.find(7));

        bin.delete(17);
        bin.displayTree();

        System.out.println(bin.height(bin.getRoot()));

        bin.reverseTree(bin.getRoot());
        bin.displayTree();
    }
}
