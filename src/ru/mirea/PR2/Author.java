package ru.mirea.PR2;

import java.util.Scanner;

public class Author {
    String name, email;
    char gender;

    Scanner scan = new Scanner(System.in);

    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        System.out.println("Enter new email:");
        this.email = scan.next();
    }

    public char getGender() {
        return gender;
    }

    public String toString(){
        return "Author: " + " " + name + " " + email + " " + gender;
    }
}