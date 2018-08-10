package io_demos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class Demo {
	
	public static void main(String[] args) throws IOException {
		
		/*Properties p = System.getProperties();
		Enumeration<Object> e = p.elements();//what does this line do?
		while(e.hasMoreElements())
		{
			System.out.println("The value is : " + e.nextElement());
		}*/
		
		//This program helps us read and display the properties file
		InputStream stream = new FileInputStream("C:\\Batch\\config.properties");
		Properties properties = new Properties();
		/*properties.load(stream);*/
		
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println("Username is : " +username);
		
		System.out.println("Password is : " + password);
		
		stream.close();
		}

}
