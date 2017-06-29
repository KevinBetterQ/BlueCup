package com.blue.study;



import java.awt.print.Book;
import java.util.Scanner;

/*
 * 问题描述
　　如果一个序列满足下面的性质，我们就将它称为摆动序列：
　　1. 序列中的所有数都是不大于k的正整数；
　　2. 序列中至少有两个数。
　　3. 序列中的数两两不相等；
　　4. 如果第i – 1个数比第i – 2个数大，则第i个数比第i – 2个数小；如果第i – 1个数比第i – 2个数小，则第i个数比第i – 2个数大。
 * 
*/

public class ALGO9_SwingSequence {
	
	static final int maxx = 22;
	static int[] book = new int[maxx];
	static int[] data = new int[maxx];
	static int sum,n;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		sum = 0;
		bfs(0);
		System.out.println(sum);
	}

	private static void bfs(int t) {
		
		if(t>1){
			if(t== 2) sum++;
			else{
				int flag = 1;
				for(int i=t-1;i>=2;i--){
					if((data[i-1]-data[i-2])*(data[i]-data[i-2])>=0){
						flag = 0;
						break;
					}
				}
				if(flag==1){
					sum++;
				}else{
					return;
				}
			}
		}
		
		for(int i=1;i<=n;i++){
			if(book[i] == 0){
				data[t] = i;
				book[i] =1;
				bfs(t+1);
				book[i] = 0;
			}
		}
		
		return ;
		
		
	}
}
