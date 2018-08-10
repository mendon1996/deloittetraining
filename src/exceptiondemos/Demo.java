package exceptiondemos;

public class Demo {
		
		String name;
	
		public void display() {
			int[] arr;
			try {
				arr = new int[-3];
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
			try {
				System.out.println("I am");
				System.out.println("The length is : " +name.length());
				}
			
			catch(Exception e){
				
				e.printStackTrace();
			}
		
			
			/*try {
				System.out.println(arr[10]);
			}
			
			catch(Exception e2) {
				e2.printStackTrace();
			}*/
		}
		
		public static void main(String[] args) {
			
			System.out.println("Hello main");
			Demo d = new Demo();
			d.display();
			System.out.println("Main ended");
			
		}
}
