package f;

import java.util.ArrayList;
import java.util.LinkedList;

import d.平衡二叉树.TreeNode;

public class 按之字形顺序打印二叉树 {
    public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
    	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    	LinkedList<TreeNode> list = new LinkedList<TreeNode>();
    	list.addFirst(pRoot);
    	int count=1;
    	boolean flag=true;//顺时针打印
    	while(!list.isEmpty()) {
    		int nlast=0;
    		ArrayList<Integer> l = new ArrayList<Integer>();
    		while(count>0) {
    			    TreeNode last =null;
    			    if(flag) {
    			    last = list.removeFirst();//顺时针
    			    l.add(last.val);
        			if(last.left!=null) {
        				list.addLast(last.left);
        				nlast++;
        			}
        			if(last.right!=null) {
        				list.addLast(last.right);
        				nlast++;
        			}
    			    }else {
    			    last=list.removeLast();//逆时针
    			    l.add(last.val);
        			
        			if(last.right!=null) {
        				list.addFirst(last.right);
        				nlast++;
        			}
        			if(last.left!=null) {
        				list.addFirst(last.left);
        				nlast++;
        			}
    			    }
    			    count--;
    			}
			 count=nlast;
  		     flag=!flag;
             res.add(l);
    	}
    	return res;
    }
    public static void main(String[] args) {
    	TreeNode h= new TreeNode(1);
    	h.left=new TreeNode(2);
    	h.right=new TreeNode(3);
    	h.left.left=new TreeNode(4);
    	h.left.right=new TreeNode(5);
    	h.right.left=new TreeNode(6);
    	h.right.right=new TreeNode(7);
    	ArrayList<ArrayList<Integer>> res = Print(h);
    	System.out.println(res);
	}
}
