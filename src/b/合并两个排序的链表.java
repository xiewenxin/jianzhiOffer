package b;

import a.从尾到头打印链表.ListNode;

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * @author xie
 *1->2->5 ,   1->3->4  
 *1->1->2->3->4->5
 */
public class 合并两个排序的链表 {
    public ListNode Merge(ListNode list1,ListNode list2) {
    	 if(list1==null){
             return list2;
         }if(list2==null){
             return list1;
         }
         ListNode node =null;
         if(list1.val<=list2.val){
             list1.next=Merge(list1.next,list2);
             return list1;
         }else{
             list2.next=Merge(list1,list2.next);
             return list2;
         }
    }
}
