/**
 * RuL
 * 判断棵二叉树是否相同
 */
public class LeetCode100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null && q != null ) {
            if(p.val!=q.val) {
                return false;
            }else{
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            }
        }else return p == null && q == null;
    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

}


