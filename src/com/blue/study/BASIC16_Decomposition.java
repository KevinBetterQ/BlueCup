package com.blue.study;
/*
 * 问题描述
　　求出区间[a,b]中所有整数的质因数分解。
*/
import java.util.Scanner;

public class BASIC16_Decomposition {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		for(int i=a;i<=b;i++){
			Decompose(i);
		}
		
	}
	
	//分解质因数！！
	public static void Decompose(int n){
        System.out.print(n+"=");
        for(int i=2;i<=n;i++){
            while(n%i==0 && n!=i){
                n=n/i;
                System.out.print(i+"*");
            }
            if(n==i){
                System.out.println(i);
                break;
            }

        }
    }

}
