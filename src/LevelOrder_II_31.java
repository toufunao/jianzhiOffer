import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LevelOrder_II_31 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> queue=new ArrayDeque<>();

        if (root==null)
            return ans;
        queue.offer(root);

        while (!queue.isEmpty()){
            List<Integer> t=new ArrayList<>();
            int i=0;
            int size=queue.size();
            while (i<size){
                TreeNode treeNode=queue.poll();
                t.add(treeNode.val);
                if (treeNode.left!=null)
                    queue.offer(treeNode.left);
                if (treeNode.right!=null)
                    queue.offer(treeNode.right);
                i++;
            }
            ans.add(t);
        }
        return ans;
    }
}
