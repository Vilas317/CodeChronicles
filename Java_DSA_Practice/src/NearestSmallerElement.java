import java.util.Stack;

public class NearestSmallerElement {
    public int[] prevSmaller(int[] A) {
        //Brute force
        /*int n = A.length;
        int[] G = new int[n];

        for(int i = 0; i < n; i++) {
            G[i] = -1;
            for(int j = i - 1; j >= 0; j--) {
                if(A[j] < A[i]) {
                    G[i] = A[j];
                    break;
                }
            }
        }
        return G;
    }
    public static void main(String[] args) {
        NearestSmallerElement solution = new NearestSmallerElement();

        int[] A1 = {4, 5, 2, 10, 8};
        int[] result1 = solution.prevSmaller(A1);
        System.out.print("Result for A1: ");
        for(int res : result1 ) {
            System.out.println(res + " ");
        }
        System.out.println();

        int[] A2 = {3, 2, 1};
        int[] result2 = solution.prevSmaller(A2);
        System.out.print("Result for A2: ");
        for (int res : result2) {
            System.out.print(res + " ");
        }
        System.out.println();
    }
}*/
//Optimal Approach
int n = A.length;
int[] G = new int[n];
Stack<Integer> stack = new Stack<>();

for(int i = 0; i < n; i++) {
    while(!stack.isEmpty() && stack.peek() >= A[i]) {
        stack.pop();
    }
    G[i] = stack.isEmpty() ? -1 : stack.peek();

    stack.push(A[i]);
}
return G;
}
public static void main(String[] args) {
    NearestSmallerElement solution = new NearestSmallerElement();

    int[] A1 = {4, 5, 2, 10, 8};
    int[] result1 = solution.prevSmaller(A1);
    System.out.print("Result for A1: ");
    for(int res : result1 ) {
        System.out.println(res + " ");
    }
    System.out.println();

    int[] A2 = {3, 2, 1};
    int[] result2 = solution.prevSmaller(A2);
    System.out.print("Result for A2: ");
    for (int res : result2) {
        System.out.print(res + " ");
    }
    System.out.println();
}
}