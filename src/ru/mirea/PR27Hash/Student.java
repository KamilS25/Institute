package ru.mirea.PR27Hash;

import java.util.Hashtable;
import java.util.Objects;

public final class Student {

    final String fullname;
    final String id;

    Student(String fullname, String id){
        this.fullname = fullname;
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return fullname.equals(student.fullname) && id.equals(student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullname, id);
    }

    @Override
    public String toString() {
        return
                 fullname +
                ", id = " + id
                ;
    }
}
