public class MinimumSwaps {
    public int solve(int[] A, int B) {
        int n = A.length;
        
        int countLessEqualB = 0;
        for (int num : A) {
            if (num <= B) {
                countLessEqualB++;
            }
        }

        if (countLessEqualB == 0) {
            return 0;
        }

        int maxInWindow = 0;
        for (int i = 0; i < countLessEqualB; i++) {
            if (A[i] <= B) {
                maxInWindow++;
            }
        }

        int currentCount = maxInWindow;

        for (int i = countLessEqualB; i < n; i++) {
            if (A[i] <= B) {
                currentCount++;
            }
            if (A[i - countLessEqualB] <= B) {
                currentCount--;
            }
            maxInWindow = Math.max(maxInWindow, currentCount);
        }

        return countLessEqualB - maxInWindow;
    }

    public static void main(String[] args) {
        MinimumSwaps minimumSwaps = new MinimumSwaps();
        
        int[] A1 = {1, 12, 10, 3, 14, 10, 5};
        int B1 = 8;
        System.out.println(minimumSwaps.solve(A1, B1));

        int[] A2 = {5, 17, 100, 11};
        int B2 = 20;
        System.out.println(minimumSwaps.solve(A2, B2));
    }
}