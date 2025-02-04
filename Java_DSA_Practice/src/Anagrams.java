public class Anagrams {
    public static int solve(String A, String B) {
        if(A.length() != B.length()) {
            return 0;
        }
        int[] countA = new int[26];
        int[] countB = new int[26];

        for(int i = 0; i < A.length(); i++) {
            countA[A.charAt(i) - 'a']++;
            countB[B.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if(countA[i] != countB[i]) {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {

        String A1 = "cat";
        String B1 = "bat";
        int result1 = Anagrams.solve(A1, B1);
        System.out.println("Test Case 1: Expected Output: 0, Actual Output: " + result1);

        String A2 = "secure";
        String B2 = "rescue";
        int result2 = Anagrams.solve(A2, B2);
        System.out.println("Test Case 2: Expected Output: 1, Actual Output: " + result2);
    }
}