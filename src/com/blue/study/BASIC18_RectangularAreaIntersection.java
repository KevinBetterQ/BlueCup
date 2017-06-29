package com.blue.study;

import java.util.Scanner;
/*
 * 问题描述
　　平面上有两个矩形，它们的边平行于直角坐标系的X轴或Y轴。对于每个矩形，我们给出它的一对相对顶点的坐标，请你编程算出两个矩形的交的面积。
*/
public class BASIC18_RectangularAreaIntersection {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x1,y1,x2,y2,x3,y3,x4,y4;
		x1 = scanner.nextDouble();
		y1 = scanner.nextDouble();
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();
		
		x3 = scanner.nextDouble();
		y3 = scanner.nextDouble();
		x4 = scanner.nextDouble();
		y4 = scanner.nextDouble();
		
		double x_min = Math.max(Math.min(x1, x2), Math.min(x3, x4));
		double x_max = Math.min(Math.max(x1, x2), Math.max(x3, x4));
		double y_min = Math.max(Math.min(y1, y2), Math.min(y3, y4));
		double y_max = Math.min(Math.max(y1, y2), Math.max(y3, y4));
		
		if((x_min<x_max)&&(y_min<y_max)){
			System.out.printf("%.2f\n", (x_max-x_min)*(y_max-y_min));
		}
		else {
			System.out.println("0.00");
		}
		
	}
	
}