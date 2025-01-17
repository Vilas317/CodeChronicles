import java.util.Arrays;

public class EvenNumbersRange {
    public static int[] solve(int[] A, int[][] B) {
        int n = A.length;
        int[] pref = new int[n + 1];

        for(int i = 0; i < n; i++) {
            pref[i + 1] = pref[i] + (A[i] % 2 == 0 ? 1 : 0);
        }
        int[] ans = new int[B.length];
        for(int i = 0; i < B.length; i++) {
            int left = B[i][0];
            int right = B[i][1];
            ans[i] = pref[right + 1] - pref[left];
        }
        return ans;
    }
    public static void main(String[] args) {
        EvenNumbersRange sol = new EvenNumbersRange();

        int[] A1 = {1, 2, 3, 4, 5};
        int[][] B1 = {{0, 2}, {2, 4}, {1, 4}};
        int[] result1 = EvenNumbersRange.solve(A1, B1);
        System.out.println(Arrays.toString(result1));

        int[] A2 = {2, 1, 8, 3, 9, 6};
        int[][] B2 = {{0, 3}, {3, 5}, {1, 3}, {2, 4}};
        int[] result2 = EvenNumbersRange.solve(A2, B2);
        System.out.println(Arrays.toString(result2));
    }
}