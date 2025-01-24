import java.util.*;

public class Stocks1 {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> A) {
        int maxProfit = 0;  // Initialize the maximum profit to 0
        if (A.size() == 0) {
            return 0; // No transactions possible for empty list
        }
        
        int minPrice = A.get(0); // Initialize the minimum price as the first element of the array
        
        for (int i = 1; i < A.size(); i++) {
            // Calculate profit if we sell at the current price
            int currentProfit = A.get(i) - minPrice;
            // Update maxProfit if currentProfit is greater
            maxProfit = Math.max(maxProfit, currentProfit);
            // Update minPrice if current price is smaller
            minPrice = Math.min(minPrice, A.get(i));
        }
        
        return maxProfit;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test case 1
        List<Integer> A1 = Arrays.asList(1, 2);
        System.out.println("Test Case 1: " + sol.maxProfit(A1)); // Expected output: 1

        // Test case 2
        List<Integer> A2 = Arrays.asList(1, 4, 5, 2, 4);
        System.out.println("Test Case 2: " + sol.maxProfit(A2)); // Expected output: 4

        // Test case 3 (Edge case: No elements in the list)
        List<Integer> A3 = Collections.emptyList();
        System.out.println("Test Case 3: " + sol.maxProfit(A3)); // Expected output: 0

        // Test case 4 (Edge case: Single element in the list)
        List<Integer> A4 = Arrays.asList(5);
        System.out.println("Test Case 4: " + sol.maxProfit(A4)); // Expected output: 0
    }
}
