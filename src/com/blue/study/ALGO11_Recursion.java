package com.blue.study;

import java.util.Scanner;


/*
 *问题描述
　　有一长度为N(1<=Ｎ<=10)的地板，给定两种不同瓷砖：一种长度为1，另一种长度为2，数目不限。要将这个长度为N的地板铺满，一共有多少种不同的铺法？
　　例如，长度为4的地面一共有如下5种铺法：
　　4=1+1+1+1
　　4=2+1+1
　　4=1+2+1
　　4=1+1+2
　　4=2+2
　　编程用递归的方法求解上述问题。
 * 
*/

public class ALGO11_Recursion {
	static int n;
	static int sum=0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		f(n);
		System.out.println(sum);
	}
	private static void f(int t) {
		if(t==0) {
			sum++;
		}
		else{
			f(t-1);
			if(t>=2)
			f(t-2);
		}
		
		
	}
}
