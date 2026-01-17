package collectionFramework;

import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		System.out.println(stack.isEmpty());
		
		System.out.println(stack.size());
		
		System.out.println(stack.search(2));
		// 4
		// 3
		// 2
		// 1
		
		
		// LinkedList as Stack
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		System.out.println(list);
		
		list.getLast();  // peek
		list.removeLast(); // pop
		list.size();
		list.isEmpty();
		
	
		
		
		
		
		
		
		
	}

}
