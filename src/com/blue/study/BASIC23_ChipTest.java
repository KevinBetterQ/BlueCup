package com.blue.study;

import java.util.Scanner;

/*
 * 问题描述
　　有n（2≤n≤20）块芯片，有好有坏，已知好芯片比坏芯片多。
　　每个芯片都能用来测试其他芯片。用好芯片测试其他芯片时，能正确给出被测试芯片是好还是坏。而用坏芯片测试其他芯片时，会随机给出好或是坏的测试结果（即此结果与被测试芯片实际的好坏无关）。
　　给出所有芯片的测试结果，问哪些芯片是好芯片。

关键点：好好看题，找关键点
	1、测试结果矩阵中，第 i 列表示第 i 块芯片被其他芯片测试的结果
	2、好芯片比坏芯片多，说明第 i 块芯片如果是好的，那么第 i 列数据中，1 的个数肯定多余 n / 2 ；如果是坏的，就少于 n / 2
*/

public class BASIC23_ChipTest {
	
	public static void main(String[] args)  {
		Scanner scanner  = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] a = new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++)
				a[i][j] = scanner.nextInt();
		}
		int[] cnt = new int[n];
		for(int i=0;i<n;i++){
			for(int j=0; j<n; j++){
				if(a[j][i]==1) cnt[i]++; 
			}
		}
		
		boolean first = true;
		for(int i=0;i<n;i++){
			if(cnt[i]>n/2){
				if(first) {System.out.print(i+1);first=false;}
				else System.out.print(" "+ (i+1));
			}
		}
		
	}


}