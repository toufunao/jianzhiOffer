package jianzhi;

public class KthLargest_54 {
    int ans;
    int k;
    public int kthLargest(TreeNode root, int k) {
        this.k=k;
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode root) {
        if (root==null)
            return;
        dfs(root.right);
        if (k==0)
            return;
        k--;
        if (k==0)
            ans=root.val;

        dfs(root.left);
    }
}
