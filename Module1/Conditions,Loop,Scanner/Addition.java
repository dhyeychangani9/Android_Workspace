package com_18;
import java.util.Scanner;

public class Addition
{
	public static void main(String[] args)
	{
		  int first, second, add, subtract, multiply;
		    float devide;
		    Scanner scanner = new Scanner(System.in);

		    System.out.print("Enter two charactr : ");
		    first = scanner.nextInt();
		    second = scanner.nextInt();

		    add = first + second;
		    subtract = first - second;
		    multiply = first * second;
		    devide = (float) first / second;

		    System.out.println("Sum = " + add);
		    System.out.println("Difference = " + subtract);
		    System.out.println("Multiplication = " + multiply);
		    System.out.println("Division = " + devide);
		  }
		
	}

