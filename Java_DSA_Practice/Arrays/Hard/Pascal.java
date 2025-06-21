package Java_DSA_Practice.Arrays.Hard;
//Variation 1- In this case, we are given the row number r and the column number c, and we need to find out the element at position (r,c). 
import java.util.*;

public class Pascal {
//     public static long nCr(int n, int r) {
//         long res = 1;
//         for(int i = 0; i < r; i++) {
//             res =  res*(n - i);
//             res = res/(i + 1);
//         }
//         return res;
//     }
//     public static int pascalTriangle(int r, int c) {
//         int element = (int)nCr(r -1, c - 1);
//         return element;
//     }
//     public static void main(String[] args) {
//         int r = 5; // row number
//         int c = 3; // col number
//         int element = pascalTriangle(r, c);
//         System.out.println("The element at position (r,c) is: " + element);
//     }
// }

//Variation 2 - Given the row number n. Print the n-th row of Pascal’s triangle.
//Brute Force
// public static long nCr(int n, int r) {
//             long res = 1;
//             for(int i = 0; i < r; i++) {
//                 res =  res*(n - i);
//                 res = res/(i + 1);
//             }
//             return res;
//         }
//         public static void pascalTriangle(int n) {
//             for(int c = 1; c < n; c++) {
//                 System.out.print(nCr(n - 1, c - 1) + " ");
//             }
//             System.out.println();
//         }
//         public static void main(String[] args) {
//             int n = 5;
//             pascalTriangle(n);
//         }
//     }
//Optimal Approach
// static void pascalTriangle(int n) {
//     long ans = 1;
//     System.out.print(ans + " ");
//     for(int i = 1; i < n; i++) {
//         ans = ans * (n - i);
//         ans = ans / i;
//         System.out.print(ans + " ");
//     }
//     System.out.println();
// }
// public static void main(String[] args) {
//     int n = 5;
//     pascalTriangle(n);
// }
// }

//Variation 3 - Given n, print the entire pascal triangle
//Brute Force 
// public static long nCr(int n, int r) {
//             long res = 1;
//             for(int i = 0; i < r; i++) {
//                 res =  res*(n - i);
//                 res = res/(i + 1);
//             }
//             return (int) res;
//         }
//         public static List<List<Integer>> pascalTriangle(int n) {
//             List<List<Integer>> ans = new ArrayList<>();
//             for(int row = 1; row <= n; row++) {
//                 List<Integer> tempList = new ArrayList<>();
//                 for(int col = 1; col <= row; col++) {
//                     tempList.add((int) nCr(row - 1, col - 1));
//                 }
//                 ans.add(tempList);
//             }
//             return ans;
//         }
//         public static void main(String[] args) {
//             int n = 5;
//             List<List<Integer>> ans = pascalTriangle(n);
//             for (List<Integer> it : ans) {
//                 for (int ele : it) {
//                     System.out.print(ele + " ");
//                 }
//                 System.out.println();
//             }
//         }
//     }
//Optimal Approach
public static ArrayList<Long> generateRow(int row) {
    long ans = 1;
    ArrayList<Long> ansRow = new ArrayList<>();
    ansRow.add(1L);
    for (int col = 1; col < row; col++) {
        ans = ans * (row - col);
        ans = ans / col;
        ansRow.add(ans);
    }
    return ansRow;
}

public static ArrayList<ArrayList<Long>> printPascal(int n) {
    ArrayList<ArrayList<Long>> ans = new ArrayList<>();
    for (int row = 1; row <= n; row++) {
        ans.add(generateRow(row));
    }
    return ans;
}
public static void main(String[] args) {
    int n = 5;
    List<ArrayList<Long>> ans = printPascal(n);
    for (ArrayList<Long> it : ans) {
        for (Long ele : it) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
}