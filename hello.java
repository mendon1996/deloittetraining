import deloitte.Project;


public class hello {
	
	int num=100;
	

	public void display() {
		System.out.println("Display called " +num);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome again");
		hello h = new hello();
		h.display();
		
	
		deloitte.Project pr = new deloitte.Project();
		pr.test();
		
		Assignment01 a = new Assignment01();
		a.main(args);
	}
}










class How{
	
	public void hi() {
		
		Employee employee = new Employee();
		employee.getDetails();
		System.out.println("Hi is in how");
	}
	
	public static void main(String[] args) {
		System.out.println("i is in main of how");
		How hw = new How();
		hw.hi();
	}
}