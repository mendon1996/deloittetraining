package thread_demos;

class Print{
	//Adding synchronized keyword ensures thread safety
	public synchronized static void printSomething(String firstName, String lastName) {
		System.out.println("Welcome, " +firstName);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Bye. " +lastName);
	}
}
public class Demo3 extends Thread{
	
	private String firstName;
	private String lastName;
	public Demo3(int i) {
		//this will create a thread with name 1
		super(i+"");
		start();
	}
	public Demo3(int i,  String firstName, String lastName) {
		super(i+"");
		this.firstName = firstName;
		this.lastName = lastName;
		start();
	}
	public void run(){
		Print.printSomething( firstName,lastName);
	}
	
	public static void main(String[] args) {
		System.out.println("Enters main");
		new Demo3(1,"Rahul","Mehta");
		new Demo3(2,"Raj","Shah");
		new Demo3(1,"Jay","Mehta");
		System.out.println("Leaves main");
	}
}
