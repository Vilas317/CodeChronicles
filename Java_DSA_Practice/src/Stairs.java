public class Stairs {
    public int climbStairs(int A) {
        if(A == 1) return 1;
        if(A == 2) return 2;

        final int MOD = 1000000007;

        int prev2 = 1;
        int prev = 2;

        for(int i = 3; i <= A; i++) {
            int cur = (prev + prev2) % MOD;
            prev2 = prev;
            prev = cur;
        }

        return prev;
    }
    public static void main(String[] args) {
        Stairs solution = new Stairs();

        // Example Input 1
        int A1 = 2;
        System.out.println("Output 1: " + solution.climbStairs(A1)); // Expected Output: 2

        // Example Input 2
        int A2 = 3;
        System.out.println("Output 2: " + solution.climbStairs(A2)); // Expected Output: 3

        // Additional Test Case
        int A3 = 9;
        System.out.println("Output 3: " + solution.climbStairs(A3)); // Expected Output: 55
    }
}

