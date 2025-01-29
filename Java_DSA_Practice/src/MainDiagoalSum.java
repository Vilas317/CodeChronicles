import java.util.Scanner;

public class MainDiagoalSum {
    public int solve(final int[][] A) {
        int sum = 0;
        int N = A.length;

        for(int i = 0; i < N; i++) {
            sum += A[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] A = new int[R][C];

        for(int i = 0; i < R; i++) {
            for(int j = 0; j < C; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        MainDiagoalSum mainDiagoalSum = new MainDiagoalSum();
        int result = mainDiagoalSum.solve(A);

        System.out.println(result);

        sc.close();
    }
}
