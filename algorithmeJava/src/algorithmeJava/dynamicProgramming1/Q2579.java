package algorithmeJava.dynamicProgramming1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2579 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		int[] dp = new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		dp[0]=arr[0];
		dp[1]=arr[1]+dp[0];
		dp[2]=Math.max(arr[0]+arr[2], arr[1]+arr[2]);
		for(int i=3;i<num;i++){
			dp[i] = Math.max(arr[i]+arr[i-1]+dp[i-3], arr[i]+dp[i-2]);
		}
		System.out.println(dp[num-1]);
	}

}
