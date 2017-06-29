package com.blue.study;


import java.util.Scanner;

/*所以，他迫切地需要一个系统，然后当他输入12 3456 7009时，会给出相应的念法：
　　十二亿三千四百五十六万七千零九
　　用汉语拼音表示为
　　shi er yi san qian si bai wu shi liu wan qi qian ling jiu
 * 
*/

public class BASIC20_NumberReading {
	static String result = new String();
	
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int len = String.valueOf(n).length();
		
		if(len>=9){
			int yi = n/100000000;
			int wan = (n-yi*100000000)/10000;
			int ge = n%10000;
			System.out.println(lowHandle(yi)+" yi "+wanHandle(wan)+" wan"+wanHandle(ge));
			
		}else if (len<=8&&len>=5) {
			int wan = n/10000;
			int ge = n%10000;
			System.out.println(lowHandle(wan)+" wan"+wanHandle(ge));
		}else {
			System.out.println(lowHandle(n));
		}
	}

	private static String lowHandle(int n) {
		
		
		int a = n/1000;
		int b = n/100%10;
		int c = n/10%10;
		int d = n%10;
		
		if((a==0)&&(b==0)&&(c==0)&&(d==0)) return "ling";
		if((a==0)&&(b==0)&&(c==0)&&(d!=0)) return changeChn(d);
		
		if((a==0)&&(b==0)&&(c==1)&&(d==0)) return "shi";
		if((a==0)&&(b==0)&&(c==1)&&(d!=0)) return "shi "+changeChn(d);
		
		if((a==0)&&(b==0)&&(c!=0)&&(d==0)) return changeChn(c)+" shi";
		if((a==0)&&(b==0)&&(c!=0)&&(d!=0)) return changeChn(c)+" shi "+changeChn(d);
		if((a==0)&&(b!=1)&&(c==0)&&(d==0)) return changeChn(b)+" bai";
		if((a==0)&&(b!=1)&&(c==0)&&(d!=1)) return changeChn(b)+" bai ling "+changeChn(d);
		if((a==0)&&(b!=1)&&(c!=1)&&(d==0)) return changeChn(b)+" bai "+changeChn(c)+" shi";
		if((a==0)&&(b!=1)&&(c!=1)&&(d!=1)) return changeChn(b)+" bai "+changeChn(c)+" shi "+changeChn(d);
		
		if((a!=0)&&(b==0)&&(c==0)&&(d==0)) return changeChn(a)+" qian";
		if((a!=0)&&(b==0)&&(c==0)&&(d!=0)) return changeChn(a)+" qian ling "+changeChn(d);
		if((a!=0)&&(b==0)&&(c!=0)&&(d==0)) return changeChn(a)+" qian ling "+changeChn(c)+" shi";
		if((a!=0)&&(b==0)&&(c!=0)&&(d!=0)) return changeChn(a)+" qian ling "+changeChn(c)+" shi "+changeChn(d);
		if((a!=0)&&(b!=1)&&(c==0)&&(d==0)) return changeChn(a)+" qian "+changeChn(b)+" bai";
		if((a!=0)&&(b!=1)&&(c==0)&&(d!=1)) return changeChn(a)+" qian "+changeChn(b)+" bai ling "+changeChn(d);
		if((a!=0)&&(b!=1)&&(c!=1)&&(d==0)) return changeChn(a)+" qian "+changeChn(b)+" bai "+changeChn(c)+" shi";
		if((a!=0)&&(b!=1)&&(c!=1)&&(d!=1)) return changeChn(a)+" qian "+changeChn(b)+" bai "+changeChn(c)+" shi "+changeChn(d);

		
		return "";
		
	}

	private static String wanHandle(int n) {

		int a = n/1000;
		int b = n/100%10;
		int c = n/10%10;
		int d = n%10;
		
		if((a==0)&&(b==0)&&(c==0)&&(d==0)) return "";
		if((a==0)&&(b==0)&&(c==0)&&(d!=0)) return " ling " + changeChn(d);
		
		if((a==0)&&(b==0)&&(c!=0)&&(d==0)) return " ling " + changeChn(c)+" shi";
		if((a==0)&&(b==0)&&(c!=0)&&(d!=0)) return " ling " + changeChn(c)+" shi "+changeChn(d);
		if((a==0)&&(b!=1)&&(c==0)&&(d==0)) return " ling " + changeChn(b)+" bai";
		if((a==0)&&(b!=1)&&(c==0)&&(d!=1)) return " ling " + changeChn(b)+" bai ling "+changeChn(d);
		if((a==0)&&(b!=1)&&(c!=1)&&(d==0)) return " ling " + changeChn(b)+" bai "+changeChn(c)+" shi";
		if((a==0)&&(b!=1)&&(c!=1)&&(d!=1)) return " ling " + changeChn(b)+" bai "+changeChn(c)+" shi "+changeChn(d);
		
		if((a!=0)&&(b==0)&&(c==0)&&(d==0)) return " "+changeChn(a)+" qian";
		if((a!=0)&&(b==0)&&(c==0)&&(d!=0)) return " "+changeChn(a)+" qian ling "+changeChn(d);
		if((a!=0)&&(b==0)&&(c!=0)&&(d==0)) return " "+changeChn(a)+" qian ling "+changeChn(c)+" shi";
		if((a!=0)&&(b==0)&&(c!=0)&&(d!=0)) return " "+changeChn(a)+" qian ling "+changeChn(c)+" shi "+changeChn(d);
		if((a!=0)&&(b!=1)&&(c==0)&&(d==0)) return " "+changeChn(a)+" qian "+changeChn(b)+" bai";
		if((a!=0)&&(b!=1)&&(c==0)&&(d!=1)) return " "+changeChn(a)+" qian "+changeChn(b)+" bai ling "+changeChn(d);
		if((a!=0)&&(b!=1)&&(c!=1)&&(d==0)) return " "+changeChn(a)+" qian "+changeChn(b)+" bai "+changeChn(c)+" shi";
		if((a!=0)&&(b!=1)&&(c!=1)&&(d!=1)) return " "+changeChn(a)+" qian "+changeChn(b)+" bai "+changeChn(c)+" shi "+changeChn(d);

		
		return "";
		
	}

	
	
	private static String changeChn(int i) {
		switch (i) {
		case 1: return "yi";
		case 2: return "er";
		case 3: return "san";
		case 4: return "si";
		case 5: return "wu";
		case 6: return "liu";
		case 7: return "qi";
		case 8: return "ba";
		case 9: return "jiu";
		case 0: return "ling";
		
		default:
			break;
		}
		return null;
	}
	
	
}