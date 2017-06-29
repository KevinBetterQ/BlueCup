package com.blue.study;

import java.util.Scanner;

/*
*/

public class BASIC25_ReturnToForm {
	
	static int[][] a; 
	static int[][] f;

	
	public static void main(String[] args)  {
		Scanner scanner  = new Scanner(System.in);
		
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		 a = new int[m+1][n+1];
		 f = new int[m+1][n+1];
		
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				a[i][j] = scanner.nextInt();
			}
		}
		
		int x1=0;
		int x2=m-1;
		
		int y1=0;
		int y2=n-1;
		
		//经过优化的循环
		while(true){
			s_lie(x2+1,y1);y1++;
			s_heng(x2,y2+1);x2--;
			f_lie(x2+1,y2);y2--;
			f_heng(x1,y2+1);x1++;
			
			if((y1==n)||(y2<0)||(x1<0)||(x1==m)) break;
		}
	}
	
	public static void s_heng(int h,int l) {
		for(int i=0;i<l;i++)
		{
			if(f[h][i]==0){
				System.out.print(" " + a[h][i]);
				f[h][i]=1;
			}
			
		}
	}
	
	public static void s_lie(int h,int l) {
		for(int i=0;i<h;i++)
		{
			if(i==0&&l==0) {
				
				if(f[i][l]==0){
					System.out.print(a[i][l]);
					f[i][l]=1;
				}
			}
			else {
				if(f[i][l]==0){
					System.out.print(" " + a[i][l]);
					f[i][l]=1;
				}
			}
			
		}
	}
	
	public static void f_heng(int h,int l) {
		for(int i=l-1;i>=0;i--)
		{
			
			
			if(f[h][i]==0){
				System.out.print(" " + a[h][i]);
				f[h][i]=1;
			}
		}
	}
	
	public static void f_lie(int h,int l) {
		for(int i=h-1;i>=0;i--)
		{
			
			if(f[i][l]==0){
				System.out.print(" " + a[i][l]);
				f[i][l]=1;
			}
		}
	}


}