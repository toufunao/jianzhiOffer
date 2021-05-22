package practice;

import java.util.HashMap;

public class RebuildTree {
    HashMap<Integer,Integer> map=new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder){
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        return recur(preorder,0,0,inorder.length-1);
    }

    private TreeNode recur(int[] preorder, int root, int left, int right) {
        if (left>right)
            return null;
        TreeNode rootNode=new TreeNode(preorder[root]);
        int i=map.get(preorder[root]);
        rootNode.left=recur(preorder,root+1,left,i-1);
        rootNode.right=recur(preorder,i-left+root+1,i+1,right);
        return rootNode;
    }


}
