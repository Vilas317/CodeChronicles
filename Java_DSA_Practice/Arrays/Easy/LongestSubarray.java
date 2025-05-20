package Java_DSA_Practice.Arrays.Easy;

import java.util.*;

public class LongestSubarray {
    public static int getLongestSubarray(int[] a, int k) {
        // Brute Foce
        // int n = a.length;

        // int len = 0;
        // for(int i = 0; i < n; i ++) {
        // for(int j = i; j < n; j++) {
        // int s = 0;
        // for (int K = i; K <= j; K++) {
        // s+=a[k];
        // }
        // if(s == k)
        // len = Math.max(len, j - i + 1);
        // }
        // }
        // return len;
        // }

        // Better Approach - Using two loops
        // int n = a.length;

        // int len = 0;
        // for(int i = 0; i < n; i ++) {
        // for(int j = i; j < n; j++) {
        // int s = 0;
        // s+=a[j];
        // if(s == k)
        // len = Math.max(len, j - i + 1);
        // }
        // }
        // return len;
        // }

        // Optimal Approach - Hashing
        int n = a.length;
        HashMap<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }
            int rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] a = { -1, 1, 1 };
        int k = 1;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}