package io_demos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Obj_Read_from_file {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream stream = new FileInputStream("customer.txt");
		BufferedInputStream bs = new BufferedInputStream(stream);
		ObjectInputStream ot = new ObjectInputStream(bs);
		
		Customer c = 
		
		
	}

}
