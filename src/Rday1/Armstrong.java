package Rday1;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner(System.in);
		int n=ak.nextInt();
		System.out.println(Is_Armstrong(n));

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
			count++;
			n=n/10;
	
		}
		return count;
	}

}
