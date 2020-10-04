package f;

import java.util.HashSet;

import a.从尾到头打印链表.ListNode;

public class 链表中环的入口结点 {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode head=pHead;
        HashSet<ListNode> set = new HashSet<ListNode>();
        while(head!=null){
            if(set.add(head)){
                head=head.next;
            }else{
                return head;
            }
        }
        return null;
  
    }
}
