import java.util.Arrays;
import java.util.List;

public class MajorityElementII {
    public static int repeatedNumber(final List<Integer> a) {
        //Brute Force
        /*int n = a.size();
        int threshold = n / 3;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(a.get(i).equals(a.get(j))) {
                    count++;
                }
            }
            if(count > threshold) {
                return a.get(i);
            }
        }
        return -1;
    }*/
    //Optimal Approach
    int n = a.size();
    if(n == 0) 
    return -1;

    Integer candidate1 = null, candidate2 = null;
    int count1 = 0, count2 = 0;

    for(int num : a) {
        if (candidate1 != null && num == candidate1) {
            count1++;
        } else if(candidate2 != null && num == candidate2) {
            count2++;
        } else if(count1 == 0) {
            candidate1 = num;
            count1 = 1;
        } else if(count2 == 0) {
            candidate2 = num;
            count2 = 1;
        } else {
            count1--;
            count2--;
        }
    }
    count1 = 0;
    count2 = 0;

    for(int num : a) {
        if(num == candidate1) {
            count1++;
        } else if(num == candidate2) {
            count2++;
        }
    }
    if(count1 > n/3) {
        return candidate1;
    }
    if(count2 > n/3) {
        return candidate2;
    }
    return -1;
}
    public static void main(String[] args) {

        List<Integer> input1 = Arrays.asList(1, 2, 3, 1, 1);
        int result1 = MajorityElementII.repeatedNumber(input1);
        System.out.println("Test Case 1: Expected Output: 1, Actual Output: " + result1);

        List<Integer> input2 = Arrays.asList(1, 2, 3);
        int result2 = MajorityElementII.repeatedNumber(input2);
        System.out.println("Test Case 2: Expected Output: -1, Actual Output: " + result2);
        
    }
}
