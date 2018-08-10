package collectiondemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo3 {
	
	public static void main(String[] args) {
		int marks[] = {12,89,23};
		
		String str[] = {"Raju","Rohan","Uday","Tarun"};
	
		List<String> list = Arrays.asList(str); //This line converts array to list. 
		//The problem is that we can't change the array properly 
		
		List<String> pp = new ArrayList(); // A copy of the list converted from the array is stored in pp.
		//We make changes to this object, pp.
		
		pp.addAll(list);
		
		pp.add(3,"Ram");
		System.out.println(pp);
		
	}

}
