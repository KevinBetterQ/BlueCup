package com.blue.test;

import java.util.Scanner;

public class Test{
	
	
	public static void main(String[] args) {
		
		//System.out.println(gcd(12,15));//求最大公约数
		
			/*String s1,s2;
			Scanner sc=new Scanner(System.in);
			System.out.print("请输入第一个字符串：");
			s1=sc.next();
			System.out.print("请输入第二个字符串：");
			s2=sc.nextLine();
			System.out.println("输入的字符串是："+s1+" "+s2);*/
		int i = 999999;
		System.out.println(999999);


		
	}

	private static int gcd(int a,int b) {
		
		if(b==0) return a;
		
		return gcd(b, a%b);
		
	}

	

	
}