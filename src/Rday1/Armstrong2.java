package Rday1;

import java.util.Scanner;

public class Armstrong2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner(System.in);
		int N1=ak.nextInt();
		int N2=ak.nextInt();
		PrintArmstrong(N1, N2);
		
	}
	public static void PrintArmstrong(int N1, int N2) {
		System.out.println("Armstrong numbers between " + N1 + " and " + N2 + " are:");
		for(int n=N1; n<=N2; n++) {
			if(Is_Armstrong(n)) {
				System.out.println(n);
			}
		}
	}
	public static boolean Is_Armstrong(int n) {
		int c=CountDigits(n);
		int sum=0;
		int p=n;
		while(n>0) {
			int rem=n%10;
			sum=(int)(sum+Math.pow(rem, c));
			n=n/10;
		}
		if(sum==p) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static int CountDigits(int n) {
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;
	}

}
