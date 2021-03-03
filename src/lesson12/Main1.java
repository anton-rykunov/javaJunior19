package lesson12;

public class Main1 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 3);

        System.out.println(matrix.getRows());
        System.out.println(matrix.getColumns());
        matrix.setValueAt(0, 0, 2);
        matrix.setValueAt(0, 1, 3);
        matrix.setValueAt(0, 2, 3);

        matrix.setValueAt(1, 0, 4);
        matrix.setValueAt(1, 1, 2);
        matrix.setValueAt(1, 2, 1);

        matrix.setValueAt(2, 0, 1);
        matrix.setValueAt(2, 1, 4);
        matrix.setValueAt(2, 2, 1);

        System.out.println(matrix.getValueAt(2, 1));
        matrix.printToConsole();
        Matrix matrix1 = new Matrix(3, 3);
        matrix1.fillMatrix(5);
        System.out.println();
        matrix1.printToConsole();
        System.out.println();
        IMatrix matrixAdd = matrix.add(matrix1);
        matrixAdd.printToConsole();
        IMatrix matrixAddVal = matrixAdd.mul(2);
        System.out.println();
        matrixAddVal.printToConsole();
        IMatrix matrixTranspose = matrixAddVal.transpose();
        System.out.println();
        matrixTranspose.printToConsole();
        System.out.println();
        System.out.println(matrixTranspose.isNullMatrix());
        System.out.println(matrixTranspose.isSquareMatrix());
        System.out.println();
        Matrix matrix3 = new Matrix(3, 3);
        matrix3.fillMatrix(0);
        matrix3.setValueAt(0, 0, 1);
        matrix3.setValueAt(1, 1, 1);
        matrix3.setValueAt(2, 2, 1);
        System.out.println(matrix3.isIdentityMatrix());
    }
}
