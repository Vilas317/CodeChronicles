public class Largestoddnumberinstring {
    public String largestOddNumber(String num) {
        int n = num.length();
        for(int i = n - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            int digit = ch - '0';
            if(digit%2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
    
    public static void main(String[] args) {
        Largestoddnumberinstring solution = new Largestoddnumberinstring();

        // ✅ Test Case 1
        String input1 = "1234567890";
        System.out.println("Input: " + input1);
        System.out.println("Largest odd number: " + solution.largestOddNumber(input1));
        System.out.println();

        // ✅ Test Case 2
        String input2 = "4206";
        System.out.println("Input: " + input2);
        System.out.println("Largest odd number: " + solution.largestOddNumber(input2));
        System.out.println();

        // ✅ Test Case 3
        String input3 = "35427";
        System.out.println("Input: " + input3);
        System.out.println("Largest odd number: " + solution.largestOddNumber(input3));
        System.out.println();

        // ✅ Test Case 4 (Edge Case: All even digits)
        String input4 = "24680";
        System.out.println("Input: " + input4);
        System.out.println("Largest odd number: " + solution.largestOddNumber(input4));
        System.out.println();

        // ✅ Test Case 5 (Edge Case: Already ends with odd digit)
        String input5 = "13579";
        System.out.println("Input: " + input5);
        System.out.println("Largest odd number: " + solution.largestOddNumber(input5));
        System.out.println();
    }
}
