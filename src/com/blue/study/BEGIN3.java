package com.blue.study;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BEGIN3 {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		double s = Math.PI * r * r;
		
		DecimalFormat dFormat = new DecimalFormat(".0000000");
		
		
		System.out.println(dFormat.format(s));
		
		
	}
}
