import java.util.HashSet;

public class Countdistinctelements {
    public int solve(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }
        return set.size();
    }
    public static void main(String[] args) {
        Countdistinctelements solution = new Countdistinctelements();
        
        int[] A1 = {3, 4, 3, 6, 6};
        System.out.println(solution.solve(A1));

        int[] A2 = {3, 3, 3, 9, 0, 1, 0};
        System.out.println(solution.solve(A2));
    }
}
