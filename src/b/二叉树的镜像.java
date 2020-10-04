package b;

import d.平衡二叉树.TreeNode;
/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * @author xie
 *
 */
public class 二叉树的镜像 {
    public void Mirror(TreeNode root) {
            if(root!=null){
            TreeNode temp = root.left;
            root.left=root.right;
            root.right=temp;
            Mirror(root.left);
            Mirror(root.right);
        }
    }
}
