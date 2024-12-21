import java.util.Arrays;

public class Aggressivecows {
    public int solve(int[] A, int B) {
        //Brute force
        /*int n = A.length;

        Arrays.sort(A);
        int minDist = 1;
        int maxDist = A[n - 1] - A[0];

        int result = 1;
        for(int dist = minDist; dist <= maxDist; dist++) {
            if(canPlaceCows(A, dist, B)) {
                result = dist;
            } else {
                break;
            }
        }
        return result;
    }

    private boolean canPlaceCows(int[] A, int dist, int cows) {
        int count = 1;
        int lastPos = A[0];

        for(int i = 1; i < A.length; i++) {
            if(A[i] - lastPos >= dist) {
                count++;
                lastPos = A[i];

                if(count >= cows) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
    Aggressivecows solution = new Aggressivecows();

    int[] A1 = {1, 2, 3, 4, 5};
    int B1 = 3;
    System.out.println("Output 1: " + solution.solve(A1, B1));

    int[] A2 = {1, 2};
    int B2 = 2;
    System.out.println("Output 2: " + solution.solve(A2, B2));
    }

    
}*/
//Optimal Appraoch
int n = A.length;

Arrays.sort(A);

int low = 1;
int high = A[n - 1] - A[0];
int result = 0;

while(low <= high) {
    int mid = low + (high - low) / 2;
    if(canPlaceCows(A, mid, B)) {
        result = mid;
        low = mid + 1;
    } else {
        high = mid - 1;
    }
}

return result;

}

private boolean canPlaceCows(int[] A, int dist, int cows) {
    int count = 1; // Place the first cow at the first stall
    int lastPos = A[0]; // Position of the last placed cow

    for (int i = 1; i < A.length; i++) {
        if (A[i] - lastPos >= dist) {
            count++;
            lastPos = A[i]; // Update last position

            if (count >= cows) {
                return true; // Successfully placed all cows
            }
        }
    }

    return false; // Not enough stalls to place cows with given distance
}

public static void main(String[] args) {
    Aggressivecows solution = new Aggressivecows();

    // Example Input 1
    int[] A1 = {1, 2, 3, 4, 5};
    int B1 = 3;
    System.out.println("Output 1: " + solution.solve(A1, B1));

    // Example Input 2
    int[] A2 = {1, 2};
    int B2 = 2;
    System.out.println("Output 2: " + solution.solve(A2, B2));
}
}