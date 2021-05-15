package jianzhi;

public class Balanced_56 {
    public boolean isBalanced(TreeNode root) {
        return traverse(root) != -1;
    }

    private int traverse(TreeNode treeNode){
        if (treeNode==null)
            return 0;
        int l=traverse(treeNode.left);
        if (l==-1)
            return -1;
        int r=traverse(treeNode.right);
        if (r==-1)
            return -1;
        return Math.abs(l-r)<2?Math.max(l,r)+1:-1;

    }
}
