package com.blue.simulation;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution3 {
	
	static int ii=-1;
	
	public static void main(String[] args) {
		String aString = "abcdefghijklmnopq";
		String result = "";
		p(aString, result, aString.length());
	}
	
	public static void p(String str,String result,int len) {
		
		if(result.length()==len){
			ii++;
			System.out.println(result + "   "+ii);
		}
		
		for(int i=0;i<str.length();i++){
			if(result.indexOf(str.charAt(i))<0){
				p(str, result+str.charAt(i), len);
			}
		}
	}
	
	
}
