public class AddMatrices {
    public int[][] solve(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        AddMatrices addMatrices = new AddMatrices();

        int[][] A1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] B1 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        int[][] output1 = addMatrices.solve(A1, B1);
            printMatrix(output1);

        int[][] A2 = {
            {1, 2, 3},
            {4, 1, 2},
            {7, 8, 9}
        };
        int[][] B2 = {
            {9, 9, 7},
            {1, 2, 4},
            {4, 6, 3}
        };
        int[][] output2 = addMatrices.solve(A2, B2);
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