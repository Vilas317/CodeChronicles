public class ArrrayRotation {
    public static void reverse(int[] A, int start, int end) {
        while(start < end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
    }
    public static int[] solve(int[] A, int B ) {
        int n = A.length;
        B = B%n;
        reverse(A, 0, n-1);
        reverse(A, 0, B-1);
        reverse(A, B, n-1);
        return A;
    }
    public static void main(String[] args) {
        int[] A1 = {1, 2, 3, 4};
        int B1 = 2;
        int[] result1 = ArrrayRotation.solve(A1, B1);
        System.out.println("Output 1: ");
        for(int num : result1) {
            System.out.println(num + " ");
        }
        System.out.println();
    int[] A2 = {2, 5, 6};
    int B2 = 1;
    int[] result2 = ArrrayRotation.solve(A2, B2);
    System.out.println("Output 2: ");
    for(int num : result2) {
        System.out.println(num + " ");
    }
    System.out.println();
}
}
