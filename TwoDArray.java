package com.cts.day4;

public class TwoDArray {
	
	static void alternate(int[][] mat,int n) {
		
		
		for(int i = 0;i < n;i++) {
			if(i%2==0) {
				for(int j =0;j<n;j+=2) {
					System.out.println(mat[i][j]);
				}
			}
			else {
				for(int j =1;j<n;j+=2) {
					System.out.println(mat[i][j]);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		int [][]mat = {{1,2,3},
						{4,5,6},
						{7,8,9}};
		int n = 3;
		alternate(mat,n);

	}

}
