package com.blue.study;

import java.util.Scanner;

public class BEGIN4 {

	static int n;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 1;
		int a = 1;
		int b = 1;
		for(int i = 3; i <= n; i++){
			sum = (a+b)%10007;
			a = b%10007;
			b = sum%10007;
		}
		System.out.println(sum);

	}
	
	

}
