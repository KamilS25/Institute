package ru.mirea.PR27Hash;

import java.util.Hashtable;
import java.util.Objects;

public class Dictionary {
    public void hashTabHash(Student s){
        s.hashCode();
    }

    public void hashTabAdd(int key,Student s, Hashtable table){
        table.put(key, s);
    }

    public void hashTabLookup(Hashtable table){
        table.forEach((k, v) -> System.out.println("Key: " + k + ", " + "Student: " + v.toString()));
    }

    public void hashTabDelete(Hashtable table, int key){
        table.remove(key);
    }
}
