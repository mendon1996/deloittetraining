package july25;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamTest {
	 public static void main(String[] args) throws IOException {
		
		 FileOutputStream fout = new  FileOutputStream("mfile.txt");
		 
		 PrintStream pout = new PrintStream(fout);
		 
		/* PrintStream pout = new PrintStream(System.out);*/
		 pout.println(1900);
		 pout.println("Hello Java");
		 pout.println("Welcome to Java");
		 
		 pout.close();
		 fout.close();
	}
	
}
