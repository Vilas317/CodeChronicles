import java.util.*;

class Solution {
    // Merge function to combine two sorted halves
    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        // Merge the two halves into temp
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // Copy remaining elements from the left half
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // Copy remaining elements from the right half
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // Copy sorted elements back into the original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    // Merge sort function
    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return; // Base case: single element is already sorted

        int mid = (low + high) / 2;
        mergeSort(arr, low, mid); // Sort left half
        mergeSort(arr, mid + 1, high); // Sort right half
        merge(arr, low, mid, high); // Merge the sorted halves
    }
}

public class MergeSort {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {9, 4, 7, 6, 3, 1, 5};

        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Call mergeSort function from Solution class
        Solution.mergeSort(arr, 0, n - 1);

        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
