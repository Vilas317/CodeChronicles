public class SumofBeautyofallsubstring {
    public static int sumOfBeauty(String s) {
        //Brute Force
    //     int n = s.length();
    //     int totalBeauty = 0;
    //     for(int i = 0; i < n; i++) {
    //         for(int j = i; j < n; j++) {
    //             int[] freq = new int[26];
    //             for(int k = i; k <= j; k++) {
    //                 char ch = s.charAt(k);
    //                 freq[ch - 'a']++;
    //             }
    //             int maxFreq = 0;
    //             int minFreq = Integer.MAX_VALUE;
    //             for(int f : freq) {
    //                 if(f > 0) {
    //                     maxFreq = Math.max(maxFreq, f);
    //                     minFreq = Math.min(minFreq, f);
    //                 }
    //             }
    //             totalBeauty += (maxFreq - minFreq);
    //         }
    //     }
    //     return totalBeauty;
    // }
    int n = s.length();
    int totalBeauty = 0;
    for (int i = 0; i < n; i++) {
        int[] freq = new int[26]; 
        for (int j = i; j < n; j++) {
            char ch = s.charAt(j);
            freq[ch - 'a']++; 
            int maxFreq = 0;
            int minFreq = Integer.MAX_VALUE;
            for (int f : freq) {
                if (f > 0) {
                    maxFreq = Math.max(maxFreq, f);
                    minFreq = Math.min(minFreq, f);
                }
            }

            totalBeauty += (maxFreq - minFreq);
        }
    }

    return totalBeauty;
}
public static void main(String[] args) {
    String s = "aabcb";
    System.out.println(sumOfBeauty(s)); // Output: 5
}
}