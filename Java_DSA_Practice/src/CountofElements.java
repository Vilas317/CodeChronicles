public class CountofElements {
    public static int solve(int[] A) {
        int maxElement = Integer.MIN_VALUE;
        int count = 0;

        for(int i = 0; i < A.length; i++) {
            if(A[i] > maxElement) {
                maxElement = A[i];
            }
        }
        for(int i = 0; i < A.length; i++) {
            if(A[i] < maxElement) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[] A1 = {3, 1, 2};
        System.out.println(CountofElements.solve(A1));  

        int[] A2 = {5, 5, 3};
        System.out.println(CountofElements.solve(A2));  
    }
}
