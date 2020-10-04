package c;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import d.平衡二叉树.TreeNode;

public class 从上往下打印二叉树 {
	 public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
	      
			ArrayList<Integer> list = new ArrayList<Integer>();
	          if(root==null){
	            return list;
	        }
	        Queue<TreeNode> queue = new LinkedList <TreeNode>();//队列存储需要打印的节点
			TreeNode nlast=root; //表示下一行需要打印的最右节点
			TreeNode last =root;//表示当前行打印的最右节点
	        queue.add(root);
			while(!queue.isEmpty()) {
				TreeNode t=queue.poll();//当前打印的节点
				list.add(t.val);
				if(t.left!=null) {
					queue.add(t.left);   //将当前打印节点的左子节点放入队列
					nlast=t.left;
				}
				if(t.right!=null) {
					queue.add(t.right);//将当前打印节点的右子节点放入队列
					nlast=t.right;
				}
				if(t==last) {//判断打印节点是否是当前行的最右节点，若为ture，则需换行。
					last=nlast;
					//System.out.println();
				}
				
			}
			return list;
	    }
}
