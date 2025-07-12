package Java_DSA_Practice.Arrays.Hard;

import java.util.ArrayList;

public class CountInversions {
    //Brute force
    // public static int numberOfInversions(int[] a, int n) {
//         int cnt = 0;
//         for(int i = 0; i < n; i++) {
//             for(int j = i + 1; j < n; j++) {
//                 if(a[i] > a[j])
//                 cnt++;
//             }
//         }
//         return cnt;
// }

//Optimal Approach
private static int merge(int[] arr, int low, int mid, int high) {
    ArrayList<Integer> temp = new ArrayList<>();
    int left = low;
    int right = mid + 1;
    int cnt = 0;
    while(left <= mid && right <= high) {
        if(arr[left] <= arr[right]) {
            temp.add(arr[left]);
            left++;
        } else {
            temp.add(arr[right]);
            cnt += (mid - left + 1);
            right++;
        }
    }

    while(left <= mid) {
        temp.add(arr[left]);
        left++;
    } 

    while(right <= high) {
        temp.add(arr[right]);
        right++;
    }

    for(int i = low; i <= high; i++) {
        arr[i] = temp.get(i - low);
    }
    return cnt;
}

public static int mergeSort(int[] arr, int low, int high) {
    int cnt = 0;
    if(low >= high) return cnt;
    int mid = (low + high) / 2;
    cnt += mergeSort(arr, low, mid);
    cnt += mergeSort(arr, mid + 1, high);
    cnt += merge(arr, low, mid, high);
    return cnt;
}

public static int numberOfInversions(int[] a, int n) {
    return mergeSort(a, 0, n - 1);
}
public static void main(String[] args) {
    int[] a = {5, 4, 3, 2, 1};
    int n = 5;
    int cnt = numberOfInversions(a, n);
    System.out.println("The number of inversions is: " + cnt);
}
}
