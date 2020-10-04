package c;

import java.util.ArrayList;

import d.平衡二叉树.TreeNode;

/**
 * 输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 * @author xie
 *
 */
public class 二叉树中和为某一值的路径 {
	 ArrayList<ArrayList<Integer>>  res;
	    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
	             res=new ArrayList<ArrayList<Integer>>();
	             if(root==null) return res;
		        ArrayList<Integer> list=new ArrayList<Integer>();
		        FindPath(root,target,list);
		        return res;
	    }
	      
	      public void FindPath(TreeNode root,int target, ArrayList<Integer> list) {
	           if(root.left==null&&root.right==null) {
		        	if(target-root.val==0) {
		        		list.add(root.val);
		        		res.add(list) ;
		        	}
		            return ;
		        }
		        if(root.left!=null) {
		        	 ArrayList<Integer> list_l=new ArrayList<Integer>(list);
		 	         list_l.add(root.val);
		 	         FindPath(root.left,target-root.val,list_l);
		        }
		        if(root.right!=null) {
		        	 ArrayList<Integer> list_r=new ArrayList<Integer>(list);
		 	        list_r.add(root.val);
		 	        FindPath(root.right,target-root.val,list_r);
		        }
	    }
}
