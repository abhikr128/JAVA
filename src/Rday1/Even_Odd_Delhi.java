package Rday1;

import java.util.Scanner;

public class Even_Odd_Delhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner(System.in);
		int t=ak.nextInt(); //testcases
		while(t>0) {
		
		  int n=ak.nextInt();
		  if(Even_Or_Odd(n)==true) {
			  System.out.println("Yes");
		  }
		  else {
			  System.out.println("No");
		  }
		  t--;
		}
	}
	public static boolean Even_Or_Odd(int n) {
		int SumOdd=0;
		int SumEven=0;
		while(n>0) {
			int rem=n%10;
			if(rem%2==0) {
				SumEven+=rem;
			}
			else {
				SumOdd+=rem;
			}
			n=n/10;
		}
		if(SumEven%4==0 || SumOdd%3==0) {
			return true;
		}
		else {
			return false;
		}
	}

}
