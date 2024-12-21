public class MinimumNumberofSquares {
    public int countMinSq(int A) {
        int[] dp = new int[A + 1];
        dp[0] = 0;
        for(int i = 1; i <= A; i++) {
            int min = Integer.MAX_VALUE;

            for(int j = 1; j * j <= i; j++) {
                int remaining = i - j * j;
                min = Math.min(min, dp[remaining]);
            }
            dp[i] = min + 1;
        }
        return dp[A];
    }
    public static void main(String[] args) {
        MinimumNumberofSquares solution = new MinimumNumberofSquares();

        // Test Case 1
        int A1 = 6;
        System.out.println("Input: " + A1 + " -> Output: " + solution.countMinSq(A1)); // Expected Output: 3

        // Test Case 2
        int A2 = 5;
        System.out.println("Input: " + A2 + " -> Output: " + solution.countMinSq(A2)); // Expected Output: 2

        // Additional Test Case
        int A3 = 9; // Example Input
        System.out.println("Input: " + A3 + " -> Output: " + solution.countMinSq(A3)); // Expected Output: 1 (3^2 = 9)
    }
}

