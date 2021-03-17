import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author RuL
 */
public class LeetCode103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        zigzagLevelOrder(list, root, 0, 1);
        return list;
    }

    public void zigzagLevelOrder(List<List<Integer>> list, TreeNode root, int level, int direct) {
        if (root == null) {
            return;
        }

        LinkedList<Integer> storey;

        if (list.size() < level + 1) {
            storey = new LinkedList<>();
            list.add(storey);
        } else {
            storey = (LinkedList<Integer>) list.get(level);
        }
        if (direct == 1) {
            storey.addLast(root.val);
            zigzagLevelOrder(list, root.left, level + 1, -1);
            zigzagLevelOrder(list, root.right, level + 1, -1);
        } else {
            storey.addFirst(root.val);
            zigzagLevelOrder(list, root.left, level + 1, 1);
            zigzagLevelOrder(list, root.right, level + 1, 1);
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
