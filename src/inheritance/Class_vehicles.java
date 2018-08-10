package inheritance;

abstract class Vehicles {
	
	int price;
	public Vehicles() {
		System.out.println("Vehicle constructor called");
	}
	
	public abstract void start();
	public abstract void stop();
	
	public void music() {
		System.out.println("Music ");
	}
}

class Car extends Vehicles{
	
	public void start() {
		
		price = 900000;
		System.out.println("Car started ");
		
	}
	
	public void stop() {
		
		System.out.println("Car stopped.");
		
	}
}

public class Class_vehicles{
	
	public static void main(String[] args) {
		
		Vehicles vehicle = new Car();
		vehicle.music();
		vehicle.start();
	}
}