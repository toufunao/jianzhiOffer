package practice;

public class SubStructure {
    public boolean isSubStructure(TreeNode A, TreeNode B){
        if (A==null ||B==null)
            return false;

        if (A.val==B.val && help(A.left,B.left)&&help(A.right,B.right))
            return true;

        return isSubStructure(A.left,B)||isSubStructure(A.right,B);
    }

    private boolean help(TreeNode A, TreeNode B) {
        if (B==null)
            return true;
        if (A==null)
            return false;


        if (A.val==B.val)
            return help(A.left,B.left)&&help(A.right,B.left);

        return false;
    }
}
