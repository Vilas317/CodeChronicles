public class ImplementAtoi {
    public static int atoi(String str) {
        int i = 0, n = str.length();
        int sign = 1;
        long result = 0;
        while(i < n && str.charAt(i) == ' ') {
            i++;
        }
        if(i < n && (str.charAt(i) == '-' || str.charAt(i) == '+')) {
            sign = (str.charAt(i) == '-') ? - 1 : 1;
            i++; 
        }
        while(i < n && Character.isDigit(str.charAt(i))) {
            result = result * 10 + (str.charAt(i) - '0');
            if(sign * result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if(sign * result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            i++;
        }
        return (int)(sign * result);
    }
    
    public static void runTests() {
        String[] testInputs = {
            "42",
            "   -42",
            "4193 with words",
            "words and 987",
            "91283472332",
            "+123",
            "   +0 123",
            "00000-42a1234",
            "-91283472332"
        };

        int[] expectedOutputs = {
            42,
            -42,
            4193,
            0,
            2147483647,  // Integer.MAX_VALUE
            123,
            0,
            0,
            -2147483648  // Integer.MIN_VALUE
        };

        System.out.println("🔹 Running Test Cases for atoi()...");
        for (int i = 0; i < testInputs.length; i++) {
            int result = ImplementAtoi.atoi(testInputs[i]);
            System.out.println("Input: \"" + testInputs[i] + "\"");
            System.out.println("Expected: " + expectedOutputs[i] + ", Got: " + result);
            System.out.println(result == expectedOutputs[i] ? "✅ Passed" : "❌ Failed");
            System.out.println("---------------------------------");
        }
    }

    public static void main(String[] args) {
        runTests();
    }
}