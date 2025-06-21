package Java_DSA_Practice.Arrays.Hard;

import java.util.*;

public class NumberofSubarrayswithxorK {
public static int subarraysWithXorK(int []a, int k) {
    //Optimal Approach
//     int n = a.length;
//     int cnt = 0;

//     for (int i = 0; i < n; i++) {
//         for (int j = i; j < n; j++) {

//             int xorr = 0;
//             for (int K = i; K <= j; K++) {
//                 xorr = xorr ^ a[K];
//             }

//             if (xorr == k) cnt++;
//         }
//     }
//     return cnt;
// }

//Better Approach
//     int n = a.length;
//     int cnt = 0;

//     for (int i = 0; i < n; i++) {
//         int xorr = 0;
//         for (int j = i; j < n; j++) {
//             xorr = xorr ^ a[j];

//             if (xorr == k) cnt++;
//         }
//     }
//     return cnt;
// }

//Optimal Approach
int n = a.length;
int xr = 0;
Map<Integer, Integer> mpp = new HashMap<>();
mpp.put(xr, 1);
int cnt = 0;
for(int i = 0; i < n; i++) {
    xr = xr^a[i];
    int x = xr^k;
    if(mpp.containsKey(x)) {
        cnt += mpp.get(x);
    }
    if(mpp.containsKey(xr)) {
        mpp.put(xr, mpp.get(xr) + 1);
    } else {
        mpp.put(xr, 1);
    }
}
return cnt;
}
public static void main(String[] args) {
    int[] a = {4, 2, 2, 6, 4};
    int k = 6;
    int ans = subarraysWithXorK(a, k);
    System.out.println("The number of subarrays with XOR k is: " + ans);
}
}