import java.util.ArrayList;
import java.util.Arrays;

// Problem Statement: Given an array consisting of only 0s, 1s, and 2s. Write a program to in-place sort the array without using inbuilt sort functions. ( Expected: Single pass-O(N) and constant space)


//Brute force
//Sorting ( even if it is not the expected solution here but it can be considered as one of the approaches). Since the array contains only 3 integers, 0, 1, and 2. Simply sorting the array would arrange the elements in increasing order.

//Better Approach
public class Sortanarrayof0s1sand2s {
    /*public static void sortArray(int[] arr){
      int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                cnt0++;
            } else if(arr[i] == 1) {
                cnt1++;
            } else if(arr[i] == 2) {
                cnt2++
            }
        }
        int index = 0;

        for(int i = 0; i < cnt0; i++) {
            arr[index++] = 0;
        }
        for(int i = 0; i < cnt1; i++) {
            arr[index++] = 1;
        }
        for(int i = 0; i < cnt2; i++) {
            arr[index++] = 2;
        }
    }
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(nums));

        sortArrays(nums);

        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(nums));

    }
}*/

//Optimal Approach
//Dutch National flag algorithm
public static void sortArray(ArrayList<Integer> arr, int n) {
    int low = 0, mid = 0, high = n - 1;

    while(mid <= high) {
        if(arr.get(mid) == 0) {
            int temp = arr.get(low);
            arr.set(low, arr.get(mid));
            arr.set(mid, temp);

            low++;
            mid++;

        } else if(arr.get(mid) == 1) {

            mid++;
            
        } else {
            int temp = arr.get(high);
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
    System.out.println("After Sorting:");
    for(int i = 0; i < n; i++) {
        System.out.println(arr.get(i) + " ");
    }
    System.out.println();
}
}
