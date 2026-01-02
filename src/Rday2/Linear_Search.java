package Rday2;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {4,5,1,3,6};
		int item=6;
		System.out.println(Search(arr, item));

	}
	public static int Search(int[]arr, int item) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==item) {
				return i;
			}
			
		}
		return -1;
		
	}

}
