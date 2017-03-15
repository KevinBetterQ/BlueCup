package com.blue.study;

import java.util.Scanner;

public class BEGIN2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();

		long sum = (1 + n) * n / 2;
		System.out.println(sum);

	}
}
