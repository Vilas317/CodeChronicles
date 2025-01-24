public class Subarraywithleastavg {
    public int solve(int[] A, int B) {
        int n = A.length;
        int minSum = 0;
        for (int i = 0; i < B; i++) {
            minSum += A[i];
        }
        int currentSum = minSum;
        int minIndex = 0;
        for (int i = B; i < n; i++) {
            currentSum += A[i] - A[i - B];
            if (currentSum < minSum) {
                minSum = currentSum;
                minIndex = i - B + 1;
            }
        }
        return minIndex;
    }
public static void main(String[] args) {
    Subarraywithleastavg subarraywithleastavg = new Subarraywithleastavg();
    
    int[] A1 = {3, 7, 90, 20, 10, 50, 40};
    int B1 = 3;
    System.out.println(subarraywithleastavg.solve(A1, B1));

    int[] A2 = {3, 7, 5, 20, -10, 0, 12};
    int B2 = 2;
    System.out.println(subarraywithleastavg.solve(A2, B2));
}
}
