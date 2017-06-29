package com.blue.study;



import java.util.Scanner;

/*
 * 问题描述
　　FJ在沙盘上写了这样一些字符串：
　　A1 = “A”
　　A2 = “ABA”
　　A3 = “ABACABA”
　　A4 = “ABACABADABACABA”
　　… …
　　你能找出其中的规律并写所有的数列AN吗？
*/

public class BASIC22_StringRecursion {
	
	public static void main(String[] args)  {
		Scanner scanner  = new Scanner(System.in);
		int n = scanner.nextInt();
		
		System.out.println(f(n));
		
	}

	private static String f(int n) {
		if(n==1) return "A";
		char a =  (char) (n-1 + 'A');
		return f(n-1) + a + f(n-1);
		
	}

}