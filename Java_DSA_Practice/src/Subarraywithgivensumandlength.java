public class Subarraywithgivensumandlength {
    public int solve(int[] A, int B, int C) {
        //Brute Force
        /*int n = A.length;

        for (int i = 0; i <= n - B; i++) {
            int sum = 0;

            for (int j = i; j < i + B; j++) {
                sum += A[j];
            }
            if (sum == C) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Subarraywithgivensumandlength solution = new Subarraywithgivensumandlength();

        int[] A = {4, 3, 2, 6, 1};
        int B = 3;
        int C = 11;

        // Pass the correct arguments to the solve method
        int result = solution.solve(A, B, C);
        System.out.println(result); // Output should be 1 for this example
    }
}*/
//optimal approach
int n = A.length;
int currentSum = 0;

for(int i = 0; i < B; i++) {
    currentSum += A[i];
}
if (currentSum == C) {
    return 1;
}

for(int i = B; i < n; i++) {
    currentSum += A[i] - A[i - B];
    if (currentSum == C) {
        return 1;
    }
}
return 0;
}
public static void main(String[] args) {
    Subarraywithgivensumandlength solution = new Subarraywithgivensumandlength();

        int[] A1 = {4, 3, 2, 6, 1};
        int B1 = 3, C1 = 11;
        System.out.println(solution.solve(A1, B1, C1)); 
        
        int[] A2 = {4, 2, 2, 5, 1};
        int B2 = 4, C2 = 6;
        System.out.println(solution.solve(A2, B2, C2)); 
}
}