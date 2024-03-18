package Matrix;

import java.util.Random;

class Main{
    public static void main(String[] args) {
        Random random = new Random();
        int r = 2;
        int c = 2;
        Matrix matrix1 = new Matrix(r, c);
        Matrix matrix2 = new Matrix(r, c);

        for (int row = 0; row < r; row++){
            for (int column = 0; column < c; column++){
                int value = random.nextInt(1,15);
                matrix1.setValue(row, column, value);
                matrix2.setValue(row, column, value);
            }
        }

//        matrix1.setValue(0, 0, 1);
//        matrix1.setValue(0, 1, 2);
//        matrix1.setValue(1, 0, 3);
//        matrix1.setValue(1, 1, 4);
//
//        matrix2.setValue(0, 0, 5);
//        matrix2.setValue(0, 1, 6);
//        matrix2.setValue(1, 0, 7);
//        matrix2.setValue(1, 1, 8);

        System.out.println("Matrix 1:");
        matrix1.PrintMatrix();

        System.out.println("Matrix 2:");
        matrix2.PrintMatrix();

        System.out.println("Matrix 1 + Matrix 2:");
        Matrix sum = matrix1.SumMatrix(matrix2);
        sum.PrintMatrix();

        System.out.println("Matrix 1 multiplied by 2:");
        Matrix product = matrix1.MultiplicationByNumber(2);
        product.PrintMatrix();

        System.out.println("Matrix 1 multiplied by Matrix 2:");
        Matrix product2 = matrix1.MultiplyingMatrix(matrix2);
        product2.PrintMatrix();
    }
}

public class Matrix {

    private double[][] data;
    private int rows;
    private int columns;

    public void setValue(int row, int column, double value){
        data[row][column] = value;
    }

    protected Matrix(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows][columns];
    }

    protected Matrix SumMatrix(Matrix other){
        Matrix result = new Matrix(rows, columns);
        for (int row = 0; row < rows; row++){
            for(int column = 0; column < columns;column++){
                result.data[row][column] = data[row][column] + other.data[row][column];
            }
        }
        return result;
    }

    protected Matrix MultiplicationByNumber(double value){
        Matrix result = new Matrix(rows, columns);
        for (int row = 0; row < rows; row++){
            for (int column = 0; column < columns; column++){
                result.data[row][column] = data[row][column] * value;
            }
        }
        return result;
    }

    protected Matrix MultiplyingMatrix(Matrix other){
        Matrix result = new Matrix(rows, other.columns);
        for (int row = 0; row < rows; row++){
            for (int column = 0; column < other.columns; column++){
                for (int k = 0; k < columns; k++) {
                    result.data[row][column] += data[row][k] * other.data[k][column];
                }
            }
        }
        return result;
    }

    protected void PrintMatrix(){
        for (int row = 0; row < rows; row++){
            for (int column = 0; column < columns; column++){
                System.out.print(data[row][column] + " ");
            }
            System.out.println();
        }
    }

}
