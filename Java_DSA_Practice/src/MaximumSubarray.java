import java.util.Arrays;
import java.util.List;

public class MaximumSubarray {
    public int maxSubarray(int A, int B, List<Integer> C) {
        int ans = 0;

        for(int i = 0; i < A; i ++) {
            int sum = 0;
            for(int j = i; j < A; j++) {
                sum += C.get(j);
                if(sum <= B) {
                    ans = Math.max(ans, sum);
                } else {
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        MaximumSubarray maximumSubarray = new MaximumSubarray();

        int A1 = 5;
        int B1 = 12;
        List<Integer> C1 = Arrays.asList(2, 1, 3, 4, 5);
        System.out.println("Max Subarray Sum: " + maximumSubarray.maxSubarray(A1, B1, C1));

        int A2 = 3;
        int B2 = 5;
        List<Integer> C2 = Arrays.asList(1, 2, 3);
        System.out.println("Max Subarray Sum: " + maximumSubarray.maxSubarray(A2, B2, C2));
    }
}