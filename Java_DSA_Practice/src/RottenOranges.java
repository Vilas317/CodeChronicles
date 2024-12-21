import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    public int solve(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();
        int m = A.get(0).size();

        Queue<Pair> q = new LinkedList<>();
        
        int[][] vis = new int[n][m];
        int freshCount = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(A.get(i).get(j) == 2) {
                    q.add(new Pair(i, j, 0));
                    vis[i][j] = 2;
                } else {
                    vis[i][j] = 0;
                }
                if(A.get(i).get(j) == 1) {
                    freshCount++;
                }
            }
        }

        int[] drow = {-1, 0, +1, 0};
        int[] dcol = {0, 1, 0, -1};

        int timeElapsed = 0;
        int rottenCount = 0;

        while(!q.isEmpty()) {
            Pair current = q.poll();
            int r = current.row;
            int c = current.col;
            int time = current.time;

            timeElapsed = Math.max(timeElapsed, time);

            for(int i = 0; i < 4; i++) {
                int nrow = r + drow[i];
                int ncol = c + dcol[i];

                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0 && A.get(nrow).get(ncol) == 1) {
                    q.add(new Pair(nrow, ncol, time + 1));
                    vis[nrow][ncol] = 2;
                    rottenCount++;
                }
            }
        }

        if(rottenCount != freshCount) return -1;

        return timeElapsed;

    }
     public static void main(String[] args) {
        RottenOranges obj = new RottenOranges();

        // Test Case 1
        ArrayList<ArrayList<Integer>> grid1 = new ArrayList<>();
        grid1.add(new ArrayList<>(Arrays.asList(2, 1, 1)));
        grid1.add(new ArrayList<>(Arrays.asList(1, 1, 0)));
        grid1.add(new ArrayList<>(Arrays.asList(0, 1, 1)));
        System.out.println("Output: " + obj.solve(grid1)); // Expected Output: 4

        // Test Case 2
        ArrayList<ArrayList<Integer>> grid2 = new ArrayList<>();
        grid2.add(new ArrayList<>(Arrays.asList(2, 1, 1)));
        grid2.add(new ArrayList<>(Arrays.asList(0, 1, 1)));
        grid2.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        System.out.println("Output: " + obj.solve(grid2)); // Expected Output: -1
    }
}

// Pair class to store row, column, and time
class Pair {
    int row;
    int col;
    int time;

    Pair(int row, int col, int time) {
        this.row = row;
        this.col = col;
        this.time = time;
    }
}

