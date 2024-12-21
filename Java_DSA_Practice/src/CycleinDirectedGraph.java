import java.util.ArrayList;

public class CycleinDirectedGraph {
    private boolean dfsCheck(int node, ArrayList<ArrayList<Integer>> adj, int[] vis, int[] pathVis) {
        vis[node] = 1;
        pathVis[node]  =1;

        for(int neighbor : adj.get(node)) {
            if(vis[neighbor] == 0) {
                if(dfsCheck(neighbor, adj, vis, pathVis)) {
                    return true;
                }
            }
            else if(pathVis[neighbor] ==  1) {
                return true;
            }
        }
        pathVis[node] = 0;
        return false;
    }
    public int solve(int A, int[][] B) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i <= A; i++) {
            adj.add(new ArrayList<>());
        }
        for(int[] edge: B) {
            adj.get(edge[0]).add(edge[1]);
        }
        int[] vis = new int[A + 1];
        int[] pathVis = new int[A + 1];

        for(int i =1; i <= A; i++) {
            if(vis[i] == 0) {
                if(dfsCheck(i, adj, vis, pathVis)) {
                    return 1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        CycleinDirectedGraph obj = new CycleinDirectedGraph();

        // Example Test Case 1
        int A1 = 5;
        int[][] B1 = {
            {1, 2},
            {4, 1},
            {2, 4},
            {3, 4},
            {5, 2},
            {1, 3}
        };
        System.out.println("Output: " + obj.solve(A1, B1)); // Expected Output: 1

        // Example Test Case 2
        int A2 = 5;
        int[][] B2 = {
            {1, 2},
            {2, 3},
            {3, 4},
            {4, 5}
        };
        System.out.println("Output: " + obj.solve(A2, B2)); // Expected Output: 0
    }
}

