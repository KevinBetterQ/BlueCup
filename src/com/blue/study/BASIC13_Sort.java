package com.blue.study;

import java.util.Scanner;

public class BASIC13_Sort {
	public static void main(String[] args) {
		//xuanzesort();
		maopaosort();
	}

	private static void maopaosort() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n + 5];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(a[j] > a[j+1]){
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		
		
		
		for (int i = 0; i < n - 1; i++)
			System.out.print(a[i] + " ");
		System.out.println(a[n - 1]);
		
	}

	public static void xuanzesort() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n + 5];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}

		for (int i = 0; i < n - 1; i++)
			System.out.print(a[i] + " ");
		System.out.println(a[n - 1]);
	}

}
