public class FirstMissingInteger {
    public int firstMissingPositive(int[] A) {
        //brute force
        /*int n = A.length;

        for(int i = 1; i <= n+1; i++) {
            boolean found =false;

            for(int j = 0; j < n; j++) {
                if(A[j] == i) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                return i;
            }
        }
        return n + 1;
    }
    public static void main(String[] args) {
        FirstMissingInteger solution = new FirstMissingInteger();
        
        // Test case 1
        int[] A1 = {1, 2, 0};
        System.out.println(solution.firstMissingPositive(A1));
        
        // Test case 2
        int[] A2 = {3, 4, -1, 1};
        System.out.println(solution.firstMissingPositive(A2));
        
        // Test case 3
        int[] A3 = {-8, -7, -6};
        System.out.println(solution.firstMissingPositive(A3));
    }
    
}*/
//Better Approach
/*Arrays.sort(A);
int smallestPositive = 1;
for(int num : A) {
    if(num == smallestPositive) {
        smallestPositive++;
    }
    else if(num > smallestPositive) {
        break;
    }
}
return smallestPositive;
}
public static void main(String[] args) {
    FirstMissingInteger solution = new FirstMissingInteger();
    
    // Test case 1
    int[] A1 = {1, 2, 0};
    System.out.println(solution.firstMissingPositive(A1));
    
    // Test case 2
    int[] A2 = {3, 4, -1, 1};
    System.out.println(solution.firstMissingPositive(A2));
    
    // Test case 3
    int[] A3 = {-8, -7, -6};
    System.out.println(solution.firstMissingPositive(A3));
}
}*/
//Optimal Approach
int n = A.length;

for(int i = 0; i < n; i++) {
    if(A[i] <= 0 || A[i] > n) {
        A[i] = n + 1;
    }
}
for(int i = 0; i < n; i++) {
    int absVal = Math.abs(A[i]);
    if(absVal <= n) {
        A[absVal - 1] = -Math.abs(A[absVal - 1]);
    }
}
for(int i = 0; i < n; i++) {
    if(A[i] > 0) {
        return i + 1;
    }
}
return n + 1;
}
public static void main(String[] args) {
    FirstMissingInteger solution = new FirstMissingInteger();
    
    // Test case 1
    int[] A1 = {1, 2, 0};
    System.out.println(solution.firstMissingPositive(A1));
    
    // Test case 2
    int[] A2 = {3, 4, -1, 1};
    System.out.println(solution.firstMissingPositive(A2));
    
    // Test case 3
    int[] A3 = {-8, -7, -6};
    System.out.println(solution.firstMissingPositive(A3));
}
}