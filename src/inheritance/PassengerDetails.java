package inheritance;

public class PassengerDetails {
	
	public int pnr;
	public String Passenger;
	public int fare;
	
	public PassengerDetails(int pnr,String Passenger,int fare) {
		super();
		this.pnr = pnr;
		this.Passenger=Passenger;
		this.fare=fare;
	}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((Passenger == null) ? 0 : Passenger.hashCode());
			result = prime * result + fare;
			result = prime * result + pnr;
			return result;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			
			if (obj == null)
				return false;
			
			if (getClass() != obj.getClass())
				return false;
			
			PassengerDetails other = (PassengerDetails) obj;
			if (Passenger == null) {
				
				if (other.Passenger != null)
					return false;
			} 
			else if (!Passenger.equals(other.Passenger))
				return false;
			
			if (fare != other.fare)
				return false;
			
			if (pnr != other.pnr)
				
				return false;
			
			return true;
		}
		
		
	
}


	
	


