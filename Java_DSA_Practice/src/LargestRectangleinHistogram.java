import java.util.Stack;

public class LargestRectangleinHistogram {
     public int largestRectangleArea(int[] A) {
        //Brute force
        /*int n = A.length;
        int maxArea = 0;

        for(int i = 0; i < n; i++) {
            int minHeight = Integer.MAX_VALUE;
            for(int j = i; j < n; j++) {
                minHeight = Math.min(minHeight, A[j]);
                int area = minHeight * (j - i + 1);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        LargestRectangleinHistogram solution = new LargestRectangleinHistogram();
        int[] A1 = {2, 1, 5, 6, 2, 3};
        int[] A2 = {2};

        System.out.println("Largest rectangle area in histogram 1: " + solution.largestRectangleArea(A1));
        System.out.println("Largest rectangle area in histogram 1: " + solution.largestRectangleArea(A2));
    }
}*/
//Optimal Approach
int n = A.length;
Stack<Integer> stack = new Stack<>();
int maxArea = 0;

for(int i = 0; i <= n; i++) {
    while (!stack.isEmpty() && (i == n || A[stack.peek()] >= A[i])) {
        int height = A[stack.pop()];
        int width = stack.isEmpty() ? i : i - stack.peek() - 1;
        maxArea = Math.max(maxArea, height * width);
    }
    stack.push(i);
}
return maxArea;
}
public static void main(String[] args) {
    LargestRectangleinHistogram solution = new LargestRectangleinHistogram();
    int[] A1 = {2, 1, 5, 6, 2, 3};
    int[] A2 = {2};

    System.out.println("Largest rectangle area in histogram 1: " + solution.largestRectangleArea(A1));
    System.out.println("Largest rectangle area in histogram 1: " + solution.largestRectangleArea(A2));
}
}