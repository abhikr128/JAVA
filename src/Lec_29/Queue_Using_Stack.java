package Lec_29;

import Lec_28.Dynamic_Stack;

public class Queue_Using_Stack {

	Dynamic_Stack ds;

	public Queue_Using_Stack() {
		// TODO Auto-generated constructor stub
		ds = new Dynamic_Stack();
	}

	public boolean isEmpty() {
		return ds.isEmpty();
	}

	public int size() {
		return ds.size();
	}

	public void Enqueue(int item) throws Exception {
		if (ds.isEmpty()) {
			ds.push(item);
		} else {
			Dynamic_Stack hlp = new Dynamic_Stack();
			while (!ds.isEmpty()) {
				hlp.push(ds.pop());
			}
			ds.push(item);
			while (!hlp.isEmpty()) {
				ds.push(hlp.pop());
			}
		}
	}
	public int Dequeue() throws Exception {
		return ds.pop();
	}
	public int getfront() throws Exception {
		return ds.peek();
	}

	public static void main(String[] args) throws Exception {
		Queue_Using_Stack qs = new Queue_Using_Stack();
		qs.Enqueue(10);
		qs.Enqueue(20);
		qs.Enqueue(30);
		System.out.println(qs.getfront());
	}

}
