/*public class LeastCommonAncestor {
    public int lca(TreeNode A, int B, int C) {
        TreeNode lcaNode = findLCA(A, B, C);

        if(lcaNode != null && (find(A, B) && find(A, C))) {
            return lcaNode.val;
        }
        return -1;
    }

    private TreeNode findLCA (TreeNode root, int B, int C){
        if(root == null || root.val == B || root.val == C) {
            return root;
        }
        TreeNode left = findLCA(root.left, B, C);
        TreeNode right = findLCA(root.right, B, C);

        if(left != null && right != null) {
            return root;
        }
        return left != null ? left : right;
    }

    private boolean find(TreeNode root, int value) {
        if(root == null) {
            return false;
        }
        if(root.val == value) {
            return true;
        }
        return find(root.left, value) || find(root.right, value);
    }
}*/
// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class LeastCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case
        if (root == null || root == p || root == q) {
            return root;
        }

        // Recursively search in the left and right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // Result
        if (left == null) {
            return right;
        } else if (right == null) {
            return left;
        } else { // Both left and right are not null, we found our result
            return root;
        }
    }
}
