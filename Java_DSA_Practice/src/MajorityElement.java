import java.util.Arrays;
import java.util.List;

public class MajorityElement {
    public static int majorityElement(final List<Integer> A) {
        //Brute Force
        /*int n = A.size();
        int majorityElement = n/2;

        for(int i = 0; i < n; i++) {
            int count = 0;

            for(int j = 0; j < n; j++) {
                if(A.get(j).equals(A.get(i))) {
                    count++;
                }
            }
            if(count > majorityElement) {
                return A.get(i);
            }
        }
        return -1;
    }*/
    //Optimal Approach
    int candidate = A.get(0);
    int count = 1;

    for( int i = 1; i < A.size(); i++) {
        if(A.get(i) == candidate) {
            count++;
        } else {
            if(count == 0) {
                candidate = A.get(i);
                count = 1;
            }
        }
    }
    return candidate;
}
    public static void main(String[] args) {

        List<Integer> input1 = Arrays.asList(2,1,2);
        List<Integer> input2 = Arrays.asList(1,1,1);

        System.out.println("Output for input1: " + MajorityElement.majorityElement(input1));
        System.out.println("Output for input2: " + MajorityElement.majorityElement(input2));
    }
}
