package io_demos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class Random_acc_file {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("a.txt");
		//RandomAccessFile is used read as well as write into files
		RandomAccessFile ra = new RandomAccessFile(f,"rw");
		
		//append. ie it goes to the end of the file
		ra.seek(ra.length());
		System.out.println("The file pointer before writing is " +ra.getFilePointer());
		
		ra.writeUTF("Hello");
		//at the end of this, the cursor is still in the at the end. So, we reset it to the beginning using seek.
		System.out.println("The file pointer after writing is " +ra.getFilePointer());
		ra.seek(0);
		System.out.println("The file pointer before reading is " +ra.getFilePointer());
		
		/*String n = ra.readUTF(); //Unified text format*/
		
		System.out.println("The content of the file is ");
		/*System.out.println(n);*/
		
		try {
			do {
				
				String n = ra.readUTF();
				System.out.println(n);
				
			}while(true);
		}
		catch(Exception e) {
			
			
		}
		System.out.println("The file pointer after reading  is " +ra.getFilePointer());
	}
	
		
}
