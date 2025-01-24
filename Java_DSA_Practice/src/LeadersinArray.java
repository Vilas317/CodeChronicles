import java.util.ArrayList;
import java.util.Collections;

public class LeadersinArray {
    public int[] solve(int[] A) {
        int n = A.length;

        ArrayList<Integer> leaders = new ArrayList<>();
        //Brute Force
        /*int maxFromRight = Integer.MIN_VALUE;

        for(int i = n - 1; i >= 0; i--) {
            if(A[i] > maxFromRight) {
                leaders.add(A[i]);
                maxFromRight = A[i];
            }
        }
        int[] result = new int[leaders.size()];
        for(int i = 0; i < leaders.size(); i++) {
            result[i] = leaders.get(i);
        }
        return result;
    }*/
    //Optimal Approach
    int maxFromRight = A[n - 1];
    leaders.add(maxFromRight);

    for(int i = n - 2; i >= 0; i--) {
        if(A[i] > maxFromRight) {
            leaders.add(A[i]);
            maxFromRight = A[i];
        }
    }
    Collections.reverse(leaders);

    int[] result = new int[leaders.size()];
    for(int i = 0; i < leaders.size(); i++) {
        result[i] = leaders.get(i);
    }
    return result;
}
    public static void main(String[] args) {
        LeadersinArray leadersinArray = new LeadersinArray();
        
        int[] A1 = {16, 17, 4, 3, 5, 2};
        int[] result1 = leadersinArray.solve(A1);
        System.out.print("Test Case 1: ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        int[] A2 = {5, 4};
        int[] result2 = leadersinArray.solve(A2);
        System.out.print("Test Case 2: ");
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
