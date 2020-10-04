package b;

import java.util.Stack;

public class 包含min函数的栈 {
    public Stack<Integer> stack= new Stack<Integer>();
    public Stack<Integer> MinStack= new Stack<Integer>();
    public void push(int node) {
    	stack.add(node);
    	if(MinStack.isEmpty()||node<min()) {
    		MinStack.add(node);
    	}else {
    		MinStack.add(min());
    	}
    }
    
    public void pop() {
        stack.pop();
        MinStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
        return MinStack.peek();
    }
}
