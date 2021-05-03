package jianzhi;

import java.util.LinkedList;
import java.util.Queue;

public class TreeSerialization_37 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root==null)
            return "[]";
        StringBuilder stringBuilder=new StringBuilder("[");
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node=queue.poll();
            if (node!=null){
                stringBuilder.append(node.val+",");
                queue.add(node.left);
                queue.add(node.right);
            }
            else
                stringBuilder.append("null,");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("[]"))
            return null;

        String[] nodes=data.substring(1,data.length()-1).split(",");
        Queue<TreeNode> queue=new LinkedList<>();
        TreeNode root=new TreeNode(Integer.parseInt(nodes[0]));
        queue.add(root);
        int i=1;
        while (!queue.isEmpty()){
            TreeNode node=queue.poll();
            if (!nodes[i].equals("null")){
                node.left=new TreeNode(Integer.parseInt(nodes[i]));
                queue.add(node.left);
            }
            i++;
            if (!nodes[i].equals("null")){
                node.right=new TreeNode(Integer.parseInt(nodes[i]));
                queue.add(node.right);
            }
            i++;
        }
        return root;
    }
}
