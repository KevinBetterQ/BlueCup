package com.ccf.practice;

import java.util.Scanner;

public class CCF20161201 {

	public static void main(String[] args) {
		int result;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n+5];
		for(int i=1;i<=n;i++){
			a[i] = scanner.nextInt();
		}
		
		for(int i=1;i<=n;i++){
			for(int j =i+1;j<=n;j++){
				if(a[i]>a[j]){
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		
		if(n%2!=0){//单数
			int m = n/2+1;
			result = a[m];
			for(int i=1;i<m;i++){
				if((a[m+i] == a[m])&&(a[m-i] != a[m])) {
					result = -1;break;
				}
				if((a[m-i] == a[m])&&(a[m+i] != a[m])) {
					result = -1;break;
				}
			}
			
		}else{//双数
			int m = n/2;
			if(a[m]!=a[m+1]) result = -1;
			else{
				result =a[m];
				for(int i=1;i<m;i++){
					if((a[m-i]==a[m])&&(a[m+1+i]!=a[m])){
						result = -1;break;
					}
					if((a[m-i]!=a[m])&&(a[m+1+i]==a[m])){
						result = -1;break;
					}
				}
				
			}
		}
		
		System.out.println(result);
		
		
		
		

	}

}
