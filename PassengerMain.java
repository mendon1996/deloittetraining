package inheritance;

public class PassengerMain {
	
	public int pnr;
	public String Passenger;
	public int fare;
	
	public static void main(String[] args) {
			PassengerDetails passenger1 = new PassengerDetails(1927,"Yamini", 25);
			PassengerDetails passenger2 = new PassengerDetails(1927,"Yamini", 25);
			//PassengerDetails passenger3 = passenger1;
			
			System.out.println(passenger1.equals(passenger2));
			
			
		}
}
