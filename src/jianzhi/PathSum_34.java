package jianzhi;

import java.util.ArrayList;
import java.util.List;

public class PathSum_34 {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> path=new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        recur(root, target);
        return ans;
    }

    void recur(TreeNode root,int target){
        if (root==null)
            return;
        path.add(root.val);
        target-=root.val;
        if (target==0 && root.left==null && root.right==null)
            ans.add(new ArrayList<>(path));

        recur(root.left,target);
        recur(root.right,target);
        path.remove(path.size()-1);
    }
}
