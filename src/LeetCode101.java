public class LeetCode101 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isSymmetry(root.left, root.right);
    }

    //判断左子树和右子树是否对称
    public boolean isSymmetry(TreeNode left, TreeNode right) {
        if ((left == null && right != null) || (left != null && right == null)) {
            //只有一个为null
            return false;
        }
        if (left != null && right != null) {
            if (left.val != right.val) {
                return false;
            }
            return isSymmetry(left.left, right.right) && isSymmetry(left.right, right.left);
        }
        return true;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
