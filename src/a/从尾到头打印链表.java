package a;

import java.util.ArrayList;

/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * @author xie
 *
 */
public class 从尾到头打印链表 {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
         ArrayList<Integer> res = new ArrayList<Integer>();
         if(listNode==null) return res;
    	 printNode(listNode,res);
    	 return res;
    }
    public static  ArrayList<Integer> printNode(ListNode head,ArrayList<Integer> list) {
    	if(head.next==null){
    		list.add(head.val);
    		return list;
    	}
    	ArrayList<Integer> res= printNode(head.next,list);
    	res.add(head.val);
    	return res;
    }
    public static class ListNode {
    	        public int val;
    	        public ListNode next = null;
    	
    	       public ListNode(int val) {
    	           this.val = val;
    	        }
          }
    public static void main(String[] args) {
    	ListNode head= new ListNode(1);
    	head.next=new ListNode(2);
    	head.next.next=new ListNode(3);
    	head.next.next.next=new ListNode(4);
    	ArrayList<Integer> res = printListFromTailToHead(head);
    	System.out.println(res);
	}
}
