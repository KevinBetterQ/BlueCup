package com.blue.test;

import java.util.Scanner;

public class Test{
	
	
	public static class Main {
	    public static void main(String[] args) {
	        Scanner sn = new Scanner(System.in);
	        double m = sn.nextDouble()/100/12;
	        int month = sn.nextInt();
	        int money = 10000*100;//用分来表示
	        int min = money/month;
	        int ans = 0x7fffffff,last = 0x7fffffff;//分别表示结果和绝对值最小的那个值
	        for(int i = min;;i++){
	            int moneys = money;
	            for(int j = 1;j<=month;j++){//从最小还款可能枚举
	                moneys = get(moneys*(1+m)-i);
	            }
	            if(Math.abs(last)>Math.abs(moneys)){
	                last = moneys;
	                ans = i;
	            }else break;//如果绝对值反超，直接break
	        }
	        System.out.println(ans);
	        sn.close();
	    }

	    private static int get(double money) {

	        return (int)(money+0.5);//因为已经表示为分，所以加上小数点后一位就能判断是否需要进位。
	    }
	}

	private static int gcd(int a,int b) {
		
		if(b==0) return a;
		
		return gcd(b, a%b);
		
	}

	

	
}