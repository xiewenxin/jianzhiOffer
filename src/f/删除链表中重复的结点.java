package f;

import a.从尾到头打印链表.ListNode;
/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 * @author xie
 *
 */
public class 删除链表中重复的结点 {
    public ListNode deleteDuplication(ListNode pHead)
    {   
        //1. 首先添加一个头节点，以方便碰到第一个，第二个节点就相同的情况
        //2.设置 pre ，last 指针， pre指针指向当前确定不重复的那个节点，而last指针相当于工作指针，一直往后面搜索。
    	
        if(pHead==null||pHead.next==null) return pHead;
        ListNode Head = new ListNode(0);
        Head.next=pHead;
        ListNode current=pHead;
        ListNode last=Head;
        while(current!=null){
           if(current.next!=null&&current.val==current.next.val){
               while(current.next!=null&&current.val==current.next.val){
                   current=current.next;
               }
               last.next=current.next;//把所有重复的删除
               current=current.next;
           }else{
               current=current.next;
               last=last.next;
           }
        }
        return Head.next;
    }
    public ListNode deleteDuplication_V2(ListNode pHead)
    {   
        //1. 首先添加一个头节点，以方便碰到第一个，第二个节点就相同的情况
        //2.设置 pre ，last 指针， pre指针指向当前确定不重复的那个节点，而last指针相当于工作指针，一直往后面搜索。
    	
        if(pHead==null||pHead.next==null) return pHead;
        ListNode Head = new ListNode(0);
        Head.next=pHead;
        ListNode current=pHead;
        ListNode last=Head;
        int count=1;
        while(current!=null){
        if(current.next!=null&&current.val==current.next.val) {
        	count++;
        	if(count>2) {
        		while(current.next!=null&&current.val==current.next.val) {
        			current=current.next;
        		}
        		if(current.next!=null) {
        			last.next=current;
            		current=current.next;
                    last=last.next;
        		}
        	}else {
        		current=current.next;
                last=last.next;
        	}
        }else {
        	count=1;
        	current=current.next;
            last=last.next;
        }
      
        }
        return Head.next;
    }
}
