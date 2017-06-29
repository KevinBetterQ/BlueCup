package com.blue.study;


import java.util.Scanner;

/*
 * 问题描述
　　话说这个世界上有各种各样的兔子和乌龟，但是研究发现，所有的兔子和乌龟都有一个共同的特点——喜欢赛跑。于是世界上各个角落都不断在发生着乌龟和兔子的比赛，小华对此很感兴趣，于是决定研究不同兔子和乌龟的赛跑。他发现，兔子虽然跑比乌龟快，但它们有众所周知的毛病——骄傲且懒惰，于是在与乌龟的比赛中，一旦任一秒结束后兔子发现自己领先t米或以上，它们就会停下来休息s秒。对于不同的兔子，t，s的数值是不同的，但是所有的乌龟却是一致——它们不到终点决不停止。
　　然而有些比赛相当漫长，全程观看会耗费大量时间，而小华发现只要在每场比赛开始后记录下兔子和乌龟的数据——兔子的速度v1（表示每秒兔子能跑v1米），乌龟的速度v2，以及兔子对应的t，s值，以及赛道的长度l——就能预测出比赛的结果。但是小华很懒，不想通过手工计算推测出比赛的结果，于是他找到了你——清华大学计算机系的高才生——请求帮助，请你写一个程序，对于输入的一场比赛的数据v1，v2，t，s，l，预测该场比赛的结果。
*/

public class BASIC24_TurtleAndRabbit {
	
	public static void main(String[] args)  {
		Scanner scanner  = new Scanner(System.in);
		int v1 = scanner.nextInt();
		int v2 = scanner.nextInt();
		int t = scanner.nextInt();
		int s = scanner.nextInt();
		int l = scanner.nextInt();
		
		int dis_r = 0;
		int dis_w = 0;
		
		int time = 0;
		char result = 0;
		int flag = 0;
		
		while(true){
			time++;
			dis_r = dis_r + v1;
			dis_w = dis_w + v2;
			
			if((dis_r==l)&&(dis_w<l)) {result = 'R';break;} 
			if((dis_r<l)&&(dis_w==l)) {result = 'T';break;} 
			if((dis_r==l)&&(dis_w==l)) {result = 'D';break;} 
			
			if((dis_r-dis_w)>=t){
				for(int j=0;j<s;j++){
					time++;
					dis_w += v2;
					if(dis_w==l) {result = 'T'; flag=1; break;}
				}
				if(flag==1) break;
			}
			
			
			
		}
		
		System.out.println(result);
		System.out.println(time);
		
		
	}


}