package pack2;

import pack1.A;

public class E extends A{

		public void display() {
			
			A a = new A();
			a.i = 200;  //access through object create creates error in java in protected mode
			
			i = 325;
			
			
			
			
		}
}
