package Lec_41;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Prims_Algorithm {
	
	public int Prims(HashMap<Integer, HashMap<Integer, Integer>> map) {
		PriorityQueue<PrimsPair> pq= new PriorityQueue<>();
		HashSet<Integer>visited=new HashSet<>();
		int sum=0;
		pq.add(new PrimsPair(1,1,0));
		while(!pq.isEmpty()) {
			PrimsPair rp=pq.poll();
			if(visited.contains(rp.vtx)) {
				continue;
			}
			visited.add(rp.vtx);
			System.out.println(rp);
			sum+=rp.cost;
			for(int nbrs: map.get(rp.vtx).keySet()) {
				if(!visited.contains(nbrs)) {
					int cost=map.get(rp.vtx).get(nbrs);
					pq.add(new PrimsPair(nbrs, rp.vtx, cost));
				}
			}
		}
		return sum;
		
	}
	class PrimsPair{
		int vtx;
		int acqvtx;
		int cost;
		public PrimsPair(int vtx, int acq, int cost) {
			this.vtx=vtx;
			this.acqvtx=acq;
			this.cost=cost;
		}
	}
	
	public static void main(String[] args) {
		Scanner ak= new Scanner(System.in);
		int n=ak.nextInt();
		int m=ak.nextInt();
		HashMap<Integer, HashMap<Integer, Integer>>map=new HashMap<>();
		for(int i=1; i<=n; i++) {
			map.put(i, new HashMap<>());
		}
		for(int i=0; i<m; i++) {
			int v1=ak.nextInt();
			int v2=ak.nextInt();
			int cost=ak.nextInt();
			map.get(v1).put(v2,  cost);
			map.get(v2).put(v1,  cost);
			
		}
		Prims_Algorithm p = new Prims_Algorithm();
		System.out.println(p.Prims(map));
	}

}
