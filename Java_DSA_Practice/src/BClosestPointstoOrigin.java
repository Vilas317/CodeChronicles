import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BClosestPointstoOrigin {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        // Sort the points based on their distance from the origin
        Collections.sort(A, new Comparator<ArrayList<Integer>>() {
            public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
                long d1 = (long) a.get(0) * a.get(0) + (long) a.get(1) * a.get(1);
                long d2 = (long) b.get(0) * b.get(0) + (long) b.get(1) * b.get(1);
                return Long.compare(d1, d2);
            }
        });

        // Add the first B points to the answer list
        for (int i = 0; i < B; i++) {
            ans.add(A.get(i));
        }
        return ans;
    }

    public static void main(String[] args) {
        BClosestPointstoOrigin solution = new BClosestPointstoOrigin();

        // Input data
        ArrayList<ArrayList<Integer>> A1 = new ArrayList<>();
        A1.add(new ArrayList<>(List.of(1, 3)));
        A1.add(new ArrayList<>(List.of(-2, 2)));
        int B1 = 1;

        ArrayList<ArrayList<Integer>> result1 = solution.solve(A1, B1);
        System.out.println("Closest points to origin: " + result1);

        ArrayList<ArrayList<Integer>> A2 = new ArrayList<>();
        A2.add(new ArrayList<>(List.of(1, -1)));
        A2.add(new ArrayList<>(List.of(2, -1)));
        int B2 = 1;

        ArrayList<ArrayList<Integer>> result2 = solution.solve(A2, B2);
        System.out.println("Closest points to origin: " + result2);
    }
}
