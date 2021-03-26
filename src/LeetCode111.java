/**
 * @author RuL
 */
public class LeetCode111 {

    boolean balance = true;

    public boolean isBalanced(TreeNode root) {
        countHigh(root);
        return balance;
    }


    public int countHigh(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHigh = countHigh(node.left);
        int rightHigh = countHigh(node.right);

        if (Math.abs(leftHigh - rightHigh) > 1) {
            balance = false;
        }

        return Math.max(leftHigh, rightHigh) + 1;
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
