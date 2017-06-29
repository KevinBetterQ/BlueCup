package com.blue.simulation;


public class Solution2 {
	
	
	static int[] a = new int[6];
	
	public static int f(int[] y) {
		 int[] cout = new int[12];
		for(int j=0;j<6;j++){
			int k=0;
			int x = y[j];
			while(x>0){
				int i = x%10;
				cout[i]++;
				//System.out.println(i);
				if(cout[i]>2) return 0;
				x = x/10;
				k++;
			}
			if(k<3) return 0;
			
		}
		
		return 1;
	}
	
	
	public static void main(String[] args)
	{
		for(int i=100;i<999;i++){
			for(int j=100;j<999;j++){
				a[0] = i;
				a[1] = j;
				a[2] = j%10*i;
				a[3] = j/10%10*i;
				a[4] = j/100*i;
				a[5] = i*j;
				if(f(a)==1){
					System.out.println(i + "*" +j + "=" + i*j);
					System.out.println(a[2]);
					System.out.println(a[3]);
					System.out.println(a[4]);
				}
			}
		}
	}
	
	
}
