import java.util.*;

public class Searchin2DMatrixtwo {
    // Brute Force
    // public static boolean searchElement(ArrayList<ArrayList<Integer>> matrix, int
    // target) {
    // int n = matrix.size(), m = matrix.get(0).size();
    // for(int i = 0; i < n; i++) {
    // for(int j = 0; j < m; j++) {
    // if(matrix.get(i).get(j) == target)
    // return true;
    // }
    // }
    // return false;
    // }

    // Better Approach
    // public static boolean binarySearch(ArrayList<Integer> nums, int target) {
    //     int n = nums.size();
    //     int low = 0, high = n - 1;
    //     while (low <= high) {
    //         int mid = (low + high) / 2;
    //         if (nums.get(mid) == target)
    //             return true;
    //         else if (target > nums.get(mid))
    //             low = mid + 1;
    //         else
    //             high = mid - 1;
    //     }
    //     return false;
    // }

    // public static boolean searchElement(ArrayList<ArrayList<Integer>> matrix, int target) {
    //     int n = matrix.size();
    //     int m = matrix.get(0).size();
    //     for (int i = 0; i < n; i++) {
    //         boolean flag = binarySearch(matrix.get(i), target);
    //         if (flag == true)
    //             return true;
    //     }
    //     return false;
    // }

    //Optimal Approach
    public static boolean searchElement(ArrayList<ArrayList<Integer>> matrix, int target) {
        int n = matrix.size();
        int m = matrix.get(0).size();
        int row = 0, col = m - 1;
        while (row < n && col >= 0) {
            if (matrix.get(row).get(col) == target) return true;
            else if (matrix.get(row).get(col) < target) row++;
            else col--;
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 4, 7, 11, 15)));
        matrix.add(new ArrayList<>(Arrays.asList(2, 5, 8, 12, 19)));
        matrix.add(new ArrayList<>(Arrays.asList(3, 6, 9, 16, 22)));
        matrix.add(new ArrayList<>(Arrays.asList(10, 13, 14, 17, 24)));
        matrix.add(new ArrayList<>(Arrays.asList(18, 21, 23, 26, 30)));

        boolean result = searchElement(matrix, 8);
        System.out.println(result ? "true" : "false");
    }
}
