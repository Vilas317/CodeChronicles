public class RainWaterTrapped {
    public int trap(final int[] A) {
        //Brute Force
        /*int n = A.length;
        if(n == 0) return 0;

        int totalWater = 0;

        for(int i = 0; i < n; i++) {
            int leftMax = 0, rightMax = 0;

            for(int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, A[j]);
            }
            for(int j = i; j < n; j++) {
                rightMax = Math.max(rightMax, A[j]);
            }

            totalWater += Math.max(0, Math.min(leftMax, rightMax) - A[i]);
        }

        return totalWater;
    }

    public static void main(String[] args) {
        RainWaterTrapped solution = new RainWaterTrapped();
        int[] A1 = {0, 1, 0, 2};
        System.out.println(solution.trap(A1));

        int[] A2 = {1, 2};
        System.out.println(solution.trap(A2));
    }
    
}*/
//better approach
/*int n = A.length;
        if(n == 0) return 0;
        
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = A[0];
        for(int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], A[i]);
        }

        rightMax[n - 1] = A[n - 1];
        for(int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], A[i]);
        }

        int totalWater = 0;
        for(int i = 0; i < n; i++) {
            totalWater += Math.max(0, Math.min(leftMax[i], rightMax[i]) - A[i]);
        }

        return totalWater;
    }
    public static void main(String[] args) {
        RainWaterTrapped solution = new RainWaterTrapped();
        int[] A1 = {0, 1, 0, 2};
        System.out.println(solution.trap(A1));

        int[] A2 = {1, 2};
        System.out.println(solution.trap(A2));
    }
    
}*/
//Optimal Approach
int n = A.length;
        if(n == 0) return 0;

        int left = 0, right = n -1;
        int leftMax = A[left], rightMax = A[right];
        int totalWater = 0;

        while(left <= right) {
            if(leftMax <= rightMax) {
                if(A[left] < leftMax) {
                    totalWater += leftMax - A[left];
                } else {
                    leftMax = A[left];
                }
                left++;
            }
         else {
                if(A[right] < rightMax) {
                    totalWater += rightMax - A[left];
                } else {
                    rightMax = A[right];
                }
                right--;
            }
        }

        return totalWater;
    }
    public static void main(String[] args) {
        RainWaterTrapped solution = new RainWaterTrapped();
        int[] A1 = {0, 1, 0, 2};
        System.out.println(solution.trap(A1));

        int[] A2 = {1, 2};
        System.out.println(solution.trap(A2));
    }
    
}
