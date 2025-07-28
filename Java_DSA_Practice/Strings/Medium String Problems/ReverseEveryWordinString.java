public class ReverseEveryWordinString {
    public static String reverseString(String str) {
        String[] words = str.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if(i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
    
    public static void testReverseString() {
        String[][] testCases = {
            {"  hello   world  ", "world hello"},
            {"a good   example", "example good a"},
            {"single", "single"},
            {"   multiple    spaces   here ", "here spaces multiple"},
            {"", ""} // empty string
        };

        for (int i = 0; i < testCases.length; i++) {
            String input = testCases[i][0];
            String expected = testCases[i][1];
            String result = reverseString(input);

            if (result.equals(expected)) {
                System.out.println("✅ Test " + (i + 1) + " Passed");
            } else {
                System.out.println("❌ Test " + (i + 1) + " Failed: Expected '" + expected + "', but got '" + result + "'");
            }
        }
    }

    public static void main(String[] args) {
        testReverseString();
    }
}