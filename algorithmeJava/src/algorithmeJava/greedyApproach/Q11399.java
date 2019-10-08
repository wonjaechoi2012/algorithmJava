package algorithmeJava.greedyApproach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11399 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<num;i++)
			arr[i]=Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		int sum=arr[0];
		for(int i=1;i<num;i++) {
			arr[i]+=arr[i-1];
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
