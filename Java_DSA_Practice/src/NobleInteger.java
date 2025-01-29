import java.util.ArrayList;
import java.util.Collections;

public class NobleInteger {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int n = A.size();
        for(int i = 0; i < n; i++) {
            int countGreater = n -i - 1;
            if(A.get(i) == countGreater) {
                if(i + 1 < n && A.get(i) == A.get(i + 1)) {
                    continue;
                }
                return 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        NobleInteger nobleInteger = new NobleInteger();

        ArrayList<Integer> input1 = new ArrayList<>();
        input1.add(3);
        input1.add(2);
        input1.add(1);
        input1.add(3);
        System.out.println(nobleInteger.solve(input1));
        
        ArrayList<Integer> input2 = new ArrayList<>();
        input2.add(1);
        input2.add(1);
        input2.add(3);
        input2.add(3);
        System.out.println(nobleInteger.solve(input2));
        
    }
    
}
