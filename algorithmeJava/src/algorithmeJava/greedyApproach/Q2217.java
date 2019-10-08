package algorithmeJava.greedyApproach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2217 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		for(int i=0;i<num;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		int max=0;
		for(int i=0;i<num;i++) {
			int w = arr[i]*(num-i);
			if(w>max)
				max=w;
		}
		System.out.println(max);
	}

}
