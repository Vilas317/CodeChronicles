import java.util.ArrayList;
import java.util.Collections;

public class ArithmeticProgression {
    public static int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        long commonDifference = A.get(1) - A.get(0);
        for(int i = 2; i < A.size(); i++) {
            if(A.get(i) - A.get(i - 1) != commonDifference) {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        ArithmeticProgression arithmeticProgression = new ArithmeticProgression();
        
        ArrayList<Integer> input1 = new ArrayList<>();
        input1.add(3);
        input1.add(5);
        input1.add(1);
        System.out.println(ArithmeticProgression.solve(input1));

        ArrayList<Integer> input2 = new ArrayList<>();
        input2.add(2);
        input2.add(4);
        input2.add(1);
        System.out.println(ArithmeticProgression.solve(input2));
        
    }
}
