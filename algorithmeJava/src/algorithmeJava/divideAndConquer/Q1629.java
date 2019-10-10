package algorithmeJava.divideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1629 {
	static long[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new long[3];
		arr[0] = Integer.parseInt(st.nextToken());
		arr[1] = Integer.parseInt(st.nextToken());
		arr[2] = Integer.parseInt(st.nextToken());
		
		System.out.println(power(arr[1])%arr[2]);
		
	}
	
	static long power(long n) {
		if(n==1)
			return arr[0];
		else {
			long half = power(n/2);
			long temp = half*half % arr[2];
			if(n%2==0)
				return temp;
			else
				return temp*arr[0] % arr[2];
		}
	}
}