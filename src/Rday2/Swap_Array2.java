package Rday2;

public class Swap_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {3,5,1,8,2};
		int[]other= {12,8,31,4,7};
		System.out.println(arr[0]+" "+other[0]);
		Swap(arr, other);
		System.out.println(arr[0]+" "+other[0]);

	}

	public static void Swap(int[] arr, int[] other) {
		// TODO Auto-generated method stub
		int[] temp=arr;
		arr=other;
		other=temp;
		
	}

}
