package algorithmeJava.dynamicProgramming1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11053 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		int[] list = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<num;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			list[i]=1;
		}
		
		for(int i=1;i<num;i++)
			for(int j=0;j<i;j++)
				if(arr[i]>arr[j] && list[i]<list[j]+1)
					list[i]=list[j]+1;
		int max=0;
		for(int i=0;i<num;i++)
			if(max<list[i])
				max=list[i];
		
		System.out.println(max);
		
	}

}
