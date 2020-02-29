import java.util.ArrayList;
import java.util.List;

public class LeetCode144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        order(root,result);
        return result;
    }

    void order(TreeNode root, List<Integer> result) {
        if(root==null){
            return;
        }
        result.add(root.val);
        order(root.left,result);
        order(root.right,result);
    }
}
