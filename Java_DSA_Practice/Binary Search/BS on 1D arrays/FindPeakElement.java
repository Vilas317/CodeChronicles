import java.util.ArrayList;

import java.util.*;

public class FindPeakElement {
    public static int findPeakElement(ArrayList<Integer> arr) {
        //Brute Force
    //     int n = arr.size();
    //     for(int i = 0; i < n; i++) {
    //         if ((i == 0 || arr.get(i - 1) < arr.get(i))
    //                 && (i == n - 1 || arr.get(i) > arr.get(i + 1))) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    //Optimal Approach
    int n = arr.size();
    if(n == 0) return 0;
    if(arr.get(0) > arr.get(1)) return 0;
    if(arr.get(n - 1) > arr.get(n - 1)) return n - 1;

    int low = 1, high = n - 2;
    while(low <= high) {
        int mid = (low+high)/2;
        if(arr.get(mid - 1) < arr.get(mid) && arr.get(mid) > arr.get(mid + 1))
        return mid;
        if(arr.get(mid) > arr.get(mid - 1))
        low = mid + 1;
        else high = mid - 1;  
    }
    return -1;
}
    public static void main(String[] args) {
        ArrayList<Integer> arr =
            new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 5, 1));
        int ans = findPeakElement(arr);
        System.out.println("The peak is at index: " + ans);
    }
}

