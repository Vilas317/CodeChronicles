package Java_DSA_Practice.Arrays.Hard;
import java.util.*;
public class LengthofthelongestsubarraywithzeroSum {
    // static int solve(int[] a){
    //     int n = a.length;
    //     int max = 0;
    //     for(int i = 0; i < n; i++) {
    //         int sum = 0;
    //         for(int j = i; j < n; j++) {
    //             sum += a[j];
    //             if(sum == 0) {
    //                 max = Math.max(max, j-i+1);
    //             }
    //         }
    //     }
    //     return max;
    // }
    //Optimal Approach
    static int maxLen(int A[], int n) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int maxm = 0;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += A[i];
            if(sum == 0) {
                maxm = i + 1; 
            } else {
                if(mpp.containsKey(sum)) {
                    maxm = Math.max(maxm, i - mpp.get(sum));
                } else {
                    mpp.put(sum, i);
                }
            }
        }
        return maxm;
    }

    public static void main(String args[]) { 
        int a[] = {9, -3, 3, -1, 6, -5};
        System.out.println(maxLen(a, a.length));
    } 
}