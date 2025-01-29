import java.util.ArrayList;
import java.util.Collections;

public class ElementsRemoval {
    public static int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int totalCost = 0;
        int n = A.size();

        for(int i = 0; i < n; i++) {
            totalCost += (n - i) * A.get(i);
        }
        return totalCost;
    }
    public static void main(String[] args) {
        ElementsRemoval elementsRemoval = new ElementsRemoval();

        ArrayList<Integer> input1 = new ArrayList<>();
        input1.add(2);
        input1.add(1);
        System.out.println(ElementsRemoval.solve(input1));
        
        ArrayList<Integer> input2 = new ArrayList<>();
        input1.add(5);
        System.out.println(ElementsRemoval.solve(input2));

    }
}