import java.util.PriorityQueue;

public class KthSmallestElement {
    public static int KthSmallest(final int[] A, int B) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for(int i = 0; i < B; i++) {
            maxHeap.offer(A[i]);
        }
        for(int i = B; i < A.length; i++) {
            if(A[i] < maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.offer(A[i]);
            }
        }
        return maxHeap.peek();
    }
    public static void main(String[] args) {
        KthSmallestElement kthSmallest = new KthSmallestElement();

        int[] A1 = {2, 1, 4, 3, 2};
        int B1 = 3;
        System.out.println("Kth smallest element: " + KthSmallestElement.KthSmallest(A1, B1));

        int[] A2 = {1, 2};
        int B2 = 2;
        System.out.println("Kth smallest element: " + KthSmallestElement.KthSmallest(A2, B2));
    }
    
}
