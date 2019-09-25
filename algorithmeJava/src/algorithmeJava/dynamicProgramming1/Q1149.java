package algorithmeJava.dynamicProgramming1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1149 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int houseNum = Integer.parseInt(br.readLine());
			int[][] houses = new int[houseNum][3];
			int[][] dp = new int[houseNum][3];
			
			for(int i=0;i<houseNum;i++) {
				houses[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(s -> Integer.parseInt(s)).toArray();
			}
			
			dp[0]=houses[0];
			
			for(int i=1;i<houseNum;i++) {
				dp[i][0]=Math.min(dp[i-1][1], dp[i-1][2])+houses[i][0];
				dp[i][1]=Math.min(dp[i-1][0], dp[i-1][2])+houses[i][1];
				dp[i][2]=Math.min(dp[i-1][0], dp[i-1][1])+houses[i][2];
			}
			System.out.println(Math.min(dp[houseNum-1][0], Math.min(dp[houseNum-1][1], dp[houseNum-1][2])));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
