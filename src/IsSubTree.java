public class IsSubTree {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (B==null||A==null)
            return false;
        if (A.val==B.val && (help(A.left,B.left)&&help(A.right,B.right)))
            return true;

        return isSubStructure(A.left,B)||isSubStructure(A.right,B);
    }

    public boolean help(TreeNode rootA,TreeNode rootB){
        if (rootB==null)
            return true;
        if (rootA==null)
            return false;

        if (rootA.val==rootB.val)
            return help(rootA.left,rootB.left)&&help(rootA.right,rootB.right);
        else
            return false;
    }
}
