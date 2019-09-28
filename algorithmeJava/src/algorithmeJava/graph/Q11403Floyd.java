package algorithmeJava.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11403Floyd {
	public static void main(String[] args) throws IOException {
		//floyd's algorithms
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[][] arr = new int[num][num];
		
		for(int i=0;i<num;i++) {
			String[] str = br.readLine().split(" ");
			for(int j=0;j<num;j++) {
				arr[i][j]=Integer.parseInt(str[j]);
			}
		}
		
		for(int k=0;k<num;k++)
			for(int i=0;i<num;i++)
				for(int j=0;j<num;j++)
					if(arr[i][k]==1&&arr[k][j]==1)
						arr[i][j]=1;
		
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		
	}
	
}
