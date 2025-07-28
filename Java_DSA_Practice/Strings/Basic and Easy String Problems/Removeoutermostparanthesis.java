public class Removeoutermostparanthesis {
    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int openCount = 0;
        
        for (char ch : s.toCharArray()) {
            if(ch == '(') {
                if(openCount > 0) {
                    result.append(ch);
                }
                openCount++;
            } else {
                openCount--;
                if(openCount < 0) {
                    result.append(ch);
                }
            }
        }
        return result.toString();
    }
    public static void runTests() {
        String[] inputs = {
            "(()())(())",
            "(()())(())(()(()))",
            "()()",
            "((()))",
            "()(())"
        };

        String[] expected = {
            "()()",
            "()()()(())",
            "",
            "()",
            "()()"
        };

        for (int i = 0; i < inputs.length; i++) {
            String input = inputs[i];
            String output = removeOuterParentheses(input);
            System.out.println("Test Case " + (i + 1) + ":");
            System.out.println("Input:    " + input);
            System.out.println("Expected: " + expected[i]);
            System.out.println("Output:   " + output);
            System.out.println(output.equals(expected[i]) ? "✅ Passed" : "❌ Failed");
            System.out.println();
        }
    }

    // Main function to run tests
    public static void main(String[] args) {
        runTests();
    }
}