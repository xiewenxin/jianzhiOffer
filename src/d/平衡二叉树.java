package d;
//判断一棵树是否为平衡二叉树
public class 平衡二叉树{
	boolean flag=true;
    public boolean IsBalanced_Solution(TreeNode root) {
    	getHight(root);
    	return flag;
    }
    
    public int getHight(TreeNode root) {
    	if(root==null) return 0;
    	if(flag) {
    		int Lhight=  getHight(root.left);
        	int Rhight = getHight(root.right);
        	if(Math.abs(Lhight-Rhight)>1) flag=false;
        	return Math.max(Lhight, Rhight)+1;
    	}else {
    		return -1;
    	}
    	
}
    
public static class TreeNode{
   public   TreeNode left;
   public   TreeNode right;
   public  int val;
	public TreeNode(int val) {
		this.val=val;
	}
}
    
}
