import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Dijkstra {
    public int[] solve(int A, int[][] B, int C) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for(int i = 0; i < A; i++) {
            adj.add(new ArrayList<>());
        }
        for(int[] edge : B) {
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];
            adj.get(u).add(new int[]{v, weight});
            adj.get(u).add(new int[]{u, weight});
        }
        int[] dist = new int[A];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        dist[C] = 0;
        pq.offer(new int[]{C, 0});

        while(!pq.isEmpty()) {
            int[] curr = pq.poll();
            int node = curr[0];
            int d = curr[1];

            if(d > dist[node]) continue;

            for(int[] neighbor : adj.get(node)) {
                int adjNode = neighbor[0];
                int weight = neighbor[1];

                if(dist[node] + weight < dist[adjNode]) {
                    dist[adjNode] = dist[node] + weight;
                    pq.offer(new int[]{adjNode, dist[adjNode]});
                }
            }
        }
        for(int i = 0; i < A; i++) {
            if(dist[i] == Integer.MAX_VALUE) dist[i] = -1;
        }
        return dist;
    }
    public static void main(String[] args) {
        Dijkstra obj = new Dijkstra();

        // Example Test Case 1
        int A1 = 6;
        int[][] B1 = {
            {0, 4, 9},
            {3, 4, 6},
            {1, 2, 1},
            {2, 5, 1},
            {2, 4, 5},
            {0, 3, 7},
            {0, 1, 1},
            {4, 5, 7},
            {0, 5, 1}
        };
        int C1 = 4;
        System.out.println("Output 1: " + Arrays.toString(obj.solve(A1, B1, C1))); // Expected: [7, 6, 5, 6, 0, 6]

        // Example Test Case 2
        int A2 = 5;
        int[][] B2 = {
            {0, 3, 4},
            {2, 3, 3},
            {0, 1, 9},
            {3, 4, 10},
            {1, 3, 8}
        };
        int C2 = 4;
        System.out.println("Output 2: " + Arrays.toString(obj.solve(A2, B2, C2))); // Expected: [14, 18, 13, 10, 0]
    }
}
