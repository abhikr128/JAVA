package Lec_29;

import Lec_28.Dynamic_Queue;

public class Stack_Using_Queue {

	private Dynamic_Queue dq;

	public Stack_Using_Queue() {
		// TODO Auto-generated constructor stub
		dq = new Dynamic_Queue();
	}

	public boolean isEmpty() {
		return dq.isEmpty();
	}

	public int size() {
		return dq.size();
	}

	public void push(int item) throws Exception {
		dq.Enqueue(item);

	}

	public int pop() throws Exception {
		Dynamic_Queue hlp = new Dynamic_Queue();
		while (dq.size() > 1) {
			int x = dq.Dequeue();
			hlp.Enqueue(x);
		}
		int val = dq.Dequeue();
		while (hlp.size() > 0) {
			int x = hlp.Dequeue();
			dq.Enqueue(x);
		}
		return val;
	}
	public int peek() throws Exception {
		Dynamic_Queue hlp = new Dynamic_Queue();
		while (dq.size() > 1) {
			int x = dq.Dequeue();
			hlp.Enqueue(x);
		}
		int val = dq.Dequeue();
		while (hlp.size() > 0) {
			int x = hlp.Dequeue();
			dq.Enqueue(x);
		}
		dq.Enqueue(val);
		return val;
	}
	public static void main(String[] args) throws Exception {
		Stack_Using_Queue st = new Stack_Using_Queue();
		st.push(1);
		st.push(10);
		st.push(11);
		st.push(15);
		System.out.println(st.peek());
	}

}
