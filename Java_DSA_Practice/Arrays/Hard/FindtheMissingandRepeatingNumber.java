package Java_DSA_Practice.Arrays.Hard;

import java.util.*;

public class FindtheMissingandRepeatingNumber {
    public static int[] findMissingRepeatingNumbers(int[] a) {
    // Brute Force
    // int n = a.length;
    // int repeating = -1, missing = -1;

    // for(int i = 1; i < n; i++) {
    // int cnt = 0;
    // for(int j = 0; j < n; j++) {
    // if(a[i] == 0) cnt++;
    // }
    // if(cnt == 2) repeating = i;
    // else if(cnt == 0) missing = i;

    // if(repeating != -1 && missing != -1)
    // break;
    // }
    // int ans[] = {repeating, missing};
    // return ans;
    // }

    // Better Approach
    // int n = a.length;
    // int[] hash = new int[n + 1];

    // for(int i = 0; i < n; i++) {
    // hash[a[i]]++;
    // }

    // int repeating = -1, missing = -1;
    // for(int i = 1; i <= n; i++) {
    // if(hash[i] == 2) repeating = i;
    // else if(hash[i] == 0) missing = i;

    // if(repeating != -1 && missing != -1)
    // break;
    // }
    // int[] ans = {repeating, missing};
    // return ans;
    // }

    //Optimal Approach
    long n = a.length;

    long sn = (n * (n + 1))/2;
    long s2n = (n * (n + 1) * (2 * n + 1))/6;

    long s = 0, s2 = 0;
    for(int i = 0; i < n; i++) {
        s += a[i];
        s2 += (long)a[i] * (long)a[i];
    }

    long val1 = s - sn;

    long val2 = s2 - s2n;

    val2 = val2/val1;

    long x = (val1 + val2) / 2;
    long y = x - val1;

    int[] ans = {(int)x, (int)y};
    return ans;
}
    public static void main(String[] args) {
        int[] a = { 3, 1, 2, 5, 4, 6, 7, 5 };
        int[] ans = findMissingRepeatingNumbers(a);
        System.out.println("The repeating and missing numbers are: {"
                + ans[0] + ", " + ans[1] + "}");
    }
}