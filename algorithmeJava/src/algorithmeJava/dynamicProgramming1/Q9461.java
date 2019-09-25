package algorithmeJava.dynamicProgramming1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9461 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int count = Integer.parseInt(br.readLine());
			for(int i=0;i<count; i++) {
				int num = Integer.parseInt(br.readLine());
				if(num==1||num==2||num==3)
					System.out.println(1);
				else if(num==4||num==5)
					System.out.println(2);
				else {
					long[] arr = new long[num];
					arr[0]=arr[1]=arr[2]=1;
					arr[3]=arr[4]=2;
					for(int j=5;j<arr.length;j++) {
						arr[j]=arr[j-1]+arr[j-5];
					}
					System.out.println(arr[num-1]);
				}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
