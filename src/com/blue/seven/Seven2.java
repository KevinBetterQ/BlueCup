package com.blue.seven;

public class Seven2 {

	public static void main(String[] args) {
		/*int x,y;
		for(x=1;x<100;x++){
			for(y=x+1;y<100;y++){
				if((y-x+1)*(x+y)==472){
					System.out.println(x);
					System.out.println(y);
					
				}
			}
		}*/
		
		long start = System.currentTimeMillis();
		for(int i = 1; i <= 100; ++i){
			int sum = 0;
			for(int j = i; j <= 100; ++j){
				sum += j;
				if(sum == 236)
					System.out.println(i);
			}
		}
		long end = System.currentTimeMillis();
		System.out.println((end - start)/1000f + "秒");

		

	}

	//26
	//运用函数
}
