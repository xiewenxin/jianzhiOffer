package a;

import a.从尾到头打印链表.ListNode;

/**
 * 
 * @author xie
 *
 */
public class 链表中倒数第k个结点 {
 public ListNode FindKthToTail(ListNode head,int k) {
 int n=0;
ListNode node,kNode;
node=kNode=head;
for(;node!=null;n++) {
  node=node.next;
  if(n>=k){
       kNode=kNode.next;
   }
   
}
return n<k?null:kNode;
}
}
