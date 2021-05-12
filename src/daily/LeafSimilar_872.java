package daily;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilar_872 {
    List<Integer> value1=new ArrayList<>();
    List<Integer> value2=new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        addValue1(root1);
        addValue2(root2);
        if (value1.size()!=value2.size())
            return false;
        for (int i=0;i<value1.size();i++){
            if (value1.get(i)!=value2.get(i))
                return false;
        }
        return true;
    }

    public void addValue1(TreeNode treeNode){
        if (treeNode==null)
            return;
        if (treeNode.left==null && treeNode.right==null){
            value1.add(treeNode.val);
            return;
        }
        addValue1(treeNode.left);
        addValue1(treeNode.right);
    }

    public void addValue2(TreeNode treeNode){
        if (treeNode==null)
            return;
        if (treeNode.left==null && treeNode.right==null){
            value2.add(treeNode.val);
            return;
        }
        addValue2(treeNode.left);
        addValue2(treeNode.right);
    }
}
