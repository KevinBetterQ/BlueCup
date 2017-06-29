package com.blue.study;



import java.math.BigDecimal;
import java.util.Scanner;

/*
*/

public class BASIC29_HighPrecision {
	
	public static void main(String[] args) {
		//myself();
		//netGood();
		net();
	}

	private static void net() {
		Scanner cin = new Scanner(System.in);
		int[] a = new int[101];
		int[] b = new int[101];
		int[] result = new int[101];
		for (int i = 0; i < 101; i++) {
			a[i] = b[i] = result[i] = 0;
		}
		String line1 = cin.nextLine();
		String line2 = cin.nextLine();

		for (int i = 0; i < line1.length(); i++)
			a[i] = (int) line1.charAt(line1.length() - 1 - i) - 48;
		for (int i = 0; i < line2.length(); i++)
			b[i] = (int) line2.charAt(line2.length() - 1 - i) - 48;

		int max = line1.length() > line2.length() ? line1.length() : line2.length();

		int jinwei = 0;
		int r = 0;
		for (int i = 0; i < 101; i++) {
			result[i] = a[i] + b[i] + r;
			r = result[i] / 10;
			result[i] %= 10;
		}
		int flag = 100;
		for (int i = 100; i > -1; i--) {
			if (result[i] != 0) {
				flag = i;
				break;
			}
		}
		for (int i = flag; i > -1; i--) {
			System.out.print(result[i]);
		}
		System.out.println();

	}

	private static void netGood() {
		BigDecimal aBigDecimal ;
		BigDecimal bigDecimal;
		BigDecimal cBigDecimal;
		Scanner scanner = new Scanner(System.in);
		aBigDecimal = scanner.nextBigDecimal();
		bigDecimal = scanner.nextBigDecimal();
		cBigDecimal = aBigDecimal.add(bigDecimal);
		System.out.println(cBigDecimal);
		
	}

	private static void myself() {
		Scanner scanner = new Scanner(System.in);
		String aString = scanner.next();
		String bString = scanner.next();
		
		char[] a = aString.toCharArray();
		char[] b = bString.toCharArray();
		
	
		
		
		int na = a.length;
		int nb = b.length;
		int n = na>nb?na:nb;
		
		
		char[] x = new char[n+1];
		
		int i,j;
		int c=0;
		int[] v=new int[n+1];
		
		for(i=na-1,j=nb-1;i>=0&&j>=0;i--,j--){
			
			int ia = a[i]-48;
			int ib = b[j]-48;
			
			
			if(c!=0){
				x[c]=(char) (((ia+ib+v[c-1])%10)+'0');
				v[c] = (ia+ib+v[c-1])/10;
			}else{
				x[c]=(char) (((ia+ib)%10)+'0');
				v[c] = (ia+ib)/10;
			}
			
			c++;
		}
		
		if(i==-1){
			for(;j>=0;j--){
				int temp = b[j]-48;
				int t2 = (temp+v[c-1])%10;
				v[c] = (temp+v[c-1])/10;
				x[c] = (char) (t2+'0');
				c++;
				//System.out.println(b[j]);
			}
		}
		
		if(j==-1){
			for(;i>=0;i--){
				int temp = a[i]-48;
				int t2 = (temp + v[c-1])%10;
				v[c] = (temp+v[c-1])/10;
				x[c] = (char) (t2+48);
				c++;
				//System.out.println(a[i]);
			}
		}
		
		if(na==nb){
			int ia = a[0]-48;
			int ib = b[0]-48;
			int t = (ia + ib + v[c-1])/10;
			//System.out.println(t);
			if(t!=0)
				x[n] = (char) (t+'0');
		}
		
		if(x[n]==0){
			for(int p=n-1;p>=0;p--){
				System.out.print(x[p]);
			}
		}else {
			for(int p=n;p>=0;p--){
				System.out.print(x[p]);
			}
		}
		
	}
}
