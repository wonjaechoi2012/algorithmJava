package algorithmeJava.dynamicProgramming1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1003 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int count = Integer.parseInt(br.readLine());
			for(int i=0;i<count;i++) {
				int num = Integer.parseInt(br.readLine());
				if(num==0)
					System.out.println("1 0");
				else if(num==1)
					System.out.println("0 1");
				else
					fibo(num);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void fibo(int num) {
		long[] arr = new long[num+1];
		arr[1]=1;
		for(int i=2;i<arr.length;i++)
			arr[i]=arr[i-1]+arr[i-2];
		System.out.println(arr[num-1]+" "+arr[num]);
	}
}
