package deloitte;

public class Customer {

	private int custID;
	private String custName;
	private int billAmt;
	
	public Customer() {
		custID = 1000;
		custName = "NA";
		billAmt = 100;
	}
	
	
	
	
	
	
	
	public int getCustID() {
		return custID;
	}







	/*public void setCustID(int custID) {
		this.custID = custID;
	}*/







	public String getCustName() {
		return custName;
	}







	public void setCustName(String custName) {
		this.custName = custName;
	}







	public int getBillAmt() {
		return billAmt;
	}







	public void setBillAmt(int billAmt) {
		this.billAmt = billAmt;
	}







	public Customer(String custName, int billAmt) {
		//super();
		this();
		this.custName = custName;
		this.billAmt = billAmt;
	}



	public Customer(int custID, int billAmt) {
		super();
		this.custID = custID;
		this.billAmt = billAmt;
	}



	public Customer(int custID, String custName, int billAmt) {
		super();
		this.custID = custID;
		this.custName = custName;
		this.billAmt = billAmt;
	}



	public void display() {
		System.out.println("Customer ID : " +custID);
		System.out.println("Customer name : "+custName);
		System.out.println("Bill amount : "+ billAmt);
	}
	
	public static void main(String[] args) {
		Customer customer = new Customer("Raj",100);
		customer.display();
		
	}
}
