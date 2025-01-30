import java.util.Arrays;

public class SumEvenIndices {
    public static int[] solve(int[] A, int[][] B) {
        int n = A.length;
        int[] pref = new int[n];

        for(int i = 0; i < n; i++) {
            if(i > 0) {
                pref[i] = pref[i - 1];
            }
            if(i % 2 == 0) {
                pref[i] += A[i];
            }
        }

        int[] ans = new int[B.length];

        for(int i = 0; i < B.length; i++) {
            int L = B[i][0];
            int R = B[i][1];
            int val = pref[R];
            if(L > 0) {
                val = -pref[L - 1];
            }
            ans[i] = val;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A1 = {1, 2, 3, 4, 5};
        int[][] B1 = {{0, 2}, {1, 4}};
        int[] result1 = SumEvenIndices.solve(A1, B1);
        System.out.println(Arrays.toString(result1));
        
        int[] A2 = {2, 1, 8, 3, 9};
        int[][] B2 = {{0, 3}, {2, 4}};
        int[] result2 = SumEvenIndices.solve(A2, B2);
        System.out.println(Arrays.toString(result2));
    }
    
}
