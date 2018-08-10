package exceptiondemos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputDetails {
		
	int age = 0;
	
	public void display() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age ");
		try {
			age = scanner.nextInt();
			if(age < 0 || age > 85) {
				throw new InvalidAgeException("no negative age");
				
			}
			System.out.println("Your age is : " +age);
		}
		catch(InputMismatchException e){
			System.out.println("Please enter valid number");
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public static void main(String[] args) {
		
		InputDetails details = new InputDetails();
		details.display();
	}
}
