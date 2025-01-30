import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        StringBuilder result = new StringBuilder();

        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        for(int i = 0; i < first.length; i++) {
            if(i >= last.length || first[i] != last[i])
            break;
            result.append(first[i]);
        }
        return result.toString();
    }
    public static void main(String[] args) {

        String[] A1 = {"abcdefgh", "aefghijk", "abcefgh"};
        System.out.println("Output 1: \"" + LongestCommonPrefix.longestCommonPrefix(A1) + "\"");

        String[] A2 = {"abab", "ab", "abcd"};
        System.out.println("Output 2: \"" + LongestCommonPrefix.longestCommonPrefix(A2) + "\"");
    }
    
}
