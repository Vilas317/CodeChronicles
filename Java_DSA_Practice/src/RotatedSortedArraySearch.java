public class RotatedSortedArraySearch {
    public int search(final int[] A, int B) {
        //Brute Force
        /*for(int i = 0; i < A.length; i++) {
            if(A[i] == B) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] A = {4, 5, 6, 7, 0, 1, 2, 3};
        int B = 5;

        RotatedSortedArraySearch solution = new RotatedSortedArraySearch();
        int result = solution.search(A, B);

        if(result != -1){
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target is not present");
        }
        }
    }*/
    //optimal approach
    int low = 0, high = A.length - 1;

    while(low <= high) {
        int mid = low + (high - low) / 2;

        if(A[mid] == B) return mid;

        if(A[low] <= A[mid]) {
            if(A[low] <= B && B < A[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        else {
            if(A[mid] < B && B <= A[high]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
return -1;
}
public static void main(String[] args) {
        int[] A1 = {4, 5, 6, 7, 0, 1, 2, 3};
        int B1 = 4;

        int[] A2 = {9, 10, 3, 5, 6, 8};
        int B2 = 5;

        RotatedSortedArraySearch solution = new RotatedSortedArraySearch();
        System.out.println("Index of target in A1: " + solution.search(A1, B1));
        System.out.println("Index of target in A2: " + solution.search(A2, B2));
}
}