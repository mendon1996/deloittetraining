package thread_demos;

//creating thread using anonymous class
public class Demo4 {
	
	public static void main(String[] args) {
		System.out.println("Main called by " +Thread.currentThread().getName());
		Thread t1 = new Thread();
		t1.start();
		//creating an anonymous class
		{
			public run(){
				System.out.println("Run called :" +Thread.currentThread().getName());//Here thread is a static class and currentthread is a static method. Thats why we don't need to create an object to call that function.
			}
		};
		
	} 
		
	
	

}
