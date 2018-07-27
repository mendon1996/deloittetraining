package com.javatraining.deloitte.Assessment2;

import java.util.Scanner;

public class Calculation {
	

		public static void main(String[] args) {
		Arithmetic ob1 = new Addition();
		Arithmetic ob2 = new Subtraction();
		Arithmetic ob3 = new Multiplication();
		Arithmetic ob4 = new Division();

		Arithmetic[] ob = {ob1, ob2, ob3, ob4};
		int choice;	
		System.out.println("Enter your choice: ");
		System.out.println("1. Addition \n2.Subtraction \n3.Multiplication \n4.Division");
		
		Scanner scanner = new Scanner(System.in);
		choice = scanner.nextInt();
		System.out.println("Enter two numbers: ");
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		System.out.println("Result is: " + ob[choice-1].calculate(num1, num2));
		scanner.close();
		}

		}

