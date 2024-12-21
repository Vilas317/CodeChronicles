import java.util.HashMap;
public class LongestSubarrayZeroSum {
    public int solve(int[] A) {
        HashMap<Long, Integer> prefixSumMap = new HashMap<>();
        long sum = 0;
        int maxlength = 0;

        for(int i = 0; i < A.length; i++) {
            sum += A[i];

            if(sum == 0) {
                maxlength = i = 1;
            }
            else if(prefixSumMap.containsKey(sum)) {
                maxlength = Math.max(maxlength, i -prefixSumMap.get(sum));
            }
            else {
                prefixSumMap.put(sum, i);
            }
        }
        return maxlength;
    }
    public static void main(String[] args) {
        LongestSubarrayZeroSum solution = new LongestSubarrayZeroSum();
        
        int[] A1 = {1, -2, 1, 2};
        System.out.println(solution.solve(A1));

        int[] A2 = {3, 2, -1};
        System.out.println(solution.solve(A2));
    }
}