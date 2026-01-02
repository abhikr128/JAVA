package Rday2;

public class Reverse_array_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {12,8,31,4,7,11,3,6,13,16,19,10,21,23};
		Reverse(arr, 4, 9);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static void Reverse(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
	}

}
