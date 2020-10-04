package a;

import d.平衡二叉树.TreeNode;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * @author xie
 *
 */
public class 重建二叉树 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root =re(pre,0,pre.length-1,in,0,in.length-1);//传入前序遍历和中序遍历的序列，返回还原的二叉树。
        return root;
    }
	
    public TreeNode re(int[] pre,int startPre,int endPre,int[] in,int startIn,int endIn){
        if(startPre>endPre||startIn>endIn){//判定是否序列是否便利完。
            return null;
        }
        TreeNode root =new TreeNode(pre[startPre]);//存入节点
        for(int i=startIn;i<=endIn;i++){//从中序遍历开始，寻找和根节点相同的元素。
            if(in[i]==pre[startPre]){//找到了之后分为左右子树，递归进行查找。
                root.left=re(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                root.right=re(pre,startPre+i-startIn+1,endPre,in,i+1,endIn);
            }
        }
        return root;
    }

}
