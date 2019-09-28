package algorithmeJava.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11403DFS {
	static int num;
	static int[][] arr;
	static boolean[][] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine());
		arr = new int[num][num];
		visited = new boolean[num][num];
		
		for(int i=0;i<num;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int j=0;j<num;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0;i<num;i++)
			dfs(i, i);
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++)
				sb.append(visited[i][j]?1:0).append(" ");
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
	
	static void dfs(int start, int next) {
		for(int nnext=0;nnext<num;nnext++)
			if(arr[next][nnext]==1 && !visited[start][nnext]) {
				visited[start][nnext]=true;
				dfs(start, nnext);
			}
	}
}
