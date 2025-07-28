import java.util.*;
public class CountNumberofSubstrings {
    private static int countAtMostK(String s, int k) {
        int n = s.length();
        int left = 0, right = 0;
        int count = 0;
        Map<Character, Integer> freq = new HashMap<>();
        while(right < n) {
            char ch = s.charAt(right);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            while(freq.size() > k) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if(freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }
                left++;
            }
            count += (right - left + 1);
            right++;
        }
        return count;
    }
    public static int countExactlyKDistinct(String s, int k) {
        return countAtMostK(s, k) - countAtMostK(s, k - 1);
    }
    public static void main(String[] args) {
        String s = "pqpqs";
        int k = 2;
        System.out.println("Count of substrings with exactly " + k + " distinct chars: "
                + countExactlyKDistinct(s, k));

        s = "aabacbebebe";
        k = 3;
        System.out.println("Count of substrings with exactly " + k + " distinct chars: "
                + countExactlyKDistinct(s, k));
    }
}
