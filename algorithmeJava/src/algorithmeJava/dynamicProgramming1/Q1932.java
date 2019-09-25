package algorithmeJava.dynamicProgramming1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1932 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int num = Integer.parseInt(br.readLine());
			int[][] triangle = new int[num][num];
			int[][] dp = new int[num][num];
			for(int i=0;i<num;i++) {
				String[] arr = br.readLine().split(" ");
				for(int j=0;j<arr.length;j++)
					triangle[i][j]=Integer.parseInt(arr[j]);
			}

			dp[0][0]=triangle[0][0];
			for(int i=1;i<num;i++) {
				for(int j=0;j<=i;j++) {
					if(i==j)
						dp[i][j]=dp[i-1][j-1];
					else if(j==0)
						dp[i][j]=dp[i-1][j];
					else
						dp[i][j]=Math.max(dp[i-1][j-1], dp[i-1][j]);
					dp[i][j]+=triangle[i][j];
				}
			}

			int max=triangle[num-1][0];
			for(int i=0;i<num;i++)
				if(max<dp[num-1][i])
					max=dp[num-1][i];
			System.out.println(max);
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}
