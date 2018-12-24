package com.blue.study;

import java.util.Scanner;

/*
 * 最大的算式
 * 算法思想：
 *   （本题切入点为如何放置乘号的位置）
     dp[i][j]代表前i个数中有j个乘号的最大值
     sum[i]是前i个数的和
	   状态转移方程:dp[i][0] = sum[i]
     dp[i][j] = max(dp[i][j],dp[k-1][j-1]*(sum[i]-sum[k-1]))
     k为乘号的位置；
         
         关键点：
     1、寻找最优子结构
     2、寻找状态转移表达式
     
         注意点：
               会不会出现int类型存储不了的情况，用long！！！
  
 */
public class ALGO116_MaxFormula {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		
		long[] ans = new long[N+5];
		long[] sum = new long[N+5];//存储前n项的和
		
		for(int i=1;i<=N;i++){
			ans[i] = scanner.nextInt();
			sum[i] = sum[i-1]+ans[i];
		}
		
		//dp初始化状态
		long[][] dp = new long[N+1][K+1];//dp[i][j]代表前i个数中有j个乘号的最大值
		for(int i=1;i<=N;i++){//初始化状态转换初始值
			dp[i][0] = sum[i];
		}
		
		//开始状态转换
		for(int i=2;i<=N;i++){//n个数
			int min = Math.min(i, K);
			for(int j=1;j<=min;j++){//乘号的个数
				for(int k=2;k<=i;k++){
					long tmp = sum[i]-sum[k-1];
					dp[i][j] = Math.max(dp[i][j], dp[k-1][j-1]*tmp);
					
				}
			}
		}
		
		System.out.println(dp[N][K]);
			
		
	}

}


/*
问题描述
题目很简单，给出N个数字，不改变它们的相对位置，在中间加入K个乘号和N-K-1个加号，（括号随便加）使最终结果尽量大。因为乘号和加号一共就是N-1个了，所以恰好每两个相邻数字之间都有一个符号。例如：
N=5，K=2，5个数字分别为1、2、3、4、5，可以加成：
1*2*(3+4+5)=24
1*(2+3)*(4+5)=45
(1*2+3)*(4+5)=45
……
输入格式
输入文件共有二行，第一行为两个有空格隔开的整数，表示N和K，其中（2<=N<=15, 0<=K<=N-1）。第二行为 N个用空格隔开的数字（每个数字在0到9之间）。
输出格式
输出文件仅一行包含一个整数，表示要求的最大的结果
样例输入
5 2
1 2 3 4 5
样例输出
120
样例说明
(1+2+3)*4*5=120
*/