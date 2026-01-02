package Rday2;

public class Max_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {12,8,31,4,7};
		System.out.println(Max(arr));
		
	}
	public static int Max1(int[]arr) {
		int k=arr[0];
		for(int i=1; i<arr.length; i++) {
		//	if(arr[i]>k) {
		//		k=arr[i];
		//	}
			k=Math.max(arr[i], k);
		}
		return k;
	}
	
	      //  OR
	
	public static int Max(int[]arr) {
		int k=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>k) {
				k=arr[i];
			}
		}
		return k;
	}
	
}
