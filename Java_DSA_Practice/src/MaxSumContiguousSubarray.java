public class MaxSumContiguousSubarray {
    public int maxSubArray(final int[] A) {
        //Brute Force
        /*int n = A.length;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int currentSum = 0;

                for(int k = i; k <= j; k++) {
                    currentSum += A[k];
                }
                maxSum = Math.max(maxSum, currentSum);
            }
        }
    return maxSum;
    
}
public static void main(String[] args) {
    MaxSumContiguousSubarray solution = new MaxSumContiguousSubarray();

    int[] A1 = {1, 2, 3, 4, -10};
    System.out.println(solution.maxSubArray(A1));

    int[] A2 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    System.out.println(solution.maxSubArray(A2));
}
}*/
        //Better Approach
/*      int n = A.length;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            int currentSum = 0;
            for(int j = 0; j < n; j++) {
                currentSum += A[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
    return maxSum;
    
}
public static void main(String[] args) {
    MaxSumContiguousSubarray solution = new MaxSumContiguousSubarray();

    int[] A1 = {1, 2, 3, 4, -10};
    System.out.println(solution.maxSubArray(A1));

    int[] A2 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    System.out.println(solution.maxSubArray(A2));
}
}*/
//optimal approach
int n = A.length;
long maxSum = Long.MIN_VALUE;
long currentSum = 0;

for(int i = 0; i < n; i++) {
    currentSum += A[i];

    maxSum = Math.max(maxSum, currentSum);

    if(currentSum < 0) {
        currentSum = 0;
    }
}
return (int) maxSum;
}
public static void main(String[] args) {
    MaxSumContiguousSubarray solution = new MaxSumContiguousSubarray();

    int[] A1 = {1, 2, 3, 4, -10};
    System.out.println(solution.maxSubArray(A1));

    int[] A2 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    System.out.println(solution.maxSubArray(A2));
}
}

