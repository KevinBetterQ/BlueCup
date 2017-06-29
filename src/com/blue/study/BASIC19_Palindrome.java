package com.blue.study;

import java.io.IOException;
import java.util.Scanner;
/*
 * 问题描述
　　回文串，是一种特殊的字符串，它从左往右读和从右往左读是一样的。小龙龙认为回文串才是完美的。现在给你一个串，它不一定是回文的，请你计算最少的交换次数使得该串变成一个完美的回文串。
　　交换的定义是：交换两个相邻的字符
　　例如mamad
　　第一次交换 ad : mamda
　　第二次交换 md : madma
　　第三次交换 ma : madam (回文！完美！)*/

/*
 * 关键点：找到回文符的关键！
 * 从头开始找，匹配，交换，计数
*/

public class BASIC19_Palindrome {
	
	private static int cnt = 0;
	private static boolean haveMiddle = true;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		

		Scanner scanner = new Scanner(System.in);
		int len = scanner.nextInt();
		
		String string = scanner.next();
		
		char[] s = string.toCharArray();
		
		if(palindrome(s, 0, len-1)) {
			System.out.println(cnt);
		}else {
			System.out.println("Impossible");
		}
	}

	//精彩！
	private static boolean palindrome(char[] s, int a, int b) {
		if(b<=a) return true;
		//从最后的位置开始遍历
		for(int i=b; i>a; i--){
			if(s[a]==s[i]){
				exchangeTo(s, i, b);
				cnt += b-i;
				return palindrome(s, a+1, b-1);
			}
		}
		//如果没有出现过中间字符
		if(haveMiddle){
			haveMiddle = false;
			cnt += s.length/2-a;
			return palindrome(s, a+1, b);
		}
		
		return false;
	}
	
	private static void exchangeTo(char[] s, int a, int b) {
		char temp = s[a];
		for(int i=a; i<b; i++){
			s[i] = s[i+1];
		}
		s[b] = temp;
	}
	
	
	
	
	
}