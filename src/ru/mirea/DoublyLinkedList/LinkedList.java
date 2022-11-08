package ru.mirea.DoublyLinkedList;

public class LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    public int length;

    public int getLength() {
        return length;
    }

    public LinkedList(){
        this.head = head;
        this.tail = tail;
    }
    public boolean isEmpty(){
        return head == null;
    }

    public Node<T> getNode(int ind){
        if (ind > length - 1 | ind < 0 ){
            System.out.println("Input index exceeds array bounds!");
            return null;
        }

        int count;
        if(length/2 <= ind){

            count = length - 1;
            Node<T> current = tail;

            while (count != ind){
                current = current.prev;
                count--;
            }

            return current;

        }

        Node<T> current = head;
        count = 0;
        while (count != ind){
            current = current.next;
            count++;
        }

        return current;
    }

    public T getByind(int pos){
        return getNode(pos).data;
    }
    public void addFirst(T data){

        Node<T> current = new Node<>(data);

        if (isEmpty()){
            head = tail = current;
            length++;
            return;
        }

        head.prev = current;
        current.next = head;
        head = current;
        length++;
    }

    public void addLast(T data){
        Node<T> current = new Node<>(data);

        if (isEmpty()){
            head = tail = current;
            length++;
            return;
        }

        tail.next = current;
        current.prev = tail;
        tail = current;
        length++;
    }

    public void addByIndex(int pos, T data){
        if (pos > length + 1){
            System.out.println("Input index exceeds array bounds!");
            return;
        }


        if (pos == 0){
            addFirst(data);
            length++;
            return;
        }

        if (pos == length){
            addLast(data);
            length++;
            return;
        }

        Node<T> current = getNode(pos - 1);
        Node<T> newNode = new Node<>(data);

        newNode.next = current.next;
        newNode.prev = current;
        current.next = newNode;
        current.next.next.prev = newNode;
        length++;
    }

    public void print(){
        Node<T> temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

}
