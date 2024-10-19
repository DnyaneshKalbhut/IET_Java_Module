package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file {

	public static void main(String[] args) {
		
	
		
		try {
			File obj  = new File("C:\\240845920024\\Java_module\\Day-12\\myfile.txt");
			
			//to check wheather file is created or not
			if(obj.createNewFile()) {
				System.out.println("File created "+ obj.getName());
			}else {
				System.out.println("file already exist");
			}
			
			//to write files
			FileWriter mywriter = new  FileWriter("myfile.txt");
			mywriter.write("i am doing file handling \n line2 \n line3 \n line4 \n line5 ");
			mywriter.close();
			
			//to read a file
			Scanner myReader = new Scanner(obj);
			while(myReader.hasNextLine()) {
				String data  = myReader.nextLine();
			 System.out.println(data);
			}
			
			
			if(obj.exists()) {
				System.out.println("filename: "+obj.getName());
				System.out.println("path: "+obj.getAbsolutePath());
				System.out.println("code: "+obj.hashCode());
				System.out.println("Writeable: " + obj.canWrite());
			    System.out.println("Readable " + obj.canRead());
				
				
				//to delete file 
			    
			    if(obj.delete()) {
			    	System.out.println("Deleted file : "+obj.getName());
			    }else {
			    	System.out.println("NOT found");
			    }
			}
			
		
	
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
