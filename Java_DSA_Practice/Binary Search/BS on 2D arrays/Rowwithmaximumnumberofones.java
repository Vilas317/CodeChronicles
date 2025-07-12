import java.util.*;

public class Rowwithmaximumnumberofones {
    public static int lowerBound(ArrayList<Integer> arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = 0;

        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr.get(mid) >= x) {
                ans = mid;
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static int rowWithMax1s(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        int cnt_max = 0;
        int index = -1;
        for(int i = 0; i < n; i++) {
    //         int cnt_ones = 0;
    //         for(int j = 0; j < m; j++) {
    //             cnt_ones += matrix.get(i).get(j);
    //         }
    //         if(cnt_ones > cnt_max) {
    //             cnt_max = cnt_ones;
    //             index = i;
    //         }
    //     }
    //     return index;
    // }
    int cnt_ones = m - lowerBound(matrix.get(i), m, 1);
            if (cnt_ones > cnt_max) {
                cnt_max = cnt_ones;
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 0)));

        int n = 3, m = 3;
        System.out.println("The row with the maximum number of 1's is: " +
                           rowWithMax1s(matrix, n, m));
    }
}