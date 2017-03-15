package com.blue.five;
import java.util.Calendar;

/*
 * 今有7对数字：两个1，两个2，两个3，...两个7，把它们排成一行
 * 74****4*7*******
 * 0123456789
 *           1011121314
 */
public class Five4 {

	static int arr[] = new int[14];
	static int path[] = new int[14];

	public static void main(String[] args) {
		arr[0] = 7;
		arr[1] = 4;
		arr[6] = 4;
		arr[8] = 7;
		int k = 2;
		while (true) {
			/* 首先开始从头开始填写数 */
			arr[k] = arr[k] + 1;
			while (arr[k] <= 6) {
				if (check(k, arr[k]) == 1) {
					path[k] = 1;
					break;
				} else {
					arr[k] = arr[k] + 1;
				}
			}

			/* 如果一个空位找到数填写，则寻找下一个空位来填写 */
			if (arr[k] <= 6 && k < arr.length - 1) {
				k++;
				while (k < arr.length && arr[k] != 0) {
					k++;
				}
				if (k == arr.length) {
					for (int x : arr)
						System.out.print(x + " ");
					return;
				}
			}

			/* 如果一个空位没有找到，倒流找上一次填入数字的路径 */
			else {
				arr[k] = 0;
				k--;
				while (k >= 2 && path[k] == 0) {
					k--;
				}
				path[k] = 0;
				if ((arr[k] + k + 1) < arr.length)// 重新对上一次的进行判断，所以对应的要变为0
					arr[arr[k] + k + 1] = 0;

			}

		}
	}

	/*
	 * 判断是否重复 对应赋值判断，是否符合条件
	 */
	public static int check(int k, int value) {
		for (int i = 0; i < k; i++) {
			if (arr[i] == value) // 从左向右扫描，判断是否有重复
				return 0;
		}
		if (k + value + 1 < arr.length && arr[k + value + 1] == 0)// 判条件，中间有几对
			arr[k + value + 1] = value;
		else
			return 0;
		return 1;

	}

}