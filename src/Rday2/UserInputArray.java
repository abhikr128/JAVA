package Rday2;

import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner(System.in);
		int n=ak.nextInt();
		int []arr=new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i]=ak.nextInt();
		}
		Display(arr);

	}
	public static void Display(int[]arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
