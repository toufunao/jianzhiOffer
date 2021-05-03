package jianzhi;

import java.util.*;

public class LevelOrder_III_32 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> queue=new ArrayDeque<>();
        if (root==null)
            return ans;
        queue.add(root);
        while (!queue.isEmpty()){
            LinkedList<Integer> t=new LinkedList<>();
            int i=0;
            int queueSize=queue.size();
            while (i<queueSize) {
                TreeNode treeNode = queue.poll();
                if (ans.size() % 2 == 0) t.addLast(treeNode.val);
                else t.addFirst(treeNode.val);
                if (treeNode.left != null)
                    queue.add(treeNode.left);
                if (treeNode.right != null)
                    queue.add(treeNode.right);
                i++;
            }
            ans.add(t);
        }
        return ans;
    }
}
