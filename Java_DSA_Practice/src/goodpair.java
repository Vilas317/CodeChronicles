//Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.
//Brute force
public class goodpair {
    public int solve(int A[], int B){
        for(int i=0; i<1; i++){
            for(int j=0; j<1; j++){
                if(i == j) continue;
                if(A[i]+A[j]==B)
                return 1;
            }
        }
        return 0;
    }
/**
 * @param args
 */
public static void main(String args[]) {
    int n = 5;
    int[] arr = {2, 6, 5, 8, 11};
    int target = 14;
    String ans = App.goodpair(n, arr, target);
    extracted(ans);
}
private static void extracted(String ans) {
    System.out.println("This is the answer for variant 1: " + ans);
}
}