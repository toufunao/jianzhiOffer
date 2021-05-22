package practice;

public class MirrorTree {
    public TreeNode mirrorTree(TreeNode root){
        if (root==null)
            return null;
        TreeNode t=root.left;
        root.left=root.right;
        root.right=t;

        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}
