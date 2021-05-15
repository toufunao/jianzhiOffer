package jianzhi;

public class NearestParent_68_I {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root!=null){
            if (p.val<root.val && q.val<root.val)
                root=root.left;
            else if (p.val>root.val && q.val>root.val)
                root=root.right;
            else
                break;
        }
        return root;
    }
}
