import java.util.ArrayList;
import java.util.List;

public class LeetCode102 {

    List<List<Integer>> list = new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        funtion(root, 0);
        return list;
    }

    public void funtion(TreeNode root, int dep) {
        if (root == null) {
            return;
        }
        if (list.size() <= dep) {
            List<Integer> temp = new ArrayList<Integer>();
            temp.add(root.val);
            list.add(temp);
        } else {
            list.get(dep).add(root.val);
        }
        funtion(root.left, dep + 1);
        funtion(root.right, dep + 1);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
