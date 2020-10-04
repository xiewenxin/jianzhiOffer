package xiaomi;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String str = sc.nextLine();
	String fun = fun(str);
	System.out.println(fun);
}
public static String fun(String str) {
	//时间复杂度O(n)
	Stack<Character> stack=new Stack<Character>();
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)!='6'||stack.size()<2) {
			stack.push(str.charAt(i));
		}else {
           Character first=stack.pop();
           Character second=stack.pop();
           if(first!='1'||second!='8') {
        	   stack.push(second);
        	   stack.push(first);
        	   stack.push(str.charAt(i));
           }
		} 
	}
	StringBuffer res=new StringBuffer();
	for(int i=0;i<stack.size();i++) {
		res.append(stack.get(i));
	}
	return res.toString();
}
public static String fun_V2(String str) {
	LinkedList<Character> queue=new LinkedList<Character>();
	Character second='0';
	StringBuffer res = new StringBuffer();
	for(int i=0;i<str.length();i++) {
		queue.addLast(str.charAt(i));
		if(str.charAt(i)!='6') {
			if(i>0) {
				second=queue.getFirst();
			}
			queue.addLast(str.charAt(i));
		}else {
			if(second=='8'&&queue.getFirst()=='1') {
				queue.removeLast();
				queue.removeLast();
			}
		}
	}
	return queue.toString();
}
}
