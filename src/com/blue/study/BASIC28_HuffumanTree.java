package com.blue.study;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
*/

public class BASIC28_HuffumanTree {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> a = new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			int x = scanner.nextInt();
			a.add(x);
		}
		int cost=0;
		while(a.size()!=1){
			Collections.sort(a);
			int temp = a.get(0)+a.get(1);
			cost+=temp;
			a.remove(0);
			a.remove(0);
			a.add(temp);
			//System.out.println(cost);
		}
		System.out.println(cost);
		
		
	}
}
