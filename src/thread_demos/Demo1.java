package thread_demos;

public class Demo1 extends Thread {
	
	Thread t1;
	public Demo1(){
		
		t1 = new Thread(this); //this indicates that it is from class Demo1
		t1.setName("t uno");
		t1.start();
		System.out.println("t1 started");
	}
	@Override // we are overriding because run method is present in Thread superclass
	public void run() {
		
		System.out.println("Wait for 2 seconds for t uno to execute...");
		
		try {
			Thread.sleep(2000);
			System.out.println("Run called :" +Thread.currentThread().getName());//Here thread is a static class and currentthread is a static method. Thats why we don't need to create an object to call that function.
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread m = Thread.currentThread();
		m.setName("Aqua");
		System.out.println("Waiting for Aqua to execute for 1 second ");
		Thread.sleep(1000);
		Demo1 d = new Demo1(); 
		
		System.out.println("Hello I am Main :" +Thread.currentThread().getName());
	}
	

}
