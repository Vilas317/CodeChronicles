public class FindPeakElementII {
    public static int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        //Brute Force
    //     for(int i = 0; i < n; i++) {
    //         for(int j = 0; j < m; j++) {

    //             boolean isPeak = true;

    //             if(i - 1 >= 0 && mat[i][j] <= mat[i - 1][j])
    //             isPeak = false;

    //             if(i + 1 < n && mat[i][j] <= mat[i + 1][j])
    //             isPeak = false;

    //             if(j - 1 >= 0 && mat[i][j] <= mat[i][j - 1])
    //             isPeak = false;

    //             if(j + 1 < m && mat[i][j] <= mat[i][j + 1])
    //             isPeak = false;

    //             if(isPeak) return new int[]{-1 , -1};
    //         }
    //     }
    //     return new int[]{-1, -1};
    // }
    
    // public static void printResult(int[][] mat) {
    //     int[] peak = findPeakGrid(mat);
    //     System.out.println("Peak found at index: (" + peak[0] + ", " + peak[1] + "), Value: " + mat[peak[0]][peak[1]]);
    // }

    //Optimal Approach
    int low = 0, high = m - 1;

    while(low <= high) {
        int mid = (low + high) / 2;

        int maxRow = 0;
        for(int i = 0; i < n; i++) {
            if(mat[i][mid] > mat[maxRow][mid]) {
                maxRow = i;
            }
        }

        int left = (mid - 1 >= 0) ? mat[maxRow][mid - 1] : -1;
        int right = (mid + 1 < 0) ? mat[maxRow][mid + 1] : -1;
        int curr = mat[maxRow][mid];

        if(curr >= left && curr >= right) {
            return new int[] { maxRow, mid };
        } else if (right > curr) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return new int[] { -1, -1 };
}

    public static void main(String[] args) {
        int[][] mat = {
            {10, 20, 15},
            {21, 30, 14},
            {7, 16, 32}
        };

        int[] peak = FindPeakElementII.findPeakGrid(mat);
        System.out.println("Peak found at: [" + peak[0] + ", " + peak[1] + "]");
        System.out.println("Value: " + mat[peak[0]][peak[1]]);
    }
}