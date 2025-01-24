public class PickFromBothSides {
    public int solve(int[] A, int B) {
        int N = A.length;
        int maxSum = Integer.MIN_VALUE;

        int currentSum = 0;
        for(int i = 0; i < B; i++) {
            currentSum += A[i];
        }
        maxSum = currentSum;

        for(int i = 0; i < B; i++) {
            currentSum = currentSum - A[B - 1 - i] + A[N - 1 - i];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        PickFromBothSides pickFromBothSides = new PickFromBothSides();

        int[] A1 = {5, -2, 3, 1, 2};
        int B1 = 3;
        System.out.println(pickFromBothSides.solve(A1, B1));

        int[] A2 = { 2, 3, -1, 4, 2, 1};
        int B2 = 4;
        System.out.println(pickFromBothSides.solve(A2, B2));
        
    }
    
}
