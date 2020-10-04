package f;

import java.util.*;

import d.平衡二叉树.TreeNode;

public class 按层打印二叉树 {
    public static ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
    ArrayList<ArrayList<Integer> > res =new ArrayList<ArrayList<Integer> > ();
     if(pRoot==null) return res;
     LinkedList<TreeNode> list = new  LinkedList<TreeNode>();
     list.add(pRoot);
     int count=1;
     while(!list.isEmpty()){
         ArrayList<Integer> l= new ArrayList<Integer>();
         int nlast=0;
         while(count>0){
            TreeNode temp=list.removeFirst();
            count--;
            l.add(temp.val);
            if(temp.left!=null){
                list.addLast(temp.left);
                nlast++;
            }
             if(temp.right!=null){
             list.addLast(temp.right);
             nlast++;
            }
         }
         count=nlast;
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
