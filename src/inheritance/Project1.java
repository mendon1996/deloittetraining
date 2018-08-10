package inheritance;

class Project1 {
	
	private void Project1() {
		}
		
	public static String dd() {
		return "new password";
		}
}

class B{
	
	String s = Project1.dd();
	
	System.out.println(s);   //Private constructors do not hinder in returning methods until and unless the class is static. 	


	}
	
+