import java.util.Scanner;

public class Weather_System {
	
	public void check(double n) {
		if(n > 60.0 || n < -10.0 ) {
			System.out.println("Warning! The temperature is beyond the tolerable range");
		}
		else {
			System.out.println("The temperature is in the tolerable range ");
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 or 2 for degree Celsius or degree Fahrenheit respectively : ");
		int num = sc.nextInt();
		sc.close();
		
		switch(num) {
		case 1 : 
			Scanner sCelsius = new Scanner(System.in);
			
			System.out.println("Enter the temperature in degree Celsius");
			
			double tempC = sCelsius.nextDouble();
			sCelsius.close();
			
			Weather_System dummy = new Weather_System();
			dummy.check(tempC);
			
			break;
			
		case 2 :
			Scanner sF = new Scanner(System.in);
			
			System.out.println("Enter the temperature in degree Fahrenheit");
			
			double tempF = sF.nextDouble();
			sF.close();
			
			double tempC1 = (tempF - 32)*(5/9);
			
			
			Weather_System dummy2 = new Weather_System();
			dummy2.check(tempC1);
			
			break;
			
			default : 
				System.out.println("User should enter 1 or 2");
				
			}
	}
}
			
			
				
			
			
			
			
			
			
		
