import java.util.ArrayList;
import java.util.Arrays;

public class sortArray0s1s2s {
    //Brute Force - Sorting
//     public static void sortArray(int[] arr) {
//         Arrays.sort(arr);
//     }
//     public static void main(String[] args) {
//         int[] arr = {2, 0, 1, 2, 0, 1};
//         sortArray(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }
//Better Approach 
// public static void sortArray(ArrayList<Integer> arr, int n) {
//     int cnt0 = 0, cnt1 = 0, cnt2 = 0;

//     for(int i = 0; i < n; i++){
//         if(arr.get(i) == 0) cnt0++;
//         else if(arr.get(i) == 1) cnt1++;
//         else cnt2++;
//     }
//     for(int i = 0; i < cnt0; i++) {
//         arr.set(i, 0);
//     }
//     for(int i = cnt0; i < cnt1; i++) {
//         arr.set(i, 1);
//     }
//     for(int i = cnt0 + cnt1; i < n; i++) {
//         arr.set(i, 2);
//     }
// }
// Optimal Approach - Dutch National flag algorithm
public static void sortArray(ArrayList<Integer> arr, int n) {
    int low = 0, mid = 0, high = n - 1;
    while(mid <= high) {
        if(arr.get(mid) == 0) {
            int temp = arr.get(low);
            arr.set(low, arr.get(mid));
            arr.set(mid, temp);

            low++;
            mid++;
        } else if (arr.get(mid) == 1) {
            mid++;
        } else {
            int temp = arr.get(mid);
            arr.set(mid, arr.get(high));
            arr.set(high, temp);
            high--;
        }
    }
}
    public static void main(String args[]) {
        int n = 6;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        sortArray(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

    }

}
