package ru.mirea.Stack1;

import java.util.ArrayList;

public class StackEx<T> {

    ArrayList<T> stack;
    int top = -1;
    int size = 0;
    int length = 0;

    StackEx(int size){
        this.size = size;
        stack = new ArrayList<>(size);
    }

    public int getLength(){
        return length;
    }
    public boolean isFull(){
        if (top == size - 1) {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isEmpty(){
        if (length == 0){
            return true;
        }

        else{
            return false;
        }
    }

    public void push(T elem){
        if (isFull()){
            System.out.println("Stack is full!");
            return;
        }
        else{
            stack.add(elem);
            length++;
            top++;
        }
    }

    public T pop(){

        T elem;
        if (isEmpty()){
            System.out.println("Stack is Empty!");
            return null;
        }

        else{
            elem = stack.get(top);
            stack.remove(top);
            top--;
            length--;
        }

        return elem;
    }

    public T peek(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return null;
        }
        return stack.get(top);
    }

    public void onDisp(){
        if (length < size){

            for (int i = 0; i < length; i++){
                System.out.println(i + ": " + stack.get(i));
            }
            for (int i = length - 1; i < size; i++){
                System.out.println(i + ": " + null);
            }
        }

        else{

            for (int i = 0; i < size; i++){
                System.out.println(i + ": " + stack.get(i));
            }
        }
    }
}
