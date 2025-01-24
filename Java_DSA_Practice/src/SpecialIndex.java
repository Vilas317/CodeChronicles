import java.util.ArrayList;

public class SpecialIndex {
    public int solve(ArrayList<Integer> A) {
        int n = A.size();

        int[] prefixEven = new int[n + 1];
        int[] prefixOdd = new int[n + 1];

        for(int i = 0;i < n; i++) {
            prefixEven[i + 1] = prefixEven[i];
            prefixOdd[i + 1] = prefixOdd[i];

            if(i % 2 == 0) {
                prefixEven[i + 1] += A.get(i);
            } else {
                prefixOdd[i + 1] += A.get(i);
            }
        }
        int count = 0;

        for(int i = 0; i < n; i++) {
            int evenSum = prefixEven[i] + (prefixOdd[n] - prefixOdd[i + 1]);
            int oddSum = prefixOdd[i] + (prefixEven[n] - prefixEven[i + 1]);

            if(evenSum == oddSum) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        SpecialIndex SpecialIndex = new SpecialIndex();

        ArrayList<Integer> test1 = new ArrayList<>();
        test1.add(2);
        test1.add(1);
        test1.add(6);
        test1.add(4);
        System.out.println("Output 1: " + SpecialIndex.solve(test1));
        
        ArrayList<Integer> test2 = new ArrayList<>();
        test2.add(1);
        test2.add(1);
        test2.add(1);
        System.out.println("Output 2: " + SpecialIndex.solve(test2));
    }
}
