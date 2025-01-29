public class MatrixTranspose {
    public int[][] solve(int[][] A) {

        int numRows = A.length;
        int numCols = A[0].length;

        int[][] transpose = new int[numCols][numRows];

        for(int i = 0; i < numRows; i++) {
            for(int j = 0; j < numCols; j++) {
                transpose[j][i] = A[i][j];
            }
        }
        return transpose;

    }
    public static void main(String[] args) {
        MatrixTranspose matrixTranspose = new MatrixTranspose();
        
        // Example Input 1
        int[][] A1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
   
        int[][] result1 = matrixTranspose.solve(A1);
        
        System.out.println("Transpose of Input 1:");
        for (int[] row : result1) {
            System.out.print("[");
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j]);
                if (j < row.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

        int[][] A2 = {
            {1, 2},
            {1, 2},
            {1, 2}
        };
        
        int[][] result2 = matrixTranspose.solve(A2);
        
        System.out.println("Transpose of Input 2:");
        for (int[] row : result2) {
            System.out.print("[");
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j]);
                if (j < row.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
