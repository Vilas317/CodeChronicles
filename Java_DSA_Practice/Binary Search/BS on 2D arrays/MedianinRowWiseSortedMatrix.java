import java.util.*;

public class MedianinRowWiseSortedMatrix {
    //Brute force
    // public static int median(int matrix[][], int m, int n) {
    //     List<Integer> lst = new ArrayList<>();

    //     for (int i = 0; i < m; i++) {
    //         for (int j = 0; j < n; j++) {
    //             lst.add(matrix[i][j]);
    //         }
    //     }

    //     Collections.sort(lst);
    //     return lst.get((m * n) / 2);
    // }

    //Optimal Apporach
    static int upperBound(int[] arr, int x, int n) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > x) {
                ans = mid;

                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static int countSmallEqual(int[][] matrix, int m, int n, int x) {
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            cnt += upperBound(matrix[i], x, n);
        }
        return cnt;
    }

    static int median(int[][] matrix, int m, int n) {
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;

        for (int i = 0; i < m; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][n - 1]);
        }

        int req = (n * m) / 2;
        while (low <= high) {
            int mid = (low + high) / 2;
            int smallEqual = countSmallEqual(matrix, m, n, mid);
            if (smallEqual <= req) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4, 5},
            {8, 9, 11, 12, 13},
            {21, 23, 25, 27, 29}
        };
        int m = matrix.length, n = matrix[0].length;
        int ans = median(matrix, m, n);
        System.out.println("The median element is: " + ans);
    }
}