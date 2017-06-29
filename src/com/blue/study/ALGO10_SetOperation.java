package com.blue.study;



import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * 第一行按从小到大的顺序输出A、B交集中的所有元素。
　　第二行按从小到大的顺序输出A、B并集中的所有元素。
　　第三行按从小到大的顺序输出B在A中的余集中的所有元素。
 * 
*/

public class ALGO10_SetOperation {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<Integer> aIntegers = new HashSet<Integer>();
		Set<Integer> bIntegers = new HashSet<Integer>();
		int n = scanner.nextInt();		
		for(int i=0;i<n;i++){
			int t = scanner.nextInt();
			aIntegers.add(t);
		}
		int m = scanner.nextInt();		
		for(int i=0;i<m;i++){
			int t = scanner.nextInt();
			bIntegers.add(t);
		}
		
		Set<Integer> jResult = new TreeSet<Integer>();
		jResult.addAll(aIntegers);
		jResult.retainAll(bIntegers);
		
		
		Set<Integer> bResult = new TreeSet<Integer>();
		bResult.addAll(aIntegers);
		bResult.addAll(bIntegers);
		
		Set<Integer> yResult = new TreeSet<Integer>();
		yResult.addAll(aIntegers);
		yResult.removeAll(bIntegers);
		
		
		
		Iterator<Integer> iterator = jResult.iterator();
		if(iterator.hasNext())
			System.out.print(iterator.next());
		while(iterator.hasNext()){
			System.out.print(" " + iterator.next());
		}
		if(!jResult.isEmpty())
			System.out.println();
		
		
		Iterator<Integer> iteratorb = bResult.iterator();
		if(iteratorb.hasNext())
		System.out.print(iteratorb.next());
		while(iteratorb.hasNext()){
			System.out.print(" " + iteratorb.next());
		}
		if(!bResult.isEmpty())
			System.out.println();
		
		Iterator<Integer> iteratory = yResult.iterator();
		if(iteratory.hasNext())
		System.out.print(iteratory.next());
		while(iteratory.hasNext()){
			System.out.print(" " + iteratory.next());
		}
		if(!yResult.isEmpty())
			System.out.println();
		
	}
}
