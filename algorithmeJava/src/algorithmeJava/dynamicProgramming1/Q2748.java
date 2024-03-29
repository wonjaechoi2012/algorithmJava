package algorithmeJava.dynamicProgramming1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2748 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int num = Integer.parseInt(br.readLine());
			long[] arr = new long[num+1];
			arr[1]=1;
			for(int i=2;i<arr.length;i++) {
				arr[i]=arr[i-1]+arr[i-2];
			}
			System.out.println(arr[num]);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
