import java.util.Arrays;

public class RangeSumQuery {
    public long[] rangeSum(int[] A, int[][] B) {
        int N = A.length;
        int M = B.length;

        long[] prefix = new long[N];
        prefix[0] = A[0];
        for(int i = 1; i < N; i++) {
            prefix[i] = prefix[i - 1] + A[i];
        }

        long[] result = new long[M];

        for(int i = 0; i < M; i++) {
            int L = B[i][0];
            int R = B[i][1];
            if(L == 0) {
                result[i] = prefix[R];
            } else {
                result[i] = prefix[R] - prefix[L - 1];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        RangeSumQuery rangeSum = new RangeSumQuery();

        int[] A1 = {1, 2, 3, 4, 5};
        int[][] B1 = {{0, 3}, {1, 2}};
        long[] result1 = rangeSum.rangeSum(A1, B1);
        System.out.println(Arrays.toString(result1));

        int[] A2 = {2, 2, 2};
        int[][] B2 = {{0, 0}, {1, 2}};
        long[] result2 = rangeSum.rangeSum(A2, B2);
        System.out.println(Arrays.toString(result2));
    }
    
}
