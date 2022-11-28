package ru.mirea.PR25;

import java.util.Scanner;
import java.util.regex.*;

public class Password {

    public static boolean isPasswordValid(String password){

        if (password == null){
            System.out.println("Вы не ввели пароль!");
            return false;
        }

        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=!?])"
                + "(?=\\S+$).{8,15}$";

        Pattern pat = Pattern.compile(regex);
        Matcher match = pat.matcher(password);

        return match.matches();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Логин: ");
        scan.next();

        System.out.println("Придумайте пароль (Пароль должен содержать не менее 8 и не более 20 символов, он должен быть " +
                "без пробелов, также в нем должны содержаться минимум одна заглавная буква, одна строчная, одна цифра" +
                " и один символ, пароль только на английском языке). ");

        System.out.println("Пароль: ");

        String password = scan.next();

        while(!isPasswordValid(password)){
            System.out.println("Неккоректный пароль, попробуйте снова: ");
            password = scan.next();
        }

        System.out.println("Вы успешно зарегистрировались!");

    }

}
