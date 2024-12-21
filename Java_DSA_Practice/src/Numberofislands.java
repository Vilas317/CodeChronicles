import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Numberofislands {
    public int solve(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();
        int m = A.get(0).size();

        boolean[][] vis = new boolean[n][m];

        int count = 0;

        int[] drow = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dcol = {-1, 0, 1, -1, 1, -1, 0, 1};

        Queue<Pair> q = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(A.get(i).get(j) == 1 && !vis[i][j]) {
                    count++;
                    q.add(new Pair(i, j));
                    vis[i][j] = true;

                    while(!q.isEmpty()) {
                        Pair current  = q.poll();
                        int r = current.row;
                        int c = current.col;

                        for(int k = 0; k < 8; k++) {
                            int nrow = r + drow[k];
                            int ncol = c + dcol[k];

                            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m &&
                                    !vis[nrow][ncol] && A.get(nrow).get(ncol) == 1) {
                                q.add(new Pair(nrow, ncol));
                                vis[nrow][ncol] = true;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Numberofislands obj = new Numberofislands();

        // Test Case 1
        ArrayList<ArrayList<Integer>> grid1 = new ArrayList<>();
        grid1.add(new ArrayList<>(Arrays.asList(0, 1, 0)));
        grid1.add(new ArrayList<>(Arrays.asList(0, 0, 1)));
        grid1.add(new ArrayList<>(Arrays.asList(1, 0, 0)));
        System.out.println("Output: " + obj.solve(grid1)); // Expected Output: 2

        // Test Case 2
        ArrayList<ArrayList<Integer>> grid2 = new ArrayList<>();
        grid2.add(new ArrayList<>(Arrays.asList(1, 1, 0, 0, 0)));
        grid2.add(new ArrayList<>(Arrays.asList(0, 1, 0, 0, 0)));
        grid2.add(new ArrayList<>(Arrays.asList(1, 0, 0, 1, 1)));
        grid2.add(new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0)));
        grid2.add(new ArrayList<>(Arrays.asList(1, 0, 1, 0, 1)));
        System.out.println("Output: " + obj.solve(grid2)); // Expected Output: 5
    }
}

// Pair class to store row and column
class Pair {
    int row;
    int col;

    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
