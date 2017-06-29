package com.blue.study;



import java.util.Scanner;

/*
 * 问题描述
　　给定当前的时间，请用英文的读法将它读出来。
　　时间用时h和分m表示，在英文的读法中，读一个时间的方法是：
　　如果m为0，则将时读出来，然后加上“o'clock”，如3:00读作“three o'clock”。
　　如果m不为0，则将时读出来，然后将分读出来，如5:30读作“five thirty”。
　　时和分的读法使用的是英文数字的读法，其中0~20读作：
　　0:zero, 1: one, 2:two, 3:three, 4:four, 5:five, 6:six, 7:seven, 8:eight, 9:nine, 10:ten, 11:eleven, 12:twelve, 13:thirteen, 14:fourteen, 15:fifteen, 16:sixteen, 17:seventeen, 18:eighteen, 19:nineteen, 20:twenty。
　　30读作thirty，40读作forty，50读作fifty。
　　对于大于20小于60的数字，首先读整十的数，然后再加上个位数。如31首先读30再加1的读法，读作“thirty one”。
　　按上面的规则21:54读作“twenty one fifty four”，9:07读作“nine seven”，0:15读作“zero fifteen”。
*/

public class BASIC26_EnTime {

	
	public static void main(String[] args)  {
		Scanner scanner  = new Scanner(System.in);
		int h = scanner.nextInt();
		int m = scanner.nextInt();
		
		String hour = null;
		String minu = null;
		
		if(m==0){
			System.out.println(changeEn(h) + " o'clock");
		}else {
			if(h<=20) hour = changeEn(h);
			else if(h>20&&h<30) hour = changeEn(20) +" "+ changeEn(h%20);
			else if(h==30) hour = changeEn(30);
			else if(h>30&&h<40) hour = changeEn(30) +" "+ changeEn(h%30);
			else if(h==40) hour = changeEn(40);
			else if(h>40&&h<50) hour = changeEn(40) +" "+ changeEn(h%40);
			else if(h==50) hour = changeEn(50);
			else if(h>50&&h<60) hour = changeEn(50) +" "+ changeEn(h%50);
			
			if(m<=20) minu = changeEn(m);
			else if(m>20&&m<30) minu = changeEn(20) +" "+ changeEn(m%20);
			else if(m==30) minu = changeEn(30);
			else if(m>30&&m<40) minu = changeEn(30) +" "+ changeEn(m%30);
			else if(m==40) minu = changeEn(40);
			else if(m>40&&m<50) minu = changeEn(40) +" "+ changeEn(m%40);
			else if(m==50) minu = changeEn(50);
			else if(m>50&&m<60) minu = changeEn(50) +" "+ changeEn(m%50);
			
			System.out.println(hour+" "+minu);
			
		}
		
		
	}
	
	
	public static String changeEn(int n) {
		
		switch (n) {
		case 0: return "zero";
		case 1: return "one";
		case 2: return "two";
		case 3: return "three";
		case 4: return "four";
		case 5: return "five";
		case 6: return "six";
		case 7: return "seven";
		case 8: return "eight";
		case 9: return "nine";
		case 10: return "ten";
		case 11: return "eleven";
		case 12: return "twelve";
		case 13: return "thirteen";
		case 14: return "fourteen";
		case 15: return "fifteen";
		case 16: return "sixteen";
		case 17: return "seventeen";
		case 18: return "eighteen";
		case 19: return "nineteen";
		case 20: return "twenty";
		case 30: return "thirty";
		case 40: return "forty";
		case 50: return "fifty";
		default:
			break;
		}
		
		return null;
	}
	
	


}