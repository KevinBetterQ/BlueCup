package com.blue.study;

import java.util.Scanner;

public class BASIC10_10to16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		String stb = new String();
		if(a==0) stb = "0";
		while(a!=0){
			int j = a%16;
			switch (j) {
			case 10: stb = "A" + stb; break;
			case 11: stb = "B" + stb; break;
			case 12: stb = "C" + stb; break;
			case 13: stb = "D" + stb; break;
			case 14: stb = "E" + stb; break;
			case 15: stb = "F" + stb; break;
			default: stb = j + stb;
				break;
			}
			
			a = a/16;
		}
		System.out.println(stb);
		
		
	}
}
