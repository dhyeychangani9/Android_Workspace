package com_18;
import java.util.Scanner;

public class Areacircle 
{
	public static void main(String[] args) 
	{
		int radius;
		double area;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the radius of circle :");
		radius = sc.nextInt();
		area = (radius*radius)*Math.PI;
		System.out.println("Area of the cicrcle is :"+area);
	}
}
