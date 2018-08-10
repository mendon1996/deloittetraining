package io_demos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptInput {

		public static void main(String[] args) throws IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter the product quantity ");
			int quantity = Integer.parseInt(br.readLine());
			
			System.out.println("Enter the product price");
			int price = Integer.parseInt(br.readLine());
			
			System.out.println("Enter your name ");
			String name = br.readLine();
			
			//We are using the output stream as we want to write into the file
			FileOutputStream writer  = new FileOutputStream("myrec.txt");
			BufferedOutputStream bs = new BufferedOutputStream(writer);
			DataOutputStream ds = new DataOutputStream(bs);
			
			ds.writeUTF(name);
			ds.writeInt(quantity);
			ds.writeInt(price);
			
			/*BufferedWriter writer =
					new BufferedWriter(
						new FileWriter(new File("record.txt")));*/
			
			/*writer.write(quantity);
			writer.write(price);
			writer.write(name);*/
			
			System.out.println("Done");
		
			
			//closing is important as it wont then accept the values from the users 
			ds.close();
			bs.close();
			writer.close();
			//the order of closing is important otherwise it will give an error
			
			
		}
}
