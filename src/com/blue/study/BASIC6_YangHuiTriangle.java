package com.blue.study;

import java.util.Scanner;

public class BASIC6_YangHuiTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int[][] a = new int[n+1][n+1];
		a[1][1] = 1;
		if(n==1) System.out.println(1);
		else {
			for(int i=2;i<=n;i++){
				for(int j=1;j<=n;j++){
					a[i][j] = a[i-1][j-1] + a[i-1][j];
				}
			}
			
			for(int i=1;i<=n;i++){
				for(int j=1;j<=i;j++){
					if(j==1)
					System.out.print(a[i][j]);
					else
						System.out.print(" " + a[i][j]);
				}
				System.out.println();
			}
			
		}
		
		
	}

}
