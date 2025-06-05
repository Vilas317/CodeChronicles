import java.util.*;

public class SetMatrixZeroes {
    //Brute Force
    // static void markRow(ArrayList<ArrayList<Integer>> matrix, int n, int m, int i) {
    //     for(int j = 0; j < m; j++) {
    //         if(matrix.get(i).get(j) != 0) {
    //             matrix.get(i).set(j, -1);
    //         }
    //     }
    // }
    // static void markCol(ArrayList<ArrayList<Integer>> matrix, int n, int m, int j) {
    //     for(int i = 0; i < n; i++) {
    //         if(matrix.get(i).get(j) != 0) {
    //             matrix.get(i).set(j, -1);
    //         }
    //     }
    // }
    static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
    //     for(int i = 0; i < n; i++) {
    //         for(int j = 0; j < m; j++) {
    //             if(matrix.get(i).get(j) == 0) {
    //                 markRow(matrix, n, m, i);
    //                 markCol(matrix, n, m, j);
    //             }
    //         }
    //     }
    //     for(int i = 0; i < n; i++) {
    //         for(int j = 0; j < m; j++) {
    //             if(matrix.get(i).get(j) == -1) {
    //                 matrix.get(i).set(j, 0);
    //             }
    //         }
    //     }
    //     return matrix;
    // }
    //Better Approach
//     int[] row = new int[n];
//     int[] col = new int[m];
//     for(int i = 0; i < n; i++) {
//         for(int j = 0; j < m; j++) {
//             if(matrix.get(i).get(j) == 0) {
//                 row[i] = 1;
//                 col[i] = 1;
//             }
//         }
//     }
//     for(int i = 0; i < n; i++) {
//         for(int j = 0; j < m; j++) {
//             if(row[i] == 1 || col[i] == 1) {
//                 matrix.get(i).set(j, 0);
//             }
//         }
//     }
//     return matrix;
// }
//Optimal Approach
int col0 = 1;
for(int i = 0; i < n; i++) {
    for(int j = 0; j < m; j++) {
        if(matrix.get(i).get(j) == 0) {
            matrix.get(i).set(0, 0);
            if(j != 0)
            matrix.get(0).set(j, 0);
            else
            col0 = 0;
        }
    }
}
for(int i = 1; i < n; i++) {
    for(int j = 1; j < m; j++) {
        matrix.get(0).set(j, 0);
    }
}
if(col0 == 0) {
    for(int i = 0; i < n; i++) {
        matrix.get(i).set(0, 0);
    }
}
return matrix;
}
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int n = matrix.size();
        int m = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, n, m);

        System.out.println("The Final matrix is: ");
        for (ArrayList<Integer> row : ans) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
