public class Equilibriumindexofanarray {
public int solve(int[] A) {
    //Brute Force Approach
    /*int n = A.length;
    for (int i = 0; i < n; i++) {
        int leftSum = 0, rightSum = 0;
        for (int j = 0; j < i; j++) { // Loop until index i (exclusive) for leftSum
            leftSum += A[j];
        }
        for (int j = i + 1; j < n; j++) { // Loop from index i+1 for rightSum
            rightSum += A[j];
        }
        if (leftSum == rightSum) {
            return i;
        }
    }
    return -1;
}

public static void main(String[] args) {
    Equilibriumindexofanarray solution = new Equilibriumindexofanarray(); // Correct class name
    int[] A1 = {-7, 1, 5, 2, -4, 3, 0};
    System.out.println(solution.solve(A1));

    int[] A2 = {1, 2, 3};
    System.out.println(solution.solve(A2));
}
}*/
//Optimized Approach
int N = A.length;
int totalSum = 0;
for(int i = 0; i < N; i++) {
    totalSum += A[i];
}

int sumLeft = 0;
for(int i = 0; i < N; i++) {
    int sumRight = totalSum - sumLeft - A[i];
    if(sumLeft == sumRight) {
        return i;
    }
    sumLeft += A[i];
}
return -1;
}
public static void main(String[] args) {
    Equilibriumindexofanarray solution = new Equilibriumindexofanarray(); // Correct class name
    int[] A1 = {-7, 1, 5, 2, -4, 3, 0};
    System.out.println(solution.solve(A1));

    int[] A2 = {1, 2, 3};
    System.out.println(solution.solve(A2));
}
}
