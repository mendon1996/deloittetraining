package question1;

import java.util.Scanner;

public class Calculation {
	public static void main(String[] args) {
		
		//creating four objects of Arithmetic class to switch to different methods without using the control statements.
		Arithmetic obj1 = new Addition();
		Arithmetic obj2 = new Subtraction();
		Arithmetic obj3 = new Multiplication();
		Arithmetic obj4 = new Division();
 		
		Arithmetic[] object = {obj1, obj2, obj3, obj4};
		
		int choice;	
		
		System.out.println("Enter 1 for Addition \n2 for Subtraction \n3 for Multiplication \n4 for Division");
		
		Scanner scanner = new Scanner(System.in); //Scans the value corresponding to various operations from the user. 
		choice = scanner.nextInt();
		
		System.out.println("Enter two numbers: ");
		//Takes to two numbers that are entered by the user.
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		
		System.out.println("Result is: " + object[choice-1].calculate(num1, num2)); 
		// object[choice-1].calculate(num1, num2) {creating an object array in which the array index helps us points to the objects which invokes the corresponding mathematical operation.
		// e.g  : When the user enters 1(=choice) for addition, object[choice-1] points to object[0] = obj1 in the object array. obj1 in turns helps us invoke the calculate function in the Addition class which performs the operation.
		//Hence, it helps us perform the functions without using any control statements.
		scanner.close();
		
	}

}
