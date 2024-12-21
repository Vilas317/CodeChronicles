public class Diameterofbinarytree {
    //Brute force
    /*private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public int solve(TreeNode A) {
        if(A == null) {
            return 0;
        }

        int leftHeight = height(A.left);
        int rightHeight = height(A.right);

        int currentDiameter = leftHeight + rightHeight;

        int leftDiameter = solve(A.left);
        int rightDiameter = solve(A.right);

        return Math.max(currentDiameter, Math.max(leftDiameter, rightDiameter));
    }
}*/
//Optimal approach
private int calculateDiameter(TreeNode node, int[] diameter) {
    if(node == null) {
        return 0;
    }

    int leftHeight = calculateDiameter(node.left, diameter);
    int rightHeight = calculateDiameter(node.right, diameter);

    diameter[0] = Math.max(diameter[0], leftHeight+rightHeight);
    return 1 + Math.max(leftHeight, rightHeight);
}
public int solve(TreeNode A) {
    int[] diameter = new int[1];
    calculateDiameter(A, diameter);
    return diameter[0];
}
}