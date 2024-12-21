public class DistributeCandy {
    public int candy(int[] A) {
        int n = A.length;
        //Brute Force
        /*int[] left = new int[n];
        int[] right = new int[n];
        
        Arrays.fill(left, 1);  // Each child gets at least one candy
        Arrays.fill(right, 1);

        // Traverse from left to right
        for (int i = 1; i < n; i++) {
            if (A[i] > A[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
        }

        // Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] > A[i + 1]) {
                right[i] = right[i + 1] + 1;
            }
        }

        // Calculate the total candies required
        int totalCandies = 0;
        for (int i = 0; i < n; i++) {
            totalCandies += Math.max(left[i], right[i]);
        }

        return totalCandies;
    }

    public static void main(String[] args) {
        DistributeCandy solution = new DistributeCandy();

        // Test case 1
        int[] A1 = {1, 2};
        System.out.println("Output 1: " + solution.candy(A1)); // Expected: 3

        // Test case 2
        int[] A2 = {1, 5, 2, 1};
        System.out.println("Output 2: " + solution.candy(A2)); // Expected: 7
    }
}*/
//Optimal Approach
if(n == 1) return 1;
int candies = 0;
int up = 0, down = 0, peak = 0;
for(int i = 1; i < n; i++) {
    if(A[i] > A[i - 1]) {
        up++;
        peak = up;
        down = 0;
        candies += up + 1;
    } else if (A[i] < A[i - 1]) {
        down++;
        up = 0;
        candies += down + 1;
        if(down > peak) {
            candies++;
        }
    } else  {
        up = 0;
        down = 0;
        peak = 0;
        candies++;
    }
}
return candies;
}
public static void main(String[] args) {
    DistributeCandy solution = new DistributeCandy();

    // Test case 1
    int[] A1 = {1, 2};
    System.out.println("Output 1: " + solution.candy(A1));

    // Test case 2
    int[] A2 = {1, 5, 2, 1};
    System.out.println("Output 2: " + solution.candy(A2));

}
}