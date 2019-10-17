package algorithmeJava.greedyApproach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Q2109 {
	static class Tuple implements Comparable<Tuple>{
		int profit;
		int deadLine;
		
		public Tuple(int profit, int deadLine) {
			super();
			this.profit = profit;
			this.deadLine = deadLine;
		}
		
		@Override
		public int compareTo(Tuple o) {
			return this.profit==o.profit?  0 : this.profit<o.profit?1:-1;
		}

		@Override
		public boolean equals(Object obj) {
			Tuple t = (Tuple)obj;
			return this.deadLine==t.deadLine && this.profit==t.profit;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Tuple[] jobs = new Tuple[n];
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			jobs[i] = new Tuple(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		Arrays.sort(jobs);
		boolean isFeasible;
		int sum=0;
		
		List<Tuple> schedule = new ArrayList<>();
		for(int i=0;i<n;i++) {
			schedule.add(jobs[i]);
			Collections.sort(schedule,(t1,t2)->t1.deadLine>t2.deadLine?1:-1);
			int j=0;
			isFeasible=true;
			for(Tuple t: schedule) {
				if(t.deadLine<=j) {
					isFeasible=false;
					break;
				}
				j++;
			}
			if(!isFeasible) {
				schedule.remove(jobs[i]);
			}
			else
				sum+=jobs[i].profit;
			
		}
		System.out.println(sum);
	}
	
}
