package Lec_32;

import java.util.*;

public class Binary_Tree {

	 class Node{
		int val;
		Node left;
		Node right;
	}
	
	private Node root;
	Scanner ak = new Scanner(System.in);
	
	public Binary_Tree() {
		
		root=createTree();
	}
	
	private Node createTree() {
		// TODO Auto-generated method stub
		int item=ak.nextInt();
		Node node=new Node();
		node.val=item;
		
		boolean hlc=ak.nextBoolean();
		if (hlc) {
			node.left=createTree();
		}
		boolean hrc=ak.nextBoolean();
		if(hrc) {
			node.right=createTree();
		}
		return node;
	}
	public void Display() {
		Display();
	}
	public void Display(Node node) {
		if(node==null) {
			return;
		}
		String s="";
		s="<--"+node.val+"-->";
		if(node.left!=null) {
			s=node.left.val+s;
		}
		else {
			s="."+s;
		}
		if(node.right!=null) {
			s=s+node.right.val;
		}
		else {
			s=s+".";
		}
		System.out.println(s);
		Display(node.left);
		Display(node.right);
		
	}
	public int max() {
		return max(root);
	}
	private int max(Node nn) {
		if(nn==null) {
			return Integer.MIN_VALUE;
		}
		int lf=max(nn.left);
		int rf=max(nn.right);
		return Math.max(lf, Math.max(nn.val, rf));
	}
	public boolean find( int item) {
		return find(root, item);
	}
	private boolean find(Node nn, int item) {
		
		if(nn.val==item) {
			return true;
		}
		boolean l=find(nn.left, item);
		boolean r=find(nn.right, item);
		return l || r;
	}
	public int ht() {
		return ht(this.root);
	}
	private int ht(Node node) {
		int lh=ht(node.left);
		int rh=ht(node.right);
		return Math.max(lh, rh)+1;
		
	}
	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}
	private void PreOrder(Node node) {
		if(node==null) {
			return;
		}
		System.out.println(node.val+" ");
		PreOrder(node.left);
		PreOrder(node.right);
	}
	public void POStOrder() {
		POStOrder(this.root);
		System.out.println();
	}

	private void POStOrder(Node node) {
		if (node == null) {
			return;
		}
		POStOrder(node.left);
		POStOrder(node.right);
		System.out.print(node.val + " ");
	}
	public void INOrder() {
		INOrder(this.root);
		System.out.println();
	}

	private void INOrder(Node node) {
		if (node == null) {
			return;
		}
		INOrder(node.left);
		System.out.print(node.val + " ");
		INOrder(node.right);
	}
	public void levelorder() {
//		LinkedList<Node> q = new LinkedList<>();
		Queue<Node> q = new LinkedList<>();
		q.add(root);// add last
		while (!q.isEmpty()) {
			Node rv = q.remove();// removefirst
			System.out.print(rv.val+" ");
			if(rv.left!=null) {
				q.add(rv.left);
			}
			if(rv.right!=null) {
				q.add(rv.right);
			}
		}
		System.out.println();

	}

}
