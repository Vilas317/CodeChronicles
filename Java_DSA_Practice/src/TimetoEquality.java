public class TimetoEquality {
    public static int solve(int[] A) {
        int maxElement = Integer.MIN_VALUE;
        int totaltime = 0;

        for(int i = 0; i < A.length; i++) {
            if(A[i] > maxElement) {
                maxElement = A[i];
            }
        }

        for(int i = 0; i < A.length; i++) {
            totaltime += (maxElement - A[i]);
    }
    return totaltime;
}
public static void main(String[] args) {
    int[] A1 = {2, 4, 1, 3, 2};
    System.out.println(TimetoEquality.solve(A1));
}
}
