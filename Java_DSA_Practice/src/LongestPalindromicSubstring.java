public class LongestPalindromicSubstring {
    public String longestPalindrome(String A) {
        if(A == null || A.length() == 0) {
            return "";
        }
        if(A.length() == 1) {
            return A;
        }
        int start = 0;
        int end = 0;
        for(int i = 0; i < A.length(); i++) {
            int len1 = expandAroundCenter(A, i , i);
            int len2 = expandAroundCenter(A, i, i + 1);
            int len = Math.max(len1, len2);
            if(len > end - start + 1) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return A.substring(start, end + 1);
    }
    private int expandAroundCenter(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++; 
        }
        return right - left - 1;
    }
    
}
