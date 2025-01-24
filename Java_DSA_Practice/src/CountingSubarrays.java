public class CountingSubarrays {
    public int solve(int[] A, int B) {
        int n = A.length;
        int count = 0;
        int currentSum = 0;
        int left = 0;

        for(int right = 0; right < n; right++) {
            currentSum += A[right];

            while(currentSum >= B && left <= right) {
                currentSum -= A[left];
                left++;
            }

            count += (right - left + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        CountingSubarrays countingSubarrays = new CountingSubarrays();
        
        int[] A1 = {2, 5, 6};
        int B1 = 10;
        System.out.println(countingSubarrays.solve(A1, B1));

        int[] A2 = {1, 11, 2, 3, 15};
        int B2 = 10;
        System.out.println(countingSubarrays.solve(A2, B2));
    }
}