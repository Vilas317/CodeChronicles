import java.util.ArrayList;
import java.util.Arrays;

public class GenerateAllSubarrays {
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = A.size();

        for(int i = 0; i < n; i++) {
            ArrayList<Integer> v = new ArrayList<>();
            for(int j = 1; j < n; j++) {
                v.add(A.get(j));
                ans.addAll(new ArrayList<>(v));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        GenerateAllSubarrays solve = new GenerateAllSubarrays();
        
        ArrayList<Integer> A1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> result1 = GenerateAllSubarrays.solve(A1);
        System.out.println(result1);
        
        ArrayList<Integer> A2 = new ArrayList<>(Arrays.asList(5, 2, 1, 4));
        ArrayList<Integer> result2 = GenerateAllSubarrays.solve(A2);
        System.out.println(result2);
        
    }
    
}
