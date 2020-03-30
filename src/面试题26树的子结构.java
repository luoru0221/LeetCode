public class 面试题26树的子结构 {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null && B == null) {
            return true;
        }
        if (B == null) {
            return false;
        }
        if (A == null) {
            return false;
        }
        if(isEquals(A,B)){
            return true;
        }
        return isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    public boolean isEquals(TreeNode A, TreeNode B) {
        if (A == null && B == null) {
            return true;
        }
        if (B == null) {
            return true;
        }
        if (A == null) {
            return false;
        }
        return A.val == B.val && isEquals(A.left, B.left) && isEquals(A.right, B.right);
    }
}
