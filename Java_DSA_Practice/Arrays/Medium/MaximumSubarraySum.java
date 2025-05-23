public class MaximumSubarraySum {
    public static int maxSubarraySum(int[] arr, int n) {
        //Brute Force
    //     int maxm = Integer.MIN_VALUE;

    //     for(int i = 0; i < n; i++) {
    //         for(int j = i; j < n; j++) {
    //             int sum = 0;
    //             for(int k = i; k < j; k++) {
    //                 sum += arr[k];
    //             }
    //             maxm = Math.max(maxm, sum);
    //         }
    //     }
    //     return maxm;
    // }

    //Bettter Approach
    // int maxm = Integer.MIN_VALUE;

    //     for (int i = 0; i < n; i++) {
    //         int sum = 0;
    //         for (int j = i; j < n; j++) {
    //             sum += arr[j];

    //             maxm = Math.max(maxm, sum);
    //         }
    //     }

    //     return maxm;
    // }

    //Optimal Approach - Kadane's Algorithm
    long maxm = Integer.MIN_VALUE;
    long sum = 0;
    for(int i = 0; i < n; i++) {
        sum += arr[i];
        if(sum > maxm) {
            maxm = sum;
        }
        if(sum < 0) {
            sum = 0;
        }
    }
    return (int) maxm;
}
    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }

}