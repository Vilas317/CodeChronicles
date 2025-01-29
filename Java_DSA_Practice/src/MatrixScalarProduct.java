public class MatrixScalarProduct {
    public int[][] solve(int[][] A, int B) {
        int rows = A.length;
        int cols = A[0].length;

        int[][] result = new int[rows][cols];

        for(int i = 0; i < rows; i++) {
            for(int j  = 0; j < cols; j++) {
                result[i][j] = A[i][j]* B;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        MatrixScalarProduct matrixScalarProduct = new MatrixScalarProduct();

        int[][] A1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int B1 = 2;
        int[][] output1 = matrixScalarProduct.solve(A1, B1);
        printMatrix(output1);

        int[][] A2 = {{1}};
        int B2 = 5;
        int[][] output2 = matrixScalarProduct.solve(A2, B2);
        printMatrix(output2);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
