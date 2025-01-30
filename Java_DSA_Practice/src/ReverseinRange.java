public class ReverseinRange {
    public static int[] solve(int[] A, int B, int C) {
        int i = B,  j = C;
        while(i < j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i += 1;
            j -= 1;
        }
        return A;
    }
    public static void main(String[] args) {
        // Test Case 1
        int[] A1 = {1, 2, 3, 4};
        int B1 = 2;
        int C1 = 3;
        int[] result1 = ReverseinRange.solve(A1, B1, C1);
        System.out.println(java.util.Arrays.toString(result1));

        // Test Case 2
        int[] A2 = {2, 5, 6};
        int B2 = 0;
        int C2 = 2;
        int[] result2 = ReverseinRange.solve(A2, B2, C2);
        System.out.println(java.util.Arrays.toString(result2));
    }
}
