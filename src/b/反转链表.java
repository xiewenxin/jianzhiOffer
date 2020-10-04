package b;

import a.从尾到头打印链表.ListNode;

/**
 * 输入一个链表，反转链表后，输出新链表的表头
 * @author xie
 *
 */
public class 反转链表 {
	//头插法
    public ListNode ReverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode pre =null;
        ListNode next = null;
        while(head!=null){
            next=head.next;//记录下一个需要改变的节点
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
  //递归法
    public ListNode ReverseList_V2(ListNode head) {
    	if(head==null) return head;
        if(head.next==null){
            return head;
        }
        ListNode next = ReverseList(head.next);
        head.next.next=head;
        head.next=null;
        return next;    }
    public static void main(String[] args) {
		
	}
}
