package ru.mirea.StringRecursion;

public class Recurs {
    public static boolean myContains(String s1, String s2) {
        if (s1 == null || s2 == null)
            return false;
        if (s1.isEmpty() || s2.isEmpty())
            return false;
        if (s1.length() > s2.length())
            return false;

        boolean contains = true;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                contains = false;
                break;
            }
        }
        if (contains == true) {
            return contains;
        }
        return myContains(s1, s2.substring(1));
    }

    public static void main(String[] args) {

        String substring = "abs";
        String str = "abcbabsjkahdhvdfbau";

        System.out.println(myContains(substring, str));
    }
}
