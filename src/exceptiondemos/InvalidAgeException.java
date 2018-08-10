package exceptiondemos;

public class InvalidAgeException extends RuntimeException{
	
	public InvalidAgeException() {
		
		
	}
	
	public InvalidAgeException(String message) {
		
		super(message); //We use super so that the string message goes to Runtime exception where getMessage function can access string message
	}
	
	
}
