public class MatrixAddition {
    public static void main(String[] args) {
        double[][] matrixA = {
            {1.0, 2.0},
            {3.0, 4.0}
        };

        double[][] matrixB = {
            {5.0, 6.0},
            {7.0, 8.0}
        };

        double[][] result = addMatrices(matrixA, matrixB);
        printMatrix(result);
    }

    public static double[][] addMatrices(double[][] matrixA, double[][] matrixB) {
        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            throw new IllegalArgumentException("Matrices must be of the same dimensions");
        }

        double[][] result = new double[matrixA.length][matrixA[0].length];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return result;
    }

    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
