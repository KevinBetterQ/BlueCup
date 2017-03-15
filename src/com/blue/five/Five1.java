package com.blue.five;

public class Five1 {

	public static int f(String s) {
		return s.split("\\+|\\-|\\*|\\/").length;
	}

	public static void main(String[] args) {
		System.out.println(f("12+35*5-2*18/9-3")); // 7
		System.out.println(f("354*12+3-14/7*6")); // 6
	}

}
