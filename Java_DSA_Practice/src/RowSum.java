public class RowSum {
    public int[] solve(int[][] A) {
        int numRows = A.length;

        int[] rowSums = new int[numRows];

        for(int i = 0; i < numRows; i++) {
            int sum = 0;
            for(int j = 0; j < A[i].length; j++) {
                sum  += A[i][j];
            }
            rowSums[1] = sum;
        }
        return rowSums;
    }
    public static void main(String[] args) {
        RowSum rowSum = new RowSum();
        
        int[][] A1 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 2, 3, 4}
        };
        
        int[] result1 = rowSum.solve(A1);
 

        System.out.print("Output 1: [");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i]);
            if (i < result1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int[][] A2 = {
            {2, 3, 6, 7},
            {2, 3, 4, 5}
        };
        
        int[] result2 = rowSum.solve(A2);
        
        System.out.print("Output 2: [");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i]);
            if (i < result2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}