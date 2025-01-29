public class AntiDiagonals {
    public int[][] diagonal(int[][] A) {
        int N = A.length;
        int[][] result = new int[2 * N - 1][N];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                result[i + j][N - 1 - j] = A[i][j];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        AntiDiagonals antiDiagonals = new AntiDiagonals();

        int[][] A1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] output1 = antiDiagonals.diagonal(A1);
        printMatrix(output1);

        int[][] A2 = {
            {1, 2},
            {3, 4}
        };
        int[][] output2 = antiDiagonals.diagonal(A2);
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
