import java.util.ArrayList;
import java.util.Arrays;

public class SubarrayingivenRange {
    public static ArrayList<Integer> solve(ArrayList<Integer>A, int B, int C) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = B; i < C; i++) {
            result.add(A.get(i));
        }
        return result;
    }
    
    public static void main(String[] args) {
        SubarrayingivenRange solve = new SubarrayingivenRange();

        ArrayList<Integer> A1 = new ArrayList<>(Arrays.asList(4, 3, 2, 6));
        int B1 = 1;
        int C1 = 3;
        ArrayList<Integer> result1 = SubarrayingivenRange.solve(A1, B1, C1);
        System.out.println(result1);
        
        ArrayList<Integer> A2 = new ArrayList<>(Arrays.asList(4, 2, 2));
        int B2 = 0;
        int C2 = 1;
        ArrayList<Integer> result2 = SubarrayingivenRange.solve(A2, B2, C2);
        System.out.println(result2);
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> a2) {
        return null;
    }
}
