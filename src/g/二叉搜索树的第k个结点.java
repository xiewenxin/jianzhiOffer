package g;

import java.util.ArrayList;

import d.平衡二叉树.TreeNode;
//二叉搜索树的第k个节点就是其中序遍历的第k个节点
public class 二叉搜索树的第k个结点 {
	public static int count=0;
	public	static TreeNode res;
    public	static TreeNode KthNode(TreeNode pRoot, int k)
    {
		if(pRoot==null) return null;
		search(pRoot,k);
		return res; 
    }
	public static void search(TreeNode pRoot, int k)
    {
		if(pRoot==null) return ;
		search(pRoot.left,k);
        count++;
        if(count==k) res=pRoot;
        search(pRoot.right,k);
    }
public static void main(String[] args) {
	TreeNode h= new TreeNode(4);
	h.left=new TreeNode(2);
	h.right=new TreeNode(6);
	h.left.left=new TreeNode(1);
	h.left.right=new TreeNode(3);
	h.right.left=new TreeNode(5);
	h.right.right=new TreeNode(7);
	TreeNode res= KthNode(h,3);
	System.out.println(res.val);
}
}
