package ru.mirea.Stack1;

public class Tester {

    public static void main(String[] args) {
        StackEx<Integer> st = new StackEx<>(10);

        for (int i = 0; i < st.size; i++){
            st.push(i+1);
        }


        st.onDisp();

        System.out.println();
        st.pop();
        System.out.println(st.pop());

        st.peek();
        st.pop();
        st.pop();
        st.push(25);
        System.out.println(st.getLength());
        st.onDisp();
    }
}
