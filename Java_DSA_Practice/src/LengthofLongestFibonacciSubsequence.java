import java.util.HashMap;
import java.util.Map;

public class LengthofLongestFibonacciSubsequence {
    public int solve(int[] A) {
        if(A == null || A.length < 3) {
            return 0;
        }

        int len = A.length;
        int[][] dp = new int[len][len];
        Map<Integer, Integer> indexmap = new HashMap<>();

        for(int i = 0; i < len; i++) {
            indexmap.put(A[i], i);
        }

        int maxLen = 0;

        for(int j = 1; j< len; j++) {
            for(int i = 0; i < j; i++) {
                int prev = A[j] - A[i];

                if(prev < A[i] && indexmap.containsKey(prev)) {
                    int k = indexmap.get(prev);
                    dp[i][j] = Math.max(dp[k][i] + 1, 3);
                    maxLen = Math.max(maxLen, dp[i][j]);
                }
            }
        }
        return maxLen >= 3 ? maxLen : 0;
    }
    public static void main(String[] args) {
        LengthofLongestFibonacciSubsequence solution = new LengthofLongestFibonacciSubsequence();

        // Example Input 1
        int[] A1 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Output 1: " + solution.solve(A1)); // Expected Output: 5

        // Example Input 2
        int[] A2 = {1, 3, 7, 11, 12, 14, 18};
        System.out.println("Output 2: " + solution.solve(A2)); // Expected Output: 3
    }
}
