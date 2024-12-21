import java.util.HashMap;
import java.util.Map;

class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) {
          val = x;
          left=null;
         right=null;
        }
}

public class BinaryTreeFromAndPreorder {
    public TreeNode buildTree(int[] A, int[] B) {
        Map<Integer, Integer> inMap = new HashMap<>();

        for(int i = 0; i < B.length; i++) {
            inMap.put(B[i], i);
        }
        return buildTreeHelper(A, 0, A.length - 1, B, 0, B.length - 1, inMap);
    }

    private TreeNode buildTreeHelper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> inMap) {
        if(preStart > preEnd || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int inRoot = inMap.get(root.val);
        int numsLeft = inRoot - inStart;
        root.left = buildTreeHelper(preorder, preStart+1, preStart+numsLeft, inorder, inStart, inRoot-1, inMap);
        root.right = buildTreeHelper(preorder, preStart+numsLeft+1, preEnd, inorder, inRoot+1, inEnd, inMap);

        return root;
    }

    public void printInorder(TreeNode root) {
        if(root != null) {
            printInorder(root.left);
            System.out.println(root.val + " ");
            printInorder(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTreeFromAndPreorder sol = new BinaryTreeFromAndPreorder();
        int[] preorder1 = {1, 2, 3};
        int[] inorder1 = {2, 1, 3};
        TreeNode root1 = sol.buildTree(preorder1, inorder1);
        System.out.print("Inorder of constructed tree: ");
        sol.printInorder(root1);
        System.out.println();

        int[] preorder2 = {1, 2, 3};
        int[] inorder2 = {2, 1, 3};
        TreeNode root2 = sol.buildTree(preorder2, inorder2);
        System.out.print("Inorder of constructed tree: ");
        sol.printInorder(root2);
        System.out.println();
        
    }
    
}
