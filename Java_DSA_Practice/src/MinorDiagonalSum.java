public class MinorDiagonalSum {
    public int solve(final int[][] A) {
        int numRows = A.length;

        int sum = 0;

        for(int i = 0; i < numRows; i++) {
            sum  += A[numRows - 1 - i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        MinorDiagonalSum minorDiagonalSum = new MinorDiagonalSum();

        int[][] A1 = {
            {1, -2, -3},
            {-4, 5, -6},
            {-7, -8, 9}
        };
        int result1 = minorDiagonalSum.solve(A1);
        System.out.println("Output 1: " + result1);

        int[][] A2 = {
            {3, 2},
            {2, 3}
        };
        int result2 = minorDiagonalSum.solve(A2);
        System.out.println("Output 2: " + result2);
    }
}
