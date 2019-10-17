package algorithmeJava.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q15663 {

	static int N;
	static int M;
	static boolean[] visited;
	static int[] arr;
	static int[] ans;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		ans = new int[M];
		visited = new boolean[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++)
			arr[i]=Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		
		dfs(0);
		System.out.println(sb);
	}
	
	static void dfs(int cnt) {
		if(cnt==M) {
			for(int i=0;i<cnt;i++)
				sb.append(ans[i]).append(" ");
			sb.append('\n');
		}else {
			boolean[] used = new boolean[arr[N-1]+1];
			for(int i=0;i<N;i++) {
				if(!used[arr[i]] && !visited[i]) {
					visited[i] = true;
					used[arr[i]] = true;
					ans[cnt]=arr[i];
					dfs(cnt+1);
					visited[i]=false;
				}
			}
		}
	}

}
