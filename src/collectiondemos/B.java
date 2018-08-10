package collectiondemos;

class A{
	String password = "hello@rishabh1996";
	public class ChangePassword{
		int passwordChangedDays = 10;
		public void display() {
			System.out.println(passwordChangedDays);
			System.out.println("Original password :" +password);
			password = "abc@123123456";
		}
	}
	
	public void changePwd() {
		ChangePassword p = new ChangePassword();
		p.display();System.out.println("Changed password :" +password);
	}
}
public class B {
	public static void main(String[] args) {
		
		A a = new A();
		a.changePwd();
		//Object of inner class cannot be directly created. You would have to first create the object of the 
		//outer class and through that object we create the object of the inner class. Example below.
		A.ChangePassword f = a.new ChangePassword();
		}

}
