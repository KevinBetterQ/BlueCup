package com.blue.study;


import java.util.Scanner;

/*
 * 问题描述
　　任何一个正整数都可以用2的幂次方表示。例如：
　　137=27+23+20 
　　同时约定方次用括号来表示，即ab 可表示为a（b）。
　　由此可知，137可表示为：
　　2（7）+2（3）+2（0）
　　进一步：7= 22+2+20 （21用2表示）
　　3=2+20 
　　所以最后137可表示为：
　　2（2（2）+2+2（0））+2（2+2（0））+2（0）
　　又如：
　　1315=210 +28 +25 +2+1
　　所以1315最后可表示为：
　　2（2（2+2（0））+2）+2（2（2+2（0）））+2（2（2）+2（0））+2+2（0）
输入格式
　　输入包含一个正整数N（N<=20000），为要求分解的整数。
输出格式
　　程序输出包含一行字符串，为符合约定的n的0，2表示（在表示中不能有空格）
 * 
*/

public class ALGO12_PowerDecomposition {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		//method_net1(n);//测法
		method_net2(n, 14);
		
	}

	private static void method_net1(int n) {

		
		String sum = Integer.toBinaryString(n);
		int a[] = new int[sum.length()];
		int k=0;
		for(int i=0;i<sum.length();i++){
			if(sum.charAt(i)=='1'){
				a[k] = sum.length()-1-i;
				k++;
				
			}
		}
		
		for(int i=0;i<k;i++){
			if(a[i]==0) System.out.print("2(0)");
			else if(a[i]==1) {
				System.out.print("2");
			}
			else if(a[i]==2) {
				System.out.print("2(2)");
			}else {
				System.out.print("2(");
				method_net1(a[i]);
				System.out.print(")");
			}
			if(i!=k-1)
				System.out.print("+");
		}
		
	}

	
	static int[] nums = {1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384};
	
	private static void method_net2(int n, int index) {
		if(index==0){
			System.out.print("0");
			return;
		}
		if(index==1){
			System.out.print("2(0)");
			return;
		}
		
		while(index >= 0){
			if(n-nums[index] >= 0){
				if(index!=1){
					System.out.print("2(");
					method_net2(index, index);
					System.out.print(")");
				}else {
					System.out.print("2");
				}
				
				n-=nums[index];
				if(n!=0){
					System.out.print("+");
					method_net2(n, index);
					return;
				}
			}
			index--;
		}
		
	}
}

