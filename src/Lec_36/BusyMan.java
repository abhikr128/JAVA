package Lec_36;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BusyMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// change krna hoga
		Scanner ak = new Scanner(System.in);
		int t = ak.nextInt();
		while (t > 0) {
			int n = ak.nextInt();
			Pair[] arr = new Pair[n];
			for (int i = 0; i < arr.length; i++) {
				int st = ak.nextInt();
				int et = ak.nextInt();
				arr[i] = new Pair(st, et);

			}
			Arrays.sort(arr, new Comparator<Pair>() {

				@Override
				public int compare(Pair o1, Pair o2) {
					// TODO Auto-generated method stub
					return o1.et - o2.et;
				}
			});
			int activitie = 1;
			int end = arr[0].et;
			for (int i = 1; i < arr.length; i++) {
				if (arr[i].st >= end) {
					activitie++;
					end = arr[i].et;
				}
			}
			System.out.println(activitie);
			t--;
		}

	}

	static class Pair {
		int st;
		int et;

		public Pair(int st, int et) {
			// TODO Auto-generated constructor stub
			this.st = st;
			this.et = et;
		}
	}

}