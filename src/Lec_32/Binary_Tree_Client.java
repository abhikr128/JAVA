package Lec_32;

public class Binary_Tree_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_Tree bt=new Binary_Tree();
		bt.Display();
		System.out.println(bt.max());
		System.out.println(bt.find(60));
		System.out.println(bt.ht());
		bt.PreOrder();
		bt.POStOrder();
		bt.INOrder();
		bt.levelorder();
	}

}
