public class FindminRotatedSortedArray {
    public static int findMin(int []arr) {
        //Brute Force
    //     int n = arr.length;
    //     int mini = Integer.MAX_VALUE;
    //     for(int i = 0; i < n; i++) {
    //         mini = Math.min(mini, arr[i]);
    //     }
    //     return mini;
    // }
    //Optimal Approach
    int low = 0, high = arr.length - 1;
    int ans = Integer.MAX_VALUE;
    while(low <= high) {
        int mid = (low+high)/2;
        if(arr[low] <= arr[mid]) {
        ans = Math.min(ans, arr[low]);
        low = mid + 1;
    } else {
        ans = Math.min(ans, arr[mid]);
        high = mid - 1;
    }
}
return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = findMin(arr);
        System.out.println("The minimum element is: " + ans );
    }
}