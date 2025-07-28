public class MaximumNestingDepthParanthesis {
    public static int maxDepth(String s) {
        int maxDepth = 0;
        int currentDepth = 0;
        for(char c : s.toCharArray()) {
            if(c == '(') {
                currentDepth++;
                maxDepth = Math.max(maxDepth, currentDepth);
            } else if (c == ')') {
                currentDepth--;
            }
        }
        return maxDepth;
    }
    
    public static void runTestCases() {
        String[] testCases = {
            "(1+(2*3)+((8)/4))+1",  // Expected: 3
            "(1)+((2))+(((3)))",    // Expected: 3
            "1+2*3",                // Expected: 0 (no parentheses)
            "((()))",               // Expected: 3
            "(()(()))",             // Expected: 3
            "()",                   // Expected: 1
            ""                      // Expected: 0 (empty string)
        };

        System.out.println("✅ Running Test Cases:");
        for (String s : testCases) {
            System.out.println("Input: " + s + " → Max Depth = " + maxDepth(s));
        }
    }

    public static void main(String[] args) {
        runTestCases();
    }
}
