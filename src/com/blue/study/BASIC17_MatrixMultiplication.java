package com.blue.study;

import java.util.Scanner;
/*
 * 蓝桥网试题 java 基础练习 矩阵乘法 
*/
public class BASIC17_MatrixMultiplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		long[][] a = new long[n][n];
		long[][] b = new long[n][n];
		int i,j;
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				a[i][j] = scanner.nextLong();
				b[i][j] = a[i][j];
			}
		}
		
		if(m==0){
			for(i=0;i<n;i++){
				for(j=0;j<n;j++){
					if(i==j) System.out.print(1+" ");
					else System.out.print(0+" ");
				}
				System.out.println();
			}
		}
		else if(m==1) {
			for(i=0;i<n;i++){
				for(j=0;j<n;j++){
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
		else {
			for(int z=1;z<m;z++){
				long[][] tem = new long[n][n];
				for(i=0;i<n;i++){
					for(j=0;j<n;j++){
						long add = 0;
						for(int y=0;y<n;y++){
							add+=a[i][y]*b[y][j];
						}
						tem[i][j] = add;
					}
				}
				a = tem;
			}
			
			for(i=0;i<n;i++){
				for(j=0;j<n;j++){
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			
			
		}
		
	}
	
}