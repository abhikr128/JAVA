package stream_misc;

public class FactDemo {
	public static void main(String[] args) {
		int n = 7;
		System.out.println("Factorial of "+n+" is "+ fact(7));
		
	}
	public static int fact(int n) {
		// Using Recursion
		if(n==0 || n==1) return 1;
	
	return n * fact(n-1);
		
		// Using Loop 
//		int res = 1;
//		for(int i=2; i<=n; i++) {
//			res*=i;
//		}
//		return res;
	}
}
