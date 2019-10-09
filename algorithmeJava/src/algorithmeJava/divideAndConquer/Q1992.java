package algorithmeJava.divideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1992 {
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		arr = new int[num][num];
		for(int i=0;i<num;i++) {
			String line = br.readLine();
			for(int j=0;j<num;j++)
				arr[i][j]=Character.getNumericValue(line.charAt(j));
		}
		
		check(num, 0, 0);
	}
	
	public static void check(int size, int coordX, int coordY) {
		int color = arr[coordY][coordX];
		if(size==1)
			if(color==1)
				System.out.print(1);
			else
				System.out.print(0);
		else {
			for(int i=coordY;i<size+coordY;i++){
				for(int j=coordX;j<size+coordX;j++) {
					if(color!=arr[i][j]) {
						System.out.print("(");
						check(size/2, coordX, coordY);
						check(size/2, coordX+size/2, coordY);
						check(size/2, coordX, coordY+size/2);
						check(size/2, coordX+size/2, coordY+size/2);
						System.out.print(")");
						return;
					}
				}
			}
			if(color==1)
				System.out.print(1);
			else
				System.out.print(0);
			
		}
	}

}
