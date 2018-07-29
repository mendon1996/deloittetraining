package question1;

public abstract class Arithmetic {
	
	int num1,num2;
	public abstract double calculate(double num1,double num2);
	
	public int getNum1() { //helps retrieve num1
		return num1;
	}
	
	public void setNum1(int num1) { //helps set new value of num1
		this.num1 = num1;
	}
	
	public int getNum2() { //helps retrieve num2
		return num2;
	}
	
	public void setNum2(int num2) {//helps set a new value of num2
		this.num2 = num2;
	}
}
