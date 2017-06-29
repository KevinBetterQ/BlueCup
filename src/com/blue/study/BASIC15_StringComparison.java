package com.blue.study;

import java.util.Scanner;

public class BASIC15_StringComparison {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();
		int flag = -1;
		if(a.length()!=b.length()) flag = 1;
		else if(a.equals(b)) flag = 2;
		else{
			a = a.toLowerCase();
			b = b.toLowerCase();
			if(a.equals(b)) flag = 3;
			else flag = 4;
		}
		
		System.out.println(flag);
		
		
	}
}
