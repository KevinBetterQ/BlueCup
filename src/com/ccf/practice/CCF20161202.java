package com.ccf.practice;

import java.util.Scanner;

public class CCF20161202 {

public static void main(String[] args) {
		
		
		int t;
		Scanner scanner = new Scanner(System.in);
		t= scanner.nextInt();
		int S = 0;
		
		if(t<=3500) System.out.println(t);
		else{
			int low = t;
			if(low%100!=0){
				low = t/100*100+100;
			}
			
			
			for(int i = low ; i<=200000 ; i+=100){
				int ju = judge(i);
				if(ju==t) 
				{
					S=i; break;
				}
			}
			
		
			System.out.println(S);
		}

	}
	
	public static  int judge(int s){
		
		int mon=0;
		int a = s-3500;
		if(a <= 1500){
			mon =(int) (a*0.03);
		}else if(a>1500&&a<=4500){
			mon = (int) (1500*0.03 + (a-1500)*0.1);
		}else if(a>4500&&a<=9000){
			mon = (int) (1500*0.03 + 3000*0.1 + (a-4500)*0.2);
		}else if(a>9000&&a<=35000){
			mon = (int) (1500*0.03 + 3000*0.1 + 4500*0.2 + (a-9000)*0.25);

		}else if(a>35000&&a<=55000){
			mon = (int) (1500*0.03 + 3000*0.1 + 4500*0.2 + 26000*0.25 + (a-35000)*0.3);
		}else if(a>55000&&a<=80000){
			mon = (int) (1500*0.03 + 3000*0.1 + 4500*0.2 + 26000*0.25 + 20000*0.3 + (a-55000)*0.35);
		}else{
			mon = (int) (1500*0.03 + 3000*0.1 + 4500*0.2 + 26000*0.25 + 20000*0.3 + 25000*0.35 + (a-80000)*0.45);
		}
		
		return s-mon;
	}

}
