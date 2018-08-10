public class Customer {
	
	int p = 0;
	public void disp(int p, int m) {
		System.out.println("Adding two numbers : " +(p+m));
		
	}
	
	public void disp() {
		System.out.println("No addition");
	}
	public void disp(int...num) {
		for(int i:num)
			System.out.println(i);
	}
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.disp(1,2,7,8);
	}
}
