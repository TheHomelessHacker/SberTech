package Matrix;

public class Matrix {

    private double[][] data;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows][columns];
    }

    public void setValue(int row, int column, double value) {
        data[row][column] = value;
    }

    public Matrix sumMatrix(Matrix other) {
        Matrix result = new Matrix(rows, columns);
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                result.data[row][column] = data[row][column] + other.data[row][column];
            }
        }
        return result;
    }

    public Matrix multiplicationByNumber(double value) {
        Matrix result = new Matrix(rows, columns);
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                result.data[row][column] = data[row][column] * value;
            }
        }
        return result;
    }

    public Matrix multiplyingMatrix(Matrix other) {
        Matrix result = new Matrix(rows, other.columns);
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < other.columns; column++) {
                for (int k = 0; k < columns; k++) {
                    result.data[row][column] += data[row][k] * other.data[k][column];
                }
            }
        }
        return result;
    }

    public void printMatrix() {
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                System.out.print(data[row][column] + " ");
            }
            System.out.println();
        }
    }

}
