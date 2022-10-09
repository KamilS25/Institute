package ru.mirea.PR41.Fourth;

import java.util.Random;

public class Matrix {

    int rows;
    int columns;

    int arr[][];

    Random rand = new Random();

    public Matrix(int columns, int rows) {
        this.columns = columns;
        this.rows = rows;

        arr = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = rand.nextInt(1, 10);
            }
        }
    }

    public void sumMatrix(Matrix matrix) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] += matrix.arr[i][j];
            }
        }
    }

    public void multNum(int num) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] *= num;
            }
        }
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[j][i] + " ");;
            }
            System.out.println();
        }
        System.out.println();
    }
}
