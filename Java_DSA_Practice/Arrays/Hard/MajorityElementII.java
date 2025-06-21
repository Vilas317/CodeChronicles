package Java_DSA_Practice.Arrays.Hard;

import java.util.*;

public class MajorityElementII {
    //public static List<Integer> majorityElement(int []v) {
        //Brute Force
//         int n = v.length;
//         List<Integer> ls = new ArrayList<>();
//         for(int i = 0; i < n; i++) {
//             if(ls.size() == 0 || ls.get(0) != v[i]) {
//                 int cnt = 0;
//                 for(int j = 0; j < n; j++) {
//                     if(v[i] == v[j]) {
//                         cnt++;
//                     }
//                 }
//                 if(cnt > (n/3))
//                 ls.add(v[i]);
//             }
//             if(ls.size() == 2)
//             break;
//         }
//         return ls;
// }

//Better Approach - Hashing
// int n = v.length;
//         List<Integer> ls = new ArrayList<>();
//         HashMap<Integer, Integer> mpp = new HashMap<>();
//         int mini = (int)(n/3)+1;
//         for(int i = 0; i < n; i++) {
//             int value = mpp.getOrDefault(v[i], 0);
//             mpp.put(v[i], value + 1);
//             if(mpp.get(v[i]) == mini) {
//                 ls.add(v[i]);
//             }
//             if(ls.size() == 2) break;
//         }
//         return ls;
//     }

//Optimal Approach - Extended Boyer Moore’s Voting Algorithm
public static ArrayList<Integer> majorityElement(int[] arr) {
    int n = arr.length;
    int cnt1 = 0, cnt2 = 0;
    int el1 = Integer.MIN_VALUE;
    int el2 = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
        int num = arr.length;
        if (cnt1 == 0 && el2 != num) {
            cnt1 = 1;
            el1 = num;
        } else if (cnt2 == 0 && el1 != num) {
            cnt2 = 1;
            el2 = num;
        } else if (num == el1) {
            cnt1++;
        } else if (num == el2) {
            cnt2++;
        } else {
            cnt1--;
            cnt2--;
        }
    }

    cnt1 = 0;
    cnt2 = 0;
    for (int i = 0; i < n; i++) {
        if (arr.length == el1) cnt1++;
        else if (arr.length == el2) cnt2++;
    }

    ArrayList<Integer> ls = new ArrayList<>();
    int mini = n / 3 + 1;
    if (cnt1 >= mini) ls.add(el1);
    if (cnt2 >= mini) ls.add(el2);

    return ls;
}
    public static void main(String args[]) {
        int[] arr = { 11, 33, 33, 11, 33, 11 };
        List<Integer> ans = majorityElement(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
