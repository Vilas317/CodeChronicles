import java.util.ArrayList;

public class ClosestMinMax {
    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        if(n == 0) return 0;

        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;

        for(int num : A) {
            if(num > maxVal) maxVal = num;
            if(num < minVal) minVal = num;
        }
        int lastMaxPos = -1;
        int lastMinPos = -1;
        int minLength = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            if(A.get(i) == maxVal) {
                lastMaxPos = i;
                if(lastMinPos != -1) {
                    minLength = Math.min(minLength, i - lastMinPos + 1);
                }
            }
            if(A.get(i) == minVal) {
                lastMinPos = i;
                if(lastMaxPos != -1) {
                    minLength = Math.min(minLength, i - lastMaxPos + 1);
                }
            }
        }
        return minLength;
    }
    public static void main(String[] args) {
        ClosestMinMax sol = new ClosestMinMax();
        
        ArrayList<Integer> A1 = new ArrayList<>();
        A1.add(1);
        A1.add(3);
        A1.add(2);
        System.out.println(sol.solve(A1));
        
        ArrayList<Integer> A2 = new ArrayList<>();
        A2.add(2);
        A2.add(6);
        A2.add(1);
        A2.add(6);
        A2.add(9);
        System.out.println(sol.solve(A2));
    }
}
