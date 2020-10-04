package f;

import d.平衡二叉树.TreeNode;

public class 对称的二叉树 {

	public boolean isSymmetricalDFS(TreeNode pRoot)
	{
		if(pRoot==null) return true;
		TreeNode l = pRoot.left;
		TreeNode r = pRoot.right;
		boolean res=isSymmetricalDFS(l,r);
		return res;
	}
	public boolean isSymmetricalDFS(TreeNode l, TreeNode r) {
		if(l==null&&r==null) return true;
		if(l==null||r==null||l.val!=r.val) return false;
		return isSymmetricalDFS(l.left,r.right)&&isSymmetricalDFS(l.right,r.left);
	}

}