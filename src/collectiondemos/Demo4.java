package collectiondemos;

public class Demo4<Z> {
	
	public void display(Z name) {
		System.out.println(name);
	}
	public static void main(String[] args) {
		Demo4<Integer> d = new Demo4<Integer>();
		d.display(122);
		Demo4<String> d1 = new Demo4<String>();
		d1.display("Rishabh");
		
	}

}
