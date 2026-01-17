package stream_misc;

public class FiboDemo {
	public static void main(String[] args) {
		int n = 8;
		System.out.println("Fibonacci of "+n+" is "+ fibo(8));
	}
//	public static int fibo(int n) {
//		// Using Recursion
//		if(n==0) return 0;
//		if(n==1) return 1;
//	    return fibo(n-2)+fibo(n-1);	  
	
	// Using Loop
	public static int fibo(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		
		int a=0, b=1, c=0;
		for(int i=2; i<=n; i++) {
			c=a+b;
			a=b;
			b=c;
			
		}
		return c;
	    
	}

}
