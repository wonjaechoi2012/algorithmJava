package algorithmeJava.dynamicProgramming1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1904 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int num = Integer.parseInt(br.readLine());
			if(num==0)
				System.out.println(0);
			else {
				long[] fib = new long[num+1];
				fib[1]=1; fib[2]=2;
				for(int i=3;i<fib.length;i++) { 
					fib[i]=fib[i-1]+fib[i-2];
					fib[i]=fib[i]%15746;
				}
				System.out.println(fib[num]);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
