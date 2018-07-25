package collectiondemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerMain {
	
	public static void main(String[] args) {
		
		List<Customer> allCustomers = new ArrayList<Customer>();
		
		Customer c1 = new Customer(10,"Uma","Pune",76000);
		
		allCustomers.add(c1);
		allCustomers.add(new Customer(11,"Mahesh","Tibet",75000));
		allCustomers.add(new Customer(12,"Shiva","Udupi",74000));
		allCustomers.add(new Customer(13,"Ram","Ayodhya",75000));
		allCustomers.add(new Customer(14,"Mohini","Delhi",70000));
		allCustomers.add(new Customer(15,"Akbar","Agra",90000));
		
		System.out.println("Printing all the customer details : ");
		
		//did not understand the condition inside the for loop
		for(Customer customer : allCustomers) {
			
			System.out.println(customer);
		}
		
		Collections.sort(allCustomers);
		System.out.println("After sorting - printing all customer records ");
		
		for(Customer customer : allCustomers) {
			
			System.out.println(customer);
		}
		
		Collections.sort(allCustomers, new CustomerAddressComparator());
		// to use sort function, we need to implement customer on comparable class.
		//Doing that, we can now use the *compareto* method which helps the sort method to sort the required column.
		System.out.println("after sorting - via comparator ");
		
		for(Customer customer : allCustomers) {
			
			System.out.println(customer);
		}
		
		
	}
}
