package g;

import java.util.LinkedList;
import java.util.Queue;

import d.平衡二叉树.TreeNode;

public class 序列化和反序列化二叉树 {
    String Serialize(TreeNode root) {
        if(root == null)
        {
            return "#,";
        }
        String res = root.val + ",";
        res += Serialize(root.left);
       res += Serialize(root.right);
       return res;
          
   }
     TreeNode Deserialize(String str) {
        String[] values = str.split(",");
         Queue<String> queue= new LinkedList<String>();
         for(int i = 0;i != values.length; i ++)
          {
             queue.offer(values[i]);
         }
         return preOrder(queue);
   }
     public TreeNode preOrder(Queue<String> queue)
     {
         String value = queue.poll();
         if(value.equals("#"))
          {
             return null;
         }
         TreeNode head = new TreeNode(Integer.valueOf(value));
         head.left = preOrder(queue);
         head.right = preOrder(queue);
         return head;
     }
}
