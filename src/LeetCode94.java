import java.util.ArrayList;
import java.util.List;

/**
 * @author RuL
 */
public class LeetCode94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inOrder(root,ans);
        return ans;
    }

    public void inOrder(TreeNode node, List<Integer> ans) {
        if (node != null) {
            inOrder(node.left, ans);
            ans.add(node.val);
            inOrder(node.right, ans);
        }
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
