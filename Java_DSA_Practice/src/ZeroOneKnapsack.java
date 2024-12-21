public class ZeroOneKnapsack {
    public int solve(int[] A, int[] B, int C) {
        int n = A.length;
        int[] dp = new int[C+1];
        for(int i = 0; i < n; i++) {
            for(int j = C; j >= B[i]; j--) {
                dp[j] = Math.max(dp[j], A[i] + dp[j - B[i]]);
            }
        }
        return dp[C];
    }
    public static void main(String[] args) {
        ZeroOneKnapsack solution = new ZeroOneKnapsack();

        // Example Input 1
        int[] A1 = {60, 100, 120};
        int[] B1 = {10, 20, 30};
        int C1 = 50;
        System.out.println("Output 1: " + solution.solve(A1, B1, C1)); // Expected Output: 220

        // Example Input 2
        int[] A2 = {10, 20, 30, 40};
        int[] B2 = {12, 13, 15, 19};
        int C2 = 10;
        System.out.println("Output 2: " + solution.solve(A2, B2, C2)); // Expected Output: 0
    }
}

