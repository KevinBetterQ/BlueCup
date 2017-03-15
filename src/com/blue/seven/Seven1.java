package com.blue.seven;
/*煤球数目
*/
public class Seven1 {

	public static void main(String[] args) {
		int a,sum=0;
		for(int i=1;i<=100;i++){
			a=(1+i)*i/2;
			sum+=a;
		}
		System.out.println(sum);
	}
	//171700

	//找规律，较为简单
}
