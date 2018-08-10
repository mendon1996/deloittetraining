package deloitte;

public class Client {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.display();
		
	    int a = customer.getCustID();
	    System.out.println("a is printed as " +a) ;
	    
	    customer. setCustName("Ami");
	    
	    String s = customer.getCustName();
	    System.out.println("The changed name is " + s);
	    
	    
	    
		
		int result = input();
		System.out.println(result);
	}

	public static int input() {
		int a=0, b=0;
		int result = a+b;
		return result;
	}
}
