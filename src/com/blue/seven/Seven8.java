package com.blue.seven;

import java.util.Scanner;

public class Seven8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		n=scanner.nextInt();
		double sn=Math.sqrt(n);
		
		long start = System.currentTimeMillis();
		int flag=0;
		
		for(int a=0;a<sn;a++){
			for(int b=a;b<sn;b++){
				for(int c=b;c<sn;c++){
					for(int d=c;d<sn;d++){
						if(a*a+b*b+c*c+d*d==n){
							System.out.print(a+" ");
							System.out.print(b+" ");
							System.out.print(c+" ");
							System.out.println(d);
							flag=1;
							break;
						}
					}
					if(flag==1) break;
				}
				if(flag==1) break;
			}
			if(flag==1) break;
		}
		
		long end = System.currentTimeMillis();
		System.out.println((end-start)/1000f + "s");
		

	}

}
