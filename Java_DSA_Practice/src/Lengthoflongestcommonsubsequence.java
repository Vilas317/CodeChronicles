public class Lengthoflongestcommonsubsequence {
    static int lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        int pre[] = new int[m + 1];
        int cur[] = new int[m + 1];

        for(int ind1 = 1; ind1 <= n; ind1++) {
            for(int ind2 = 1; ind2 <= m; ind2++) {
                if(s1.charAt(ind1 - 1) == s2.charAt(ind2 - 1))
                cur[ind2] = 1 + pre[ind2 - 1];

                else
                cur[ind2] = Math.max(pre[ind2], cur[ind2 - 1]);
            }
            pre = (int[]) (cur.clone());
        }
        return pre[m];
    }
    public static void main(String args[]) {
        String s1 = "acd";
        String s2 = "ced";

        System.out.println("The Length of Longest Common Subsequence is " + lcs(s1, s2));
    }
}