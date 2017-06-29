package com.blue.study;
import java.util.Scanner;

/*
 * 问题描述
　　给定一个n*n的棋盘，棋盘中有一些位置不能放皇后。现在要向棋盘中放入n个黑皇后和n个白皇后，
使任意的两个黑皇后都不在同一行、同一列或同一条对角线上，任意的两个白皇后都不在同一行、同一列或
同一条对角线上。问总共有多少种放法？n小于等于8。
*/


/*	回溯的框架
 * （以填数为例）
 * 1、元组（就是需要填写几个空）
 * 2、约束集（就是填空的数的限制）
 * 3、计数（表示填了几个空了）
*/

public class BASIC27_2nQueens {
	
	static int sum = 0;
	static int black=2,white=3;
	
	static boolean judge_Queen(int i, int j, int k, int n, int Queen[][]){
		int r,c;
		//从八个方向判断是否可以放皇后
		for(r=0;r<n;r++){	//左右
			if(Queen[r][j]==k){
				return false;
			}
		}
		
		for(c=0;c<n;c++){	//上下
			if(Queen[i][c]==k){
				return false;
			}
		}
		//左上
		for(r=i-1,c=j-1;r>=0&&c>=0;r--,c--){
			if(Queen[r][c]==k) return false;
		}
		//右下
		for(r=i+1,c=j+1;r<n&&c<n;r++,c++){
			if(Queen[r][c]==k) return false;
		}
		//右上
		for(r=i-1,c=j+1;r>=0&&c<n;r--,c++){
			if(Queen[r][c]==k) return false;
		}
		//左下
		for(r=i+1,c=j-1;r<n&&c>=0;r++,c--){
			if(Queen[r][c]==k) return false;
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] a = new int[n+1][n+1];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				 a[i][j] = scanner.nextInt();
			}
		}
		
		dls(0,1,n,a);
		System.out.println(sum);
		
	}

	//矩阵的一行一行的找，每一行都有很多种方法，判断每种方法，都深入分析，不过是否都要回溯。
	//想象出一颗树来
	private static void dls(int i, int t, int n, int[][] a) {
		//先找黑皇后，再找白皇后
		int j;
		if(i>=n){
			if(t==0){	//黑白皇后都找到了
				sum++;
				t=1;
				return;
			}
			t=0;	//只找到黑皇后，继续找白皇后
			i=0;
		}
		
		if(t!=0){	//寻找是否满足黑皇后
			for(j=0;j<n;j++){
				if(judge_Queen(i, j, black, n, a)&&a[i][j]==1){
					a[i][j] = black;
					dls(i+1, t, n, a);
					a[i][j] = 1;
				}
			}
		}else {		//t==0的情况，说明黑皇后已经找到了。开始找白皇后
			for(j=0;j<n;j++){
				if(judge_Queen(i, j, white, n, a)&&a[i][j]==1){
					a[i][j] = white;
					dls(i+1, t, n, a);
					a[i][j] = 1;
				}
			}
		}
		
	}
}
