package com.blue.five;

public class Five2 {

	public static void main(String[] args) {

		int counter = 0;
		double sum = 0;

		for (int i = 1;; i++) {
			sum = sum + 1.0 / i;
			if (sum >= 15.0) {
				counter = i;
				break;
			}
			System.out.println(sum);
		}

		System.out.println(counter);
	}
	// 1835421
}
