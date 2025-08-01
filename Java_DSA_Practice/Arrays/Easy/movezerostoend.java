package Java_DSA_Practice.Arrays.Easy;

import java.util.ArrayList;

public class movezerostoend {
    public static int[] moveZeros(int n, int[] a) {
        // Brute Force
        // ArrayList<Integer> temp = new ArrayList<>();
        // for (int i = 0; i < n; i++) {
        // if (a[i] != 0)
        // temp.add(a[i]);
        // }
        // int nz = temp.size();
        // for (int i = 0; i < nz; i++) {
        // a[i] = temp.get(i);
        // }
        // for (int i = nz; i < n; i++) {
        // a[i] = 0;
        // }
        // return a;
        // }

        // Optimal Approach - Two Pointers
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) {
            return a;
        }
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
        int n = 10;
        int[] ans = moveZeros(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }
}
