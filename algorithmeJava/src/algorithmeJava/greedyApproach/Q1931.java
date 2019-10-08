package algorithmeJava.greedyApproach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Tuple implements Comparable<Tuple>{
	int start;
	int end;
	public Tuple(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	@Override
	public int compareTo(Tuple o1) {
		if(this.end == o1.end)
			return this.start>o1.start ? 1:-1;
		return this.end>o1.end?1:-1;
	}
	
}

public class Q1931 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Tuple[] times = new Tuple[num];
		for(int i=0; i<num;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			times[i] = new Tuple(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
		}
		Arrays.sort(times);
		int cnt=0;
		int start=0;
		for(int i=0;i<num;i++) {
			if(start<=times[i].start) {
				start=times[i].end; 
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
