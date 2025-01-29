import java.util.Arrays;

public class RotateMatrix {
    public void solve(int[][] A) {
        int n = A.length;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n/2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][n - j - 1];
                A[i][n - j - 1] = temp;
            }
        }
    }
    
    public static void main(String[] args) {
        RotateMatrix rotateMatrix = new RotateMatrix();

        int[][] A1 = {
            {1, 2},
            {3, 4}
        };
        rotateMatrix.solve(A1);
        System.out.println("Rotated Image 1:");
        for (int[] row : A1) {
            System.out.println(Arrays.toString(row));
        }

        int[][] A2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        rotateMatrix.solve(A2);
        System.out.println("Rotated Image 2:");
        for (int[] row : A2) {
            System.out.println(Arrays.toString(row));
        }
    }
}
