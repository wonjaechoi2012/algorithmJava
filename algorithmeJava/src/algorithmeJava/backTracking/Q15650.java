package algorithmeJava.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q15650 {

	static boolean[] visit = new boolean[10];
	static List<Integer> ans = new ArrayList<>();
	static int Len;
	static int Cnt;
	static StringBuilder sb = new StringBuilder();
	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Len = Integer.parseInt(st.nextToken());
		Cnt = Integer.parseInt(st.nextToken());
		arr = new int[Cnt];
		dfs(0,0);
		System.out.println(sb);
	}
	
	public static void dfs(int cur, int cnt) {
		if(cnt == Cnt) {
			for(int i=0; i<Cnt; i++)
				sb.append(arr[i]).append(" ");
			sb.append('\n');
		}else {
			for(int i=cur;i<Len;i++) {
				if(!visit[i]) {
					visit[i]=true;
					arr[cnt]=i+1;
					dfs(i, cnt+1);
					visit[i]=false;
				}
			}
		}
	}

}
