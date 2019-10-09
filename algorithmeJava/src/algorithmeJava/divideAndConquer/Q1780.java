package algorithmeJava.divideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1780 {
	static int zero=0;
	static int one=0;
	static int minusOne=0;
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
		System.out.println(minusOne);
		System.out.println(zero);
		System.out.println(one);
	}

	public static void check(int size, int coordX, int coordY) {
		int color = arr[coordY][coordX];
		if(size==1)
			if(color==0)
				zero++;
			else if(color==1)
				one++;
			else
				minusOne++;
		else {
			for(int i=coordY;i<size+coordY;i++){
				for(int j=coordX;j<size+coordX;j++) {
					if(color!=arr[i][j]) {
						check(size/3, coordX, coordY);
						check(size/3, coordX, coordY+size/3);
						check(size/3, coordX, coordY+size*2/3);
						
						check(size/3, coordX+size/3, coordY);
						check(size/3, coordX+size/3, coordY+size/3);
						check(size/3, coordX+size/3, coordY+size*2/3);
						
						check(size/3, coordX+size*2/3, coordY);
						check(size/3, coordX+size*2/3, coordY+size/3);
						check(size/3, coordX+size*2/3, coordY+size*2/3);
						return;
					}
				}
			}
			if(color==0)
				zero++;
			else if(color==1)
				one++;
			else
				minusOne++;
			
		}
	}
}
