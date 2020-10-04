package c;

import java.util.LinkedList;

import d.平衡二叉树.TreeNode;
/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，
 * 只能调整树中结点指针的指向。
 * @author xie
 *
 */
public class 二叉搜索树与双向链表 {
	   LinkedList<TreeNode> list;
	    public TreeNode Convert(TreeNode pRootOfTree) {
	      if(pRootOfTree==null) return pRootOfTree;
	       list= new LinkedList<TreeNode>();
	         search(pRootOfTree);
	        int len = list.size();
	          TreeNode res=list.remove();
	          TreeNode current=res;
	          TreeNode next;
	       for(int i=1;i<len;i++){
	         next=list.remove();
	         current.right=next;
	         next.left=current;
	         current=next;
	     }
	     return res;
	  
	    }
	      public void search(TreeNode root) {
	      if(root== null) return ;
	      search(root.left);
	      list.add(root);
	      search(root.right);
	    }
}
