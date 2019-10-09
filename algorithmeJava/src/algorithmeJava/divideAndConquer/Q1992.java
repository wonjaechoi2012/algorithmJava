package algorithmeJava.divideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1992 {
	static char[][] arr;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		arr = new char[num][num];
		for(int i=0;i<num;i++) {
			String line = br.readLine();
			arr[i]=line.toCharArray();
		}
		
		check(num, 0, 0);
		System.out.println(sb.toString());
	}
	
	public static void check(int size, int coordX, int coordY) {
		int color = arr[coordY][coordX];
		if(size==1)
			if(color=='1')
				sb.append(1);
			else
				sb.append(0);
		else {
			for(int i=coordY;i<size+coordY;i++){
				for(int j=coordX;j<size+coordX;j++) {
					if(color!=arr[i][j]) {
						sb.append('(');
						check(size/2, coordX, coordY);
						check(size/2, coordX+size/2, coordY);
						check(size/2, coordX, coordY+size/2);
						check(size/2, coordX+size/2, coordY+size/2);
						sb.append(')');
						return;
					}
				}
			}
			if(color=='1')
				sb.append(1);
			else
				sb.append(0);
			
		}
	}

}
