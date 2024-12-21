import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class ZigZagLevelOrderTraversal {
    public int[][] zigzagLevelOrder(TreeNode A) {
        if (A == null) {
            return new int[0][];
        }

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(A);

        boolean leftToRight = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (leftToRight) {
                    currentLevel.add(node.val);
                } else {
                    currentLevel.add(0, node.val);
                }

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            result.add(currentLevel);
            leftToRight = !leftToRight;
        }

        int[][] output = new int[result.size()][];
        for (int i = 0; i < result.size(); i++) {
            List<Integer> level = result.get(i);
            output[i] = level.stream().mapToInt(x -> x).toArray();
        }

        return output;
    }
}

class TestZigZagTraversal {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);

        ZigZagLevelOrderTraversal solution = new ZigZagLevelOrderTraversal();
        int[][] result1 = solution.zigzagLevelOrder(root1);

        System.out.println("Test Case 1: ");
        printResult(result1);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(6);
        root2.right = new TreeNode(2);
        root2.right.left = new TreeNode(3);

        int[][] result2 = solution.zigzagLevelOrder(root2);

        System.out.println("Test Case 2: ");
        printResult(result2);
    }

    private static void printResult(int[][] result) {
        for (int[] level : result) {
            for (int val : level) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
