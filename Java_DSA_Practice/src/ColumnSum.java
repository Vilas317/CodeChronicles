public class ColumnSum {
    public static int[] solve(int[][] A) {
        if(A == null || A.length == 0 || A[0].length == 0) {
            return new int[0];
        }
        int numRows = A.length;
        int numCols = A[0].length;
        int[] ColumnSum = new int[numCols];

        for(int j = 0; j < numCols; j++) {
            for(int i = 0; i < numRows; i++) {
                ColumnSum[j] += A[i][j];
            }
        }
        return ColumnSum;
    }
    public static void main(String[] args) {
        int[][] input = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 2, 3, 4}
        };

        int[] result = ColumnSum.solve(input);

        System.out.print("{");
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if(i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
        
    }
}