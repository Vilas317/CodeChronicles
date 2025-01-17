import java.util.Arrays;

//Brute Force
public class goodpair {
    public int solve(int[] A, int B) {
        /*for(int i = 0; i<A.length; i++) {
            for(int j = 0; j<A.length; j++) {
                if(i == j) continue;
                if(A[i] + A[j] == B) return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        goodpair gp = new goodpair();
        int[] A1 = {1, 2, 3, 4};
        int B1 = 7;
        System.out.println("Test Case 1: " + (gp.solve(A1, B1) == 1 ? "Passed" : "Failed"));

        int[] A2 = {1, 2, 4};
        int B2 = 4;
        System.out.println("Test Case 1: " + (gp.solve(A2, B2) == 1 ? "Passed" : "Failed"));

        int[] A3 = {1, 2, 2};
        int B3 = 4;
        System.out.println("Test Case 1: " + (gp.solve(A3, B3) == 1 ? "Passed" : "Failed"));
    }
}*/
//Better Approach - Hashing
/*HashMap<Integer, Integer>mpp = new HashMap<>();
for (int i = 0; i<A.length; i++) {
    int num = A[i];
    int moreNeeded = B - num;
    if(mpp.containsKey(moreNeeded)) {
    return 1;
}
mpp.put(num, i);
}
return 0;
}
public static void main(String[] args) {
    goodpair gp = new goodpair();
    int[] A1 = {1, 2, 3, 4};
    int B1 = 7;
    System.out.println("Test Case 1: " + (gp.solve(A1, B1) == 1 ? "Passed" : "Failed"));

    int[] A2 = {1, 2, 4};
    int B2 = 4;
    System.out.println("Test Case 1: " + (gp.solve(A2, B2) == 1 ? "Passed" : "Failed"));

    int[] A3 = {1, 2, 2};
    int B3 = 4;
    System.out.println("Test Case 1: " + (gp.solve(A3, B3) == 1 ? "Passed" : "Failed"));
}
}*/

//Optimal Approach - Two Pointer
Arrays.sort(A);
int left = 0; int right = A.length - 1;
while(left < right) {
    int sum = A[left] + A[right];
    if(sum == B) {
        return 1;
    } else if(sum < B) {
        left ++;
    } else {
        right --;
    }
}
return 0;
}
public static void main(String[] args) {
    goodpair gp = new goodpair();
    int[] A1 = {1, 2, 3, 4};
    int B1 = 7;
    System.out.println("Test Case 1: " + (gp.solve(A1, B1) == 1 ? "Passed" : "Failed"));

    int[] A2 = {1, 2, 4};
    int B2 = 4;
    System.out.println("Test Case 1: " + (gp.solve(A2, B2) == 1 ? "Passed" : "Failed"));

    int[] A3 = {1, 2, 2};
    int B3 = 4;
    System.out.println("Test Case 1: " + (gp.solve(A3, B3) == 1 ? "Passed" : "Failed"));
}
}