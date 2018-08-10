package arraydemo;

public class Demo1 {
	
	public void display() {
		java.lang.String marks = "90"; //Here marks is an object and not a variable.
	/*int num = marks;*/  //Here, num is a variable.
		int num = Integer.parseInt(marks);
		
		Integer p = 190; //object to primitive conversion
		
		//boxing
		int g = new Integer(p); //object to primitive
		
		//auto-unboxing
		int q = p; // primitive to object
		
		/*char c = '6';
		int i = 'Z';*/
	}
	
	public static void main(String[] args) {
		
	}
}
