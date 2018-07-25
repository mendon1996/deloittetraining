package io_demos;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static void main(String[] args) throws IOException {
	File file1 = new File("C:\\Batch");
	file1.mkdir();
	File file2 = new File("C:\\Batch\\BatchMates.txt");
	file2.createNewFile();
	
	System.out.println("Files created inside the batch folder ");
	
	File folder = new File("C:\\");
	File[] listOfFiles = folder.listFiles();

	
	//Find out what this for loop does
	for (int i = 0; i < listOfFiles.length; i++) {
		if (listOfFiles[i].isFile()) {
	    
			System.out.println("File " + listOfFiles[i].getName());
		} 
		else if (listOfFiles[i].isDirectory()) {
	    
			System.out.println("Directory " + listOfFiles[i].getName());
		}

	}
	}
	
}
