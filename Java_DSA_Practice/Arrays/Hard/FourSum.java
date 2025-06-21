package Java_DSA_Practice.Arrays.Hard;
import java.util.*;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        // Brute Force
    //     int n = nums.length;
    //     Set<List<Integer>> set = new HashSet<>();

    //     for (int i = 0; i < n; i++) {
    //         for (int j = i + 1; j < n; j++) {
    //             for (int k = j + 1; k < n; k++) {
    //                 for (int l = k + 1; l < n; l++) {

    //                     long sum = (long)nums[i] + nums[j];
    //                     sum += nums[k];
    //                     sum += nums[l];

    //                     if (sum == target) {
    //                         List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
    //                         Collections.sort(temp);
    //                         set.add(temp);
    //                     }
    //                 }
    //             }
    //         }
    //     }
    //     List<List<Integer>> ans = new ArrayList<>(set);
    //     return ans;
    // }

    //Better Approach
    // int n = nums.length;
    //     Set<List<Integer>> st = new HashSet<>();

    //     for (int i = 0; i < n; i++) {
    //         for (int j = i + 1; j < n; j++) {
    //             Set<Long> hashset = new HashSet<>();
    //             for (int k = j + 1; k < n; k++) {

    //                 long sum = nums[i] + nums[j];
    //                 sum += nums[k];
    //                 long fourth = target - sum;
    //                 if (hashset.contains(fourth)) {
    //                     List<Integer> temp = new ArrayList<>();
    //                     temp.add(nums[i]);
    //                     temp.add(nums[j]);
    //                     temp.add(nums[k]);
    //                     temp.add((int) fourth);
    //                     temp.sort(Integer::compareTo);
    //                     st.add(temp);
    //                 }

    //                 hashset.add((long) nums[k]);
    //             }
    //         }
    //     }
    //     List<List<Integer>> ans = new ArrayList<>(st);
    //     return ans;
    // }

    //Optimal Approach
    int n = nums.length;
    List<List<Integer>> ans = new ArrayList<>();
    Arrays.sort(nums);
    for(int i = 0; i < n; i++) {
        if(i > 0 && nums[i] == nums[i -1]) continue;
        for(int j = i + 1; j < n; j++) {
            if(j > i + 1 && nums[j] == nums[j -1]) continue;

            int k = j + 1;
            int l = n - 1;
            while(k < l) {
                long sum = nums[i];
                sum += nums[j];
                sum += nums[k];
                sum += nums[l];   
                if(sum ==  target) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    temp.add(nums[l]);
                    ans.add(temp);
                    k++;
                    l--;

                    while(k < l && nums[k] == nums[k - 1]) k++;
                    while(k < l && nums[l] == nums[l + 1]) l--;
                } else if (sum < target) k++;
                else l--;
            }
        }
    }
    return ans;
}
        public static void main(String[] args) {
            int[] nums = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
            int target = 9;
            List<List<Integer>> ans = fourSum(nums, target);
            System.out.println("The quadruplets are: ");
            for (List<Integer> it : ans) {
                System.out.print("[");
                for (int ele : it) {
                    System.out.print(ele + " ");
                }
                System.out.print("] ");
            }
            System.out.println();
        }
    }