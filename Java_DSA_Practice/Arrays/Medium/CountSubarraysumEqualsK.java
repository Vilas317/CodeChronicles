import java.util.HashMap;

import java.util.*;

public class CountSubarraysumEqualsK {
    public static int findAllSubarraysWithGivenSum(int arr[], int K) {
        //Brute Force
    //     int n = arr.length;
    //     int cnt = 0;
    //     for(int i = 0; i < n; i++) {
    //         for(int j = i; j < n; j++) {
    //             int sum = 0;
    //             for(int k = i; k <= j; k++) {
    //                 sum += arr[k];
    //                 if(sum == K)
    //                 cnt++;
    //             }
    //         }
    //     }
    //     return cnt;
    // }

    //Better Approach
    //      int n = arr.length;
    //     int cnt = 0;
    //     for(int i = 0; i < n; i++) {
    //         int sum = 0;
    //         for(int j = i; j < n; j++) {
    //             sum += arr[j];
                    
    //                 if(sum == K)
    //                 cnt++;
    //             }
    //         }
    //     return cnt;
    // }

    //Optimal Approach
    int n = arr.length;
        Map<Integer, Integer> mpp = new HashMap<>();
        int preSum = 0, cnt = 0;

        mpp.put(0, 1);
        for (int i = 0; i < n; i++) {

            preSum += arr[i];

            int remove = preSum - K;

            cnt += mpp.getOrDefault(remove, 0);

            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }
        public static void main(String[] args) {
            int[] arr = {3, 1, 2, 4};
            int k = 6;
            int cnt = findAllSubarraysWithGivenSum(arr, k);
            System.out.println("The number of subarrays is: " + cnt);
        }
    }