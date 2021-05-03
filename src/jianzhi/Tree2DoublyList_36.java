package jianzhi;

public class Tree2DoublyList_36 {
    Node pre;
    Node head;
    public Node treeToDoublyList(Node root) {
        if (root==null)
            return null;

        dfs(root);

        head.left=pre;
        pre.right=head;
        return head;
    }

    void dfs(Node root){
        if (root==null)
            return;
        dfs(root.left);

        if (pre!=null)
            pre.right=root;
        else
            head=root;
        root.left=pre;
        pre=root;

        dfs(root.right);
    }
}
