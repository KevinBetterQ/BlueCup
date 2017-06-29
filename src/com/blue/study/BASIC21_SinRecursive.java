package com.blue.study;

import java.util.Scanner;

/*
 * 　最近FJ为他的奶牛们开设了数学分析课，FJ知道若要学好这门课，必须有一个好的三角函数基本功。所以他准备和奶牛们做一个“Sine之舞”的游戏，寓教于乐，提高奶牛们的计算能力。
　　不妨设
　　An=sin(1–sin(2+sin(3–sin(4+...sin(n))...)
　　Sn=(...(A1+n)A2+n-1)A3+...+2)An+1
　　FJ想让奶牛们计算Sn的值，请你帮助FJ打印出Sn的完整表达式，以方便奶牛们做题。
*/

public class BASIC21_SinRecursive {
	static int n;
	
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		int i=1;
		System.out.println(funtion_sn(n,i));
		
	}

	private static String funtion_sn(int nn,int i) {

		if(i==n) return funtion_An(1, 1)+ "+" + i;
		
		
		return "("+ funtion_sn(nn-1, i+1) + ")" + funtion_An(nn, 1) + "+" + i;  
		
		
		
	}
	
	private static String funtion_An(int nn, int i) {
		char s;
		if(i%2==0) s = '+';
		else s='-';
		
		if(nn==1) return "sin(1)";
		if(nn==2) return "sin(1-sin(2))";
		
		if(i==nn-1) return "sin" + "(" + i + s + "sin" + "(" + nn + ")";
		
		return "sin" + "(" +    i + s  + funtion_An(nn, i+1) + ")";
		
	}	
	
}
