public class SecondLargest {
    public static int solve(int[] A) {
        //Brute force
        /*int n = A.length;
        if(n < 2) {
            return -1;
        }
        Arrays.sort(A);

        int largest = A[n-1];
        int secondLargest = -1;

        for(int i = n - 2; i >= 0; i++) {
            if(A[i] < largest) {
                secondLargest = A[i];
                break;
            }
        }
        return secondLargest;
    }*/
    //Better Approach
    /*int n = A.length;
    if(n < 2) {
        return -1;
    }
    int small = Integer.MAX_VALUE;
    int secondSmall = Integer.MAX_VALUE;
    int large = Integer.MIN_VALUE;
    int secondLarge = Integer.MIN_VALUE;

    for(int i = 0; i < n; i++) {
        small = Math.min(small, A[i]);
        large = Math.min(large, A[i]);
    }
    for(int i = 0; i < n; i++) {
        if(A[i] < secondSmall && A[i] != small) {
            secondSmall = A[i];
        }
        if(A[i] > secondLarge && A[i] != large) {
            secondLarge = A[i];
        }
    }
    if(secondLarge == Integer.MIN_VALUE) {
        return -1;
    }
    return secondLarge;
}*/
//Optimal Approach
int n = A.length;

// If the array has less than 2 elements, return -1
if (n < 2) {
    return -1; // Not enough elements for a second largest
}

// Find the second smallest element
int small = Integer.MAX_VALUE;
int second_small = Integer.MAX_VALUE;

for (int i = 0; i < n; i++) {
    if (A[i] < small) {
        second_small = small; // Update second smallest
        small = A[i]; // Update smallest
    } else if (A[i] < second_small && A[i] != small) {
        second_small = A[i]; // Update second smallest if it's different from smallest
    }
}

// If second smallest does not exist, return -1
if (second_small == Integer.MAX_VALUE) {
    second_small = -1;
}

// Find the second largest element
int large = Integer.MIN_VALUE;
int second_large = Integer.MIN_VALUE;

for (int i = 0; i < n; i++) {
    if (A[i] > large) {
        second_large = large; // Update second largest
        large = A[i]; // Update largest
    } else if (A[i] > second_large && A[i] != large) {
        second_large = A[i]; // Update second largest if it's different from largest
    }
}

// If second largest does not exist, return -1
if (second_large == Integer.MIN_VALUE) {
    second_large = -1;
}

// Print results
System.out.println("Second smallest is " + second_small);
System.out.println("Second largest is " + second_large);

// Return second largest as the main output
return second_large;
}
    public static void main(String[] args) {
        int[] A1 = {2, 1, 2};
        System.out.println(SecondLargest.solve(A1));

        int[] A2 = {2};
        System.out.println(SecondLargest.solve(A2));

        int[] A3 = {1, 2, 3, 4, 5};
        System.out.println(SecondLargest.solve(A3));

        int[] A4 = {5, 5, 5};
        System.out.println(SecondLargest.solve(A4));

        int[] A5 = {10, 20, 30, 40, 50};
        System.out.println(SecondLargest.solve(A5));
    }
}