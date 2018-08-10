package io_demos;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import collectiondemos.Customer;

public class Customer1Main{
	public static void main(String[] args) throws IOException {
		
	
	Customer customer = new Customer(122,"Rishu","Udupi",34000);
	
	FileOutputStream stream = new FileOutputStream("customer.txt");
	BufferedOutputStream bs = new BufferedOutputStream(stream);
	ObjectOutputStream ot = new ObjectOutputStream(bs);
	
	ot.writeObject(customer);
	ot.close();
	
	System.out.println(customer.getCustname()+" , your record is saved");
	
	}
	
	

}
