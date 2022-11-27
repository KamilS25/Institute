package ru.mirea.PR20;

import java.io.Serializable;

public class Generics<T extends Comparable<T>, V extends Animal & Serializable, K>{

    public T t;
    public V v;
    public K k;

    Generics(T t, V v, K k){
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public K getK() {
        return k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    @Override
    public String toString() {
        return "Generics:\n" +
                "class t = " + t.getClass() + ", t = " + t +  "\n" +
                "class v = " + v.getClass() + ", v = " + v + "\n" +
                "class k = " + k.getClass() + ", k = " + k + "\n";
    }

    public static void main(String[] args) {
        Generics generics = new Generics("Mustang", new Animal("Lion", "Mammals"), 10);

        System.out.println(generics);;
    }
}

