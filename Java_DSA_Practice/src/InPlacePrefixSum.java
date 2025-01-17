import java.util.Arrays;

public class InPlacePrefixSum {
    public static int[] solve(int[] A) {
        int n = A.length;

        if(n == 0) {
            return new int[0];
        }
        for(int i = 1; i < n; i++) {
            A[i] = A[i - 1];
        }
        return A;
    }
    public static void main(String[] args) {
        InPlacePrefixSum solve = new InPlacePrefixSum();

        int[] A1 = {1, 2, 3, 4, 5};
        int[] result1 = InPlacePrefixSum.solve(A1);
        System.out.println(Arrays.toString(result1));

        int[] A2 = {4, 3, 2};
        int[] result2 = InPlacePrefixSum.solve(A2);
        System.out.println(Arrays.toString(result2));
    }
    
}
