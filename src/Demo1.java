
public class Demo1 {
	
	public int addNumbers(int num1, int num2) {
		System.out.println(num1+num2);
		return num1+num2;
	}
	
	public static void main(String[] args) {
		int sum = 0;
		Demo1 d = new Demo1();
		sum += d.addNumbers(2,9);
		sum += d.addNumbers(10,20);
		sum += d.addNumbers(2,8);
		
		System.out.println("Total sum is : " +sum);
		
	}

}
