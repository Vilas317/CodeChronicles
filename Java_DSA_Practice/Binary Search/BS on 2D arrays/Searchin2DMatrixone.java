import java.util.*;

public class Searchin2DMatrixone {
    //Brute Force
    // public static boolean searchMatrix(ArrayList<ArrayList<Integer>> matrix, int target) {
    //     int n = matrix.size(), m = matrix.get(0).size();
    //     for(int i = 0; i < n; i++) {
    //         for(int j = 0; j < m; j++) {
    //             if(matrix.get(i).get(j) == target)
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    //Better Approach
    // public static boolean binarySearch(ArrayList<Integer> nums, int target) {
    //     int n = nums.size();
    //     int low = 0, high = n - 1;
    //     while(low <= high) {
    //         int mid = (low + high) / 2;
    //         if(nums.get(mid) == target) return true;
    //         else if(target > nums.get(mid)) low = mid + 1;
    //         else high = mid - 1;
    //     }
    //     return false;
    // }
    // public static boolean searchMatrix(ArrayList<ArrayList<Integer>> matrix, int target) {
    //     int n = matrix.size();
    //     int m = matrix.get(0).size();

    //     for (int i = 0; i < n; i++) {
    //         if (matrix.get(i).get(0) <= target && target <= matrix.get(i).get(m - 1)) {
    //             return binarySearch(matrix.get(i), target);
    //         }
    //     }
    //     return false;
    // }

    //Optimal Approach
    public static boolean searchMatrix(ArrayList<ArrayList<Integer>> matrix, int target) {
        int n = matrix.size();
        int m = matrix.get(0).size();
        int low = 0, high = n * m - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int row = mid / m, col = mid % m;
            if (matrix.get(row).get(col) == target) return true;
            else if (matrix.get(row).get(col) < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        matrix.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
        matrix.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));

        boolean result = searchMatrix(matrix, 8);
        System.out.println(result ? "true" : "false");
    }
}