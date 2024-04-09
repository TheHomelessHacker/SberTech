package Matrix;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int r = 2;
        int c = 2;
        Matrix matrix1 = new Matrix(r, c);
        Matrix matrix2 = new Matrix(r, c);

        for (int row = 0; row < r; row++) {
            for (int column = 0; column < c; column++) {
                int value = random.nextInt(1, 15);
                matrix1.setValue(row, column, value);
                matrix2.setValue(row, column, value);
            }
        }

        System.out.println("Matrix 1:");
        matrix1.printMatrix();
        System.out.println();

        System.out.println("Matrix 2:");
        matrix2.printMatrix();
        System.out.println();

        System.out.println("Matrix 1 + Matrix 2:");
        Matrix sum = matrix1.sumMatrix(matrix2);
        sum.printMatrix();
        System.out.println();

        System.out.println("Matrix 1 multiplied by 2:");
        Matrix product = matrix1.multiplicationByNumber(2);
        product.printMatrix();
        System.out.println();

        System.out.println("Matrix 1 multiplied by Matrix 2:");
        Matrix product2 = matrix1.multiplyingMatrix(matrix2);
        product2.printMatrix();
    }
}
