import java.util.HashMap;
import java.util.Map;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字
 */

public class BuildTree_07 {
    Map<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }

        return recurBuild(preorder,0,0,inorder.length-1);
    }

    private TreeNode recurBuild(int[] preorder, int root, int left, int right) {
        if (left>right)
            return null;

        TreeNode rootNode=new TreeNode(preorder[root]);
        int div=map.get(preorder[root]);
        rootNode.left=recurBuild(preorder,root+1,left,div-1);
        rootNode.right=recurBuild(preorder,root+div-left+1,div+1,right);
        return rootNode;
    }
}
