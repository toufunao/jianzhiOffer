import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LevelOrder_I_30 {
    public int[] levelOrder(TreeNode root) {
        if (root==null)
            return new int[]{};
        List<Integer> list=new ArrayList<>();
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode t=queue.poll();
            list.add(t.val);
            if (t.left!=null)
                queue.offer(t.left);
            if (t.right!=null)
                queue.offer(t.right);
        }

        int[] number=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            number[i]=list.get(i);
        }
        return number;
    }
}
