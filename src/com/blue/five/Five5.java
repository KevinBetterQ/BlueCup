package com.blue.five;
import java.util.Scanner;

public class Five5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int count = 0;
		int a;
		int b;

		// 不需要导入包
		// 在你的方法第一行加上:
		long start = System.currentTimeMillis();

		for (a = 1; a < x; a++) {
			b = (int) Math.sqrt(x * x - a * a);
			if (a * a + b * b == x * x) {
				count++;
			}
		}
		System.out.println(count / 2);
		// 在最好的一行加上:

		long end = System.currentTimeMillis();
		System.out.println("执行耗时 : " + (end - start) / 1000f + " 秒 ");

	}

}
