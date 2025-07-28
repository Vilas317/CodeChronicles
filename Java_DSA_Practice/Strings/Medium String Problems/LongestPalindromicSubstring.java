public class LongestPalindromicSubstring {
    public static String LongestPalindrome(String str) {
        if(str.length() <= 1)
        return str;
        String LPS = "";
        for(int i = 1; i < str.length(); i++) {
            int low = i;
            int high = i;
            while(str.charAt(low) == str.charAt(high)) {
                low--;
                high++;
                if(low == -1 || high == str.length())
                break;
            }
            String palindrome = str.substring(low + 1, high);
            if(palindrome.length() > LPS.length()) {
                LPS = palindrome;
            }
            low = i - 1;
            high = i;
            while(str.charAt(low) == str.charAt(high)) {
                low--;
                high++;
                if(low == -1 || high == str.length())
                break;
            }
            palindrome = str.substring(low + 1, high);
            if(palindrome.length() > LPS.length()) {
                LPS = palindrome;
            }
        }
        return LPS;
    }
    public static void runTests() {
        LongestPalindromicSubstring solver = new LongestPalindromicSubstring();

        String[] testStrings = {
                "babad",
                "cbbd",
                "a",
                "ac",
                "forgeeksskeegfor",
                "racecar"
        };

        for (String s : testStrings) {
            System.out.println("Input: " + s);
            System.out.println("Longest Palindromic Substring: " + solver.LongestPalindrome(s));
            System.out.println("----------------------------------");
        }
    }

    public static void main(String[] args) {
        runTests();
    }
}