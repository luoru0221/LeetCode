import java.util.ArrayList;
import java.util.List;

/**
 * @author RuL
 */
public class LeetCode199 {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        leftToRight(root, 0, ans);
        return ans;
    }

    public void leftToRight(TreeNode node, int deep, List<Integer> ans) {
        if (node != null) {
            if (deep >= ans.size()) {
                ans.add(node.val);
            } else {
                ans.set(deep, node.val);
            }

            leftToRight(node.left, deep + 1, ans);
            leftToRight(node.right, deep + 1, ans);
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
