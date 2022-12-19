package ru.mirea.PR22;

import java.util.*;


public class PolishCalc {
    static String expression;
    static boolean isDelim(char c) {
        return c == ' ';
    }
    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '%';
    }
    static int priority(char op) {

        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            default:
                return -1;

        }
    }
    static void processOperator(LinkedList<Integer> st, char op) {

        int r = st.removeLast();
        int l = st.removeLast();

        switch (op) {
            case '+':
                st.add(l + r);
                break;
            case '-':
                st.add(l - r);
                break;
            case '*':
                st.add(l * r);
                break;
            case '/':
                st.add(l / r);
                break;
            case '%':
                st.add(l % r);
                break;
        }
    }
    public static Integer calculate(String s) {

        LinkedList<Integer> st = new LinkedList<Integer>();
        LinkedList<Character> op = new LinkedList<Character>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (isDelim(c))
                continue;

            if (c == '(')
                op.add('(');

            else if (c == ')') {
                while (op.getLast() != '(')
                    processOperator(st, op.removeLast());
                op.removeLast();
            }

            else if (isOperator(c)) {

                while (!op.isEmpty() && priority(op.getLast()) >= priority(c))
                    processOperator(st, op.removeLast());
                op.add(c);
            }

            else {

                String operand = "";
                while (i < s.length() && Character.isDigit(s.charAt(i)))
                    operand += s.charAt(i++);
                --i;
                st.add(Integer.parseInt(operand));
            }
        }
        while (!op.isEmpty())
            processOperator(st, op.removeLast());
        return st.get(0);
    }
}

class Test {
    public static void main(String[] args) {

        String classic_string = "63-3+(45+6)/7*5+9";
        String polish_String="63 3 - 45 6 + 7 / 5 * + 9 +";

        PolishCalc test=new PolishCalc();
        test.expression=classic_string;
        PolishCalc test1=new PolishCalc();
        test1.expression=polish_String;

        System.out.printf("Результат=%d", test.calculate(test.expression));
        System.out.printf("\nРезультат=%d", test.calculate(test1.expression));
    }
}
