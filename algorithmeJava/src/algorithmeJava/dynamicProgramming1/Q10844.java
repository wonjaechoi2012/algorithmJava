package algorithmeJava.dynamicProgramming1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10844 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		long[][] arr = new long[num][10];
		for(int i=0;i<10;i++)
			arr[0][i]=1;
		
		for(int i=1;i<num;i++) {
			for(int j=0;j<10;j++) {
				if(j==0)
					arr[i][j]=arr[i-1][j+1]%1000000000;
				else if(j==9)
					arr[i][j]=arr[i-1][j-1]%1000000000;
				else
					arr[i][j]=(arr[i-1][j-1]+arr[i-1][j+1])%1000000000;
			}
		}

//		for(int i=0;i<num;i++) {
//			for(int j=0;j<10;j++)
//				System.out.print(arr[i][j]+" ");
//			System.out.println();
//		}
				
		long sum=0;
		for(int i=1;i<10;i++)
			sum+=arr[num-1][i];
		System.out.println(sum%1000000000);
	}

}
