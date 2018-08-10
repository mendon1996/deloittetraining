

package arraydemo;

public class String {
	
	
	public void display()
	{
		java.lang.String name= "anu";
		name = "rishi";//earlier anu goes to garbage
		//System.out.println(name);
		java.lang.String name2 = "anu"; //might point to earlier anu or create a new one
		java.lang.String name3=/* new String*/"anu";
		java.lang.String name4= new java.lang.String ("anu");
		System.out.println(name.equals(name2));
		System.out.println(name==name2);
		System.out.println(name2.equals(name3));
		System.out.println(name2==name3); //checks address or location where that is stored
		System.out.println(name2.equals(name4));
		System.out.println(name2==name4);
		java.lang.String naam = "Anu";
		System.out.println(naam.concat("sharma"));
		System.out.println(naam.concat("singhal"));
		name.concat("Agarwal")
		;
		java.lang.String name5 = name.concat("mendon");
		//String name5 = name;
		System.out.println(name5);
		System.out.println("full name is "+naam);
	}
	public static void main(String[] args) {
		String n = new String();
		n.display();
	}
}
