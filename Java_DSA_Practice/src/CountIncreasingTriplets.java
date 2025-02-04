public class CountIncreasingTriplets {
    public static int solve(int[] A) {
        //Brute Force
        /*int n = A.length;
        int count = 0;

        for(int i = 0; i < n - 2; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                for(int k = j + 1; k < n; k++) {
                    if(A[i] < A[j] && A[j] < A[k]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }*/
    //Optmial Approach
    if(A.length < 3) {
        return 0;
    }
    int count = 0;
    int first = Integer.MAX_VALUE;
    int second = Integer.MAX_VALUE;

    for(int num : A) {
        if(num > second) {
            count++;
        }
        if(num < first) {
            first = num;
        } else if (num < second && num > first) {
            second = num;
        }
    }
    return count;
}
public static void main(String[] args) {

    int[] input1 = {1, 2, 4, 3};
    int[] input2 = {2, 1, 2, 3};
    
    System.out.println("Output for input1: " + CountIncreasingTriplets.solve(input1));
    System.out.println("Output for input2: " + CountIncreasingTriplets.solve(input2));
}
}
