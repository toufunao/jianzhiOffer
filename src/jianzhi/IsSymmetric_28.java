package jianzhi;

public class IsSymmetric_28 {
    public boolean isSymmetric(TreeNode root) {
        if (root==null)
            return true;

        return verify(root.left,root.right);
    }

    private boolean verify(TreeNode left, TreeNode right) {
        if (left==null&&right==null)
            return true;

        if (left==null||right==null||left.val!=right.val)
            return false;

        return verify(left.right,right.left)&&verify(left.left,right.right);
    }
}
