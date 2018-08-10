package collectiondemos;

import java.util.*;

public class Demo2 {
	
	public static void main(String[] args) {
		
	List<Integer> i = new ArrayList<Integer>();
	
	i.add(1);
	i.add(2);
	i.add(3);
	i.add(4);
	i.add(5);
	
	System.out.println(i);
	i.remove(3);
	
	Iterator s = i.iterator();
	while(s.hasNext()) {
		
		System.out.println(s.next());
		
		}
	
		System.out.println("3rd");
		
		//important line 
	
	
	}
	

}
