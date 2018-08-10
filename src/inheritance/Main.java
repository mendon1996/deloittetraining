package inheritance;
class Animal{
	
	public Animal() {
		System.out.println("Animals Calls");
	}
	
	public void eat() {
		System.out.println("Animals eats food");
	}
}

class Men extends Animal{
	
	public Men() {
		System.out.println("Men calls");
	}
	
	public void eat() {
		System.out.println("Men eats vegetarian and non-vegetarian food");
		super.eat();
		}
}

class Dog extends Animal{
	
	public Dog() {
		System.out.println("Dog calls");
	}
	
	public void eat() {
		System.out.println("Dog eats food");
	}
	
	public void drink() {
		System.out.println("Dog drinks because life sucks balls");
	}
}

public class Main{ // it was showing an error because this was the only public class and thus the name of this class should be the same as the java file
	
	public static void main(String[] args) {
		
		Animal a = new Men();
		a.eat();
		
		a = new Dog(); //Note that here a is not an object but the reference to the object created in line 44.
		a.eat();
	}
}

