package jianzhi;

public class MaxDepth_55 {
    public int maxDepth(TreeNode root) {
        return findDepth(root);
    }

    public int findDepth(TreeNode treeNode){
        if (treeNode==null)
            return 0;
        int l=findDepth(treeNode.left);
        int r=findDepth(treeNode.right);
        return l>r?l+1:r+1;
    }
}
