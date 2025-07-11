public class ImplementUpperBound {
    public static int upperBound(int []arr, int n, int x) {
            //Brute Force
//         for(int i = 0; i < n; i++) {
//             if(arr[i] > x) {
//                 return i;
//             }
//         }
//         return n;
// }

//Optimal Approach
int low = 0, high = n - 1;
int ans = 0;

while(low <=  high) {
    int mid = (low+high)/2;
    if(arr[mid] > x) {
        ans = mid;

        high = mid - 1;
    } else {
        low = mid + 1;
    }
}
return ans;
}
public static void main(String[] args) {
    int[] arr = {3, 5, 8, 9, 15, 19};
    int n = 6, x = 9;
    int ind = upperBound(arr, x, n);
    System.out.println("The upper bound is the index: " + ind);
}
}