package ru.mirea.PR41.Fourth;

public class Tester {

    public static void main(String[] args) {
        Matrix matrix = new Matrix(4, 4);
        Matrix matrixforsum = new Matrix(4, 4);

        matrix.print();
        matrix.sumMatrix(matrixforsum);
        matrix.print();
        matrix.multNum(5);
        matrix.print();
    }

}
