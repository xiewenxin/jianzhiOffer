package e;

public class 二叉树的下一个节点 {
	public TreeLinkNode GetNext(TreeLinkNode pNode) {
		if (pNode == null)
			return null;
		if (pNode.right != null) { // 如果有右子树，则找右子树的最左节点
			pNode = pNode.right;
			while (pNode.left != null)
				pNode = pNode.left;
			return pNode;
		}
		while (pNode.next != null) { // 没右子树，则找第一个当前节点是父节点左孩子的节点
			if (pNode.next.left == pNode)
				return pNode.next;
			pNode = pNode.next;
		}
		return null; // 退到了根节点仍没找到，则返回null
	}

	public static class TreeLinkNode {
		int val;
		TreeLinkNode left = null;
		TreeLinkNode right = null;
		TreeLinkNode next = null;

		public TreeLinkNode(int val) {
			this.val = val;
		}
	}
}
