package io_demos;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo1 {
	
	public static void main(String[] args) throws IOException {
		
		/*File file = new File("C:\\Batch\\b.txt");
		file.createNewFile();*/
		
		String s;
		
		File fileA = new File("C:\\Batch\\a.txt");
				
		if(fileA.exists()) {
			
			FileReader reader = new FileReader(fileA);
			
			long i;
			long j = fileA.length();
			char[] c[1000];
			
			while((i=reader.read())!=-1) {
				
				for(i=0;i<j;i++) {
					
					
				}
				
				
			}
		}
		
		}
}

	

