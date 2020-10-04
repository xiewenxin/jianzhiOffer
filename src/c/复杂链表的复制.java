package c;
/**
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 * @author xie
 *
 */
public class 复杂链表的复制 {
	
	 public RandomListNode Clone(RandomListNode pHead)
	    {   
	         if(pHead == null) {
	            return null;
	        }
	        RandomListNode current =pHead;
	        //A->B->C  --->  A->A`->B->B`-C->C`
	        while(current!=null){
	        RandomListNode newNode=new RandomListNode(current.label);
	        RandomListNode next=current.next;
	        current.next=newNode;
	        newNode.next=next;
	        current = next;
	        }
	        current =pHead;
	        while(current!=null){
	        RandomListNode r=current.random;
	        current.next.random=r==null?null:r.next;
	        current = current.next.next;
	        }
	        current = pHead;
	        RandomListNode res =pHead.next;
	        while(current!=null){
	        //要将原来节点恢复，不然直接为空。
	        RandomListNode cloneNode = current.next;
	        current.next=cloneNode.next;
	        cloneNode.next=cloneNode.next==null?null:cloneNode.next.next;
	        current = current.next;
	        }
	        return res;
	    }
	 public static class RandomListNode {
		    int label;
		    RandomListNode next = null;
		    RandomListNode random = null;

		    RandomListNode(int label) {
		        this.label = label;
		    }
		}
}
