package com.ccf.practice;

import java.util.Scanner;

class W{
	public int id;
	public int x1;
	public int x2;
	public int y1;
	public int y2;
	
}

public class CCF20140302 {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		W[] wd = new W[n+5];
		int[] order = new int[n+5];
		
		for(int i=0;i<n+5;i++){
			wd[i] = new W();
		}
		
		
		for(int i=1;i<=n;i++){
			order[i] = i;
			
			wd[i].x1 = scanner.nextInt();
			wd[i].y1 = scanner.nextInt();
			wd[i].x2 = scanner.nextInt();
			wd[i].y2 = scanner.nextInt();
			
		}
		
		
		for(int i=0;i<m;i++){
			int no = 1;
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			for(int j=n;j>=1;j--){
				int o = order[j];
				if((x>=wd[o].x1)&&(x<=wd[o].x2)&&(y>=wd[o].y1)&&(y<=wd[o].y2)){
					no = 0;
					System.out.println(o);
					
					int ii;
					for(ii=j;ii<n;ii++){
						order[ii] = order[ii+1];
					}
					order[ii] = o;
					break;
				}
			}
			if(no==1){
				System.out.println("IGNORED");
			}
			
			
		}
		
	}

}
