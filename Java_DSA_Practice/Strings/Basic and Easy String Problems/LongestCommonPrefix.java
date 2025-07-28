import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] arr, int n) {
        // Brute
    //     if(n == 0) return "";

    //     String prefix = arr[0];
    //     for(int i = 1; i < n; i++) {
    //         while(!arr[i].startsWith(prefix)) {
    //             prefix = prefix.substring(0, prefix.length() - 1);
    //             if(prefix.isEmpty()) return "";
    //         }
    //     }
    //     return prefix;
    // }

    //Optimal
    StringBuilder result = new StringBuilder();
    Arrays.sort(arr);
    char[] first = arr[0].toCharArray();
    char[] last = arr[arr.length - 1].toCharArray();
    for(int i = 0; i < first.length; i++) {
        if(first[i] != last[i])
        break;
        result.append(first[i]);
    }
    return result.toString();
        
}
    public static void runTests() {
        String[][] testCases = {
            {"flower", "flow", "flight"},
            {"dog", "racecar", "car"},
            {"interview", "internet", "internal"},
            {"apple", "apple", "apple"},
            {"", "abc"}
        };

        for (String[] test : testCases) {
            System.out.println("Input: " + java.util.Arrays.toString(test));
            String ans = longestCommonPrefix(test, test.length);
            System.out.println("Longest Common Prefix: \"" + ans + "\"\n");
        }
    }

    public static void main(String[] args) {
        runTests();
    }
}