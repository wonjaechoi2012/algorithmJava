package algorithmeJava.divideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2630 {
	static int w=0;
	static int b=0;
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		arr = new int[num][num];
		for(int i=0;i<num;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<num;j++)
				arr[i][j]=Integer.parseInt(st.nextToken());
		}
		check(num, 0, 0);
		System.out.println(w+" "+b);
	}
	
	public static void check(int size, int coordX, int coordY) {
		int color = arr[coordY][coordX];
		if(size==1)
			if(color==1)
				b++;
			else
				w++;
		else {
			for(int i=coordY;i<size+coordY;i++){
				for(int j=coordX;j<size+coordX;j++) {
					if(color!=arr[i][j]) {
						check(size/2, coordX, coordY);
						check(size/2, coordX, coordY+size/2);
						check(size/2, coordX+size/2, coordY);
						check(size/2, coordX+size/2, coordY+size/2);
						return;
					}
				}
			}
			if(color==1)
				b++;
			else
				w++;
			
		}
	}

}
