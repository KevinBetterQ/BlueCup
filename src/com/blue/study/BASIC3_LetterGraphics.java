package com.blue.study;


import java.util.Scanner;
/*问题描述
利用字母可以组成一些美丽的图形，下面给出了一个例子：
ABCDEFG
BABCDEF
CBABCDE
DCBABCD
EDCBABC
这是一个5行7列的图形，请找出这个图形的规律，并输出一个n行m列的图形。*/
public class BASIC3_LetterGraphics {

	public static void main(String[] args) {
		//I_error();
		net();
		net2();//最好的方法
 		
	}

	private static void net2() {
		
				Scanner input=new Scanner(System.in);
				int n=input.nextInt();
				int m=input.nextInt();
				for(int i=1;i<=n;i++){
					for(int j=1;j<=m;j++){
						char s=(char)(Math.abs(i-j)+'A');
						System.out.print(s);
					}
					System.out.println();
				}		
	
		
	}

	private static void net() {
		
		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();
		        int m = sc.nextInt();
		        char[] ch = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
		                'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		        String st = "";
		        for(int i=0;i<m;i++)
		            st += ch[i];
		        for(int i=0;i<n;i++){
		            String st1,st2;
		            if(i!=0){
		                st1 = st.substring(0, st.length()-1);
		                st2 = ch[i]+"";
		                st = st2+st1;
		            }
		            System.out.println(st);
		        }
		 
		
	}

	private static void I_error() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		String[] nm = new String[n+1];
 		for(int i=1;i<=n;i++){
			for(int j=i-1;j>0;j--){
				if(nm[i] == null)
					nm[i] = (char)('A'+j) + "";
				else
					nm[i] = nm[i] + (char)('A'+j);
			}
			if(nm[i] == null)
				nm[i] = 'A' + "";
			else
				nm[i] = nm[i] + 'A';
			
			for(int j=1;j<=m-i;j++){
				nm[i] = nm[i] + (char)('A'+j);
			}
		}
 		
 		for(int i=1;i<=n;i++){
 			System.out.println(nm[i]);
 		}
		
	}

}
