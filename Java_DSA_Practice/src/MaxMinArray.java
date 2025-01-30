public class MaxMinArray {
    public static int solve(int[] A) {
        int maxElement = A[0];
        int minELement = A[1];

        for(int i = 1; i < A.length; i++) {
            if(A[i] > maxElement) {
                maxElement = A[i];
            }
            if(A[i] < minELement) {
                minELement = A[i];
            }
        }
        return maxElement + minELement;
    }

    public static void main(String[] args) {
        int[] A1 = {-2, 1, -4, 5, 3};
        int[] A2 = {1, 3, 4, 1};

        System.out.println(MaxMinArray.solve(A1));
        System.out.println(MaxMinArray.solve(A2));
    }
    
}
