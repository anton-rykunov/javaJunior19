package lesson12;

public class Matrix implements IMatrix {
    private double[][] matrix;

    public Matrix(int rows, int columns) {
        matrix = new double[rows][columns];
    }

    @Override
    public int getRows() {
        return this.matrix.length;
    }

    @Override
    public int getColumns() {
        return this.matrix[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        return this.matrix[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        this.matrix[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        Matrix matrixAdd = new Matrix(this.matrix.length, otherMatrix.getColumns());
        for (int i = 0; i < matrixAdd.getRows(); i++) {
            for (int j = 0; j < matrixAdd.getColumns(); j++) {
                matrixAdd.setValueAt(i, j, this.matrix[i][j] + otherMatrix.getValueAt(i, j));
            }
        }
        return matrixAdd;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        Matrix matrixSub = new Matrix(this.matrix.length, otherMatrix.getColumns());
        for (int i = 0; i < matrixSub.getRows(); i++) {
            for (int j = 0; j < matrixSub.getColumns(); j++) {
                matrixSub.setValueAt(i, j, matrix[i][j] + otherMatrix.getValueAt(i, j));
            }
        }
        return matrixSub;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        Matrix matrixMul = new Matrix(this.matrix.length, otherMatrix.getColumns());
        return null;
    }

    @Override
    public IMatrix mul(double value) {
        Matrix matrixMulVal = new Matrix(this.matrix.length, this.matrix[0].length);
        for (int i = 0; i < matrixMulVal.getRows(); i++) {
            for (int j = 0; j < matrixMulVal.getColumns(); j++) {
                matrixMulVal.setValueAt(i, j, this.matrix[i][j] * value);
            }
        }
        return matrixMulVal;
    }

    @Override
    public IMatrix transpose() {
        Matrix matrixTranspose = new Matrix(matrix.length, matrix[0].length);
        for (int i = 0; i < matrixTranspose.getRows(); i++) {
            for (int j = 0; j < matrixTranspose.getColumns(); j++) {
                matrixTranspose.setValueAt(i, j, this.matrix[j][matrixTranspose.getRows() - 1 - i]);
            }
        }
        return matrixTranspose;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = value;
            }
        }
    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        boolean volume = false;
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                if (this.matrix[i][j] != 0) {
                    continue;
                } else {
                    volume = true;
                    break;
                }
            }
        }
        return volume;
    }

    @Override
    public boolean isIdentityMatrix() {
        boolean volume = true;
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                if ((i != j && this.matrix[i][j] == 0) || (i == j && this.matrix[i][j] == 1)) {
                    continue;
                } else {
                    volume = false;
                    break;
                }
            }
        }
        return volume;
    }

    @Override
    public boolean isSquareMatrix() {
        boolean volume = false;
        if (this.matrix.length == this.matrix[0].length)
            volume = true;
        return volume;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
