package Lec_28;

import Lec_26.Queue;

public class Dynamic_Queue extends Queue {

	@Override
	public void Enqueue(int item) throws Exception {
		// TODO Auto-generated method stub
		if (isfull()) {
			int[] a = new int[2 * arr.length];
			for (int i = 0; i < size; i++) {
				int idx = (front + i) % arr.length;
				a[i] = arr[idx];

			}
			arr = a;
			front = 0;
		}
		super.Enqueue(item);
	}

	public static void main(String[] args) throws Exception {
		Dynamic_Queue dq = new Dynamic_Queue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(50);
		dq.Enqueue(160);
		dq.Display();
	}
}
