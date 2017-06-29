package com.blue.test;



/*

 * 
*/

public class permutation {
	public static void main(String[] args) {
		String string = "1234567890";
		String result = "";
		//int[] a = {1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0};
		int[] a = {1,2,3,4,5,6,7,8,9,0};
		//permutation1(string, result, string.length());
		permutation2(a, 0, a.length-1);
		
	}
	
	  /* 全排列 递归实现 
    递归树：
        str:          a            b                c
                    ab ac         ba   bc         ca   cb
      result:        abc acb        bac    bca      cab   cba
       */

	public static void permutation1(String str, String result, int len) {
		if(result.length()==len){
			System.out.println(result);
		}else {
			for(int i=0;i<str.length();i++){
				if(result.indexOf(str.charAt(i))<0){
					permutation1(str, result+str.charAt(i), len);
				}
			}
		}
	}
	
	/*
	  递归另一种写法：或者采用July的方法：
	 从集合中依次选出每一个元素，作为排列的第一个元素，然后对剩余的元素进行全排列，如此递归处理，
	* 从而得到所有元素的全排列。以对字符串abc进行全排列为例，我们可以这么做：以abc为例：
	* 固定a，求后面bc的排列：abc，acb，求好后，a和b交换，得到bac
	* 固定b，求后面ac的排列：bac，bca，求好后，c放到第一位置，得到cba
	* 固定c，求后面ba的排列：cba，cab。*/
	public static void permutation2 (int[] str, int first, int end) {
		
		if(first == end){
			for(int j=0;j<=end;j++){
				System.out.print(str[j]);
			}
			System.out.println();
		}
		
		for(int i=first; i<=end; i++){
			swap(str, i, first);
			permutation2(str, first+1, end);
			swap(str, first, i);
		}
		
	}
	
	private static void swap(int[] str, int a, int b) {
		int tmp;
		tmp = str[a];
		str[a] = str[b];
		str[b] = tmp;
	}
	
	
}










