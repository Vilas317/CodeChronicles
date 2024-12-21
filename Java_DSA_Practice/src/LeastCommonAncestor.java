public class LeastCommonAncestor {
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
}
