package com.assessment2.Question3;

import java.util.Scanner;

public class MainProgram {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		String str="null";
		
		System.out.println("Instructions for input. On entering a series of numbers, the first number entered represents the size of the array while the remaining numbers are the values stored in the array");
		
		int l=scanner.nextInt(); //Scans the first number(=l) which initializes the size of the array. 
		
		int[] arr = new int[l]; //creates an integer array of size l
		
		for(int i=0;i<l;++i) {  //Entering values into the array.
				
			arr[i]=scanner.nextInt();
		
		}
		
		//checking for tripplets
		if(UserCode.checkTripplets(arr))
			str="TRUE";
		else
			str="FALSE";
		
		scanner.close();
		
		//Prints the results
		System.out.println(str);
		
	}
}
