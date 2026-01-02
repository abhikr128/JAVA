package Lec_34;

import java.util.*;

public class Create_Tree_level_order_traversal {
	
	class Node{
		int val;
		Node left;
		Node right;
		
	}
	
	private Node root;
	
	public Create_Tree_level_order_traversal() {
		CreateTree();
	}
	
	Scanner ak=new Scanner(System.in);
	
	private void CreateTree() {
		Queue<Node>q=new LinkedList<>();
		int e=ak.nextInt();
		Node nn=new Node();
		nn.val=e;
		root=nn;
		q.add(nn);
		while(!q.isEmpty()) {
			Node r=q.poll(); //remove
			int c1=ak.nextInt();
			int c2=ak.nextInt();
			if(c1!=-1) {
				Node n=new Node();
				n.val=c1;
				r.left=n;
				q.add(n);
			}
			if(c2!=-1) {
				Node n=new Node();
				n.val=c2;
				r.right=n;
				q.add(n);
			}
		}
	}

}
