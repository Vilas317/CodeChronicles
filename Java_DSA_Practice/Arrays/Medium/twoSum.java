import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static String Sum(int n, int[] arr, int target) {
    // Brute force
    // for (int i = 0; i < n; i++) {
    // for (int j = i + 1; j < n; j++) {
    // if (arr[i] + arr[j] == target)
    // return "YES";
    // }
    // }
    // return "NO";
    // }

    // Better Approach - Hashing
    // HashMap<Integer, Integer> map = new HashMap<>();
    // for(int i = 0; i < n; i++) {
    // int num = arr[i];
    // int moreNeeded = target - num;
    // if(map.containsKey(moreNeeded)) {
    // return "yes";
    // }
    // map.put(arr[i], i);
    // }
    // return "No";
    // }

    //Optimal Approach - Two pointer
    Arrays.sort(arr);
    int left = 0, right = n - 1;
    while(left < right) {
        int sum = arr[left] + arr[right];
        if(sum == target) {
            return "yes";
        } else if(sum < target) left++;
        else right--;
    }
    return "No";
}
    public static void main(String args[]) {
        int n = 5;
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 14;
        String ans = Sum(n, arr, target);
        System.out.println("This is the answer for variant 1: " + ans);
    }

}
