package pack1;

import java.util.Scanner;

public class Weathersystem {
	
public Weathersystem(double t, int n){ // This is a constructor
		
		t = 0.0; 
		n = 0;
		//Here, we completed the initialization process of the parameters.
	}
	public void output(double t1, int n1) {
		String s;
		//The switch case helps us determine the course of action for celsius and fahrenheit scale.
		switch(n1) { 
		case 1 : //For the celsius scale.
			s = ( t1>-10.0 && t1<60.0 )? "The temperature is tolerable" : "The temperature is intolerable";
			System.out.println(s);
			break;
		case 2 : //For the Fahrenheit scale.
			t1 = (t1-32)*(5/9); //Fahrenheit to celsius conversion.
			s = ( t1>-10.0 && t1<60.0 )? "The temperature is tolerable" : "The temperature is intolerable";
			System.out.println(s);
			break;
		default :
			System.out.println("Run the program again and re-enter the parameters");
			}
		}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Initializing the scanner
	
		System.out.println("If the temperature is in celsius, enter 1 and if the temperature is in fahrenheit, enter 2.");
		int num = sc.nextInt(); //Takes the integer value from the user which determine the temperature scale.
		
		System.out.println("Enter the temperature ");
		double temp = sc.nextDouble(); //Takes the value of temperature from the user.
		
		Weathersystem demo = new Weathersystem(temp,num); //This line does two things. 1)It creates an object demo of class weather type.2)It takes us to the constructor Weathersystem where it initializes the parameters.
		demo.output(temp,num); //This takes us to the method output which has two parameters temp and num.
		sc.close(); // This closes the scanner
	}
}
