package com.blue.simulation;
import java.util.Scanner;

public class Solution7{
	static boolean[][] G = new boolean[9][9];
	static boolean[] vis = new boolean[9];
	static int N = 7;
	static int y;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	}
	
	void dfs(int n){
		if(n==y){
			return;
		}
		
		for(int i=1;i<=N;i++){
			if(!vis[i]&&G[n][i]){
				vis[i] = true;
				dfs(i);
				vis[i] = false;
			}
		}
		
	}
	
	
}