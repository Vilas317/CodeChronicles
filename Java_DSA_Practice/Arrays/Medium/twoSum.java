/* Two Sum : Check if a pair with given sum exists in Array

Problem Statement: Given an array of integers arr[] and an integer target.

1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.

2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.

Note: You are not allowed to use the same element twice. Example: If the target is equal to 6 and num[1] = 3, then nums[1] + nums[1] = target is not a solution. */

//Brute force
//Code Variant 1

import java.util.*;
public class twoSum {
    public static String twoSum(int n, int []arr, int target) {
        /*for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i] + arr[j] == target) {
                    return "Yes";
                }
            }
            return "No";
        }
    
        public static void main(String args[]) {
            int n = 5;
            int[] arr = {2, 6, 5, 8, 11};
            int target = 14;
            String ans = twoSum(n, arr, target);
            System.out.println("This is the answer for variant 1: " + ans);
        }
}*/

//Code Variant 2
/*int[] ans = new int[2];
ans[0] = ans[1] = -1;
for(int i = 0; i < n; i++) {
    for(int j = i + 1; j < n; j++) {
        if(arr[i] + arr[j] == target) {
            ans[0] = i;
            ans[1] = j;
        }
    }
}
return ans;
    }
    public static void main(String args[]) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        int[] ans = twoSum(n, arr, target);
        System.out.println("This is the answer for variant 2: [" + ans[0] + ", " + ans[1] + "]");
    }

}*/

//Better Approach - HashMap
//Code Variant 1
/*HashMap<Integer, Integer>mpp = new HashMap<>();
for(int i = 0; i < n; i++) {
    int num = arr[i];
    int moreNeeded = target - num;
    if(mpp.containsKey(moreNeeded)){
        return "Yes";
    }
    mpp.put(arr[i], i)
}
return "No";
}
    public static void main(String args[]) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = twoSum(n, arr, target);
        System.out.println("This is the answer for variant 1: " + ans);
    }
}*/

//Code Variant 2
/*int[] ans = new int[2];
ans[0] = ans[1] = -1;
HashMap<Integer, Integer>mpp = new HashMap<>();
for(int i = 0; i < n; i++) {
    int num = arr[i];
    int moreNeeded = target - num;
    if(mpp.containsKey(moreNeeded)){
        ans[0] = mpp.get(moreNeeded);
        ans[1] = i;
        return ans;
    }
    mpp.put(arr[i], i)
}
return ans;
}
public static void main(String args[]) {
    int n = 5;
    int[] arr = {2, 6, 5, 8, 11};
    int target = 14;
    String ans = twoSum(n, arr, target);
    System.out.println("This is the answer for variant 2: " + ans);
}
}*/

//Optimal Appraoch
//Two Pointer Appraoch
Arrays.sort(arr);
int left = 0; int right = 0;
while(left < right) {
    int sum = arr[left] + arr[right];
    if(sum == target) {
        return "Yes";
    } else if(sum < target) {
        left++;
    } else {
        right--;
    }
    return "No";
}
return null;
}
public static void main(String args[]) {
    int n = 5;
    int[] arr = {2, 6, 5, 8, 11};
    int target = 14;
    String ans = twoSum(n, arr, target);
    System.out.println("This is the answer for variant 1: " + ans);
}
}
