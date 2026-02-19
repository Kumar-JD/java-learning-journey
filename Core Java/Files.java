import java.io.*;
import java.io.IOException;
import java.nio.file.*;

class Files {
	public static void main(String args[]){ 
	
	//Create file using java 
	
	File ofile = new File("example1S.txt");
	
	File nfile = new File("sample.txt");
	
	//change the file name 
	
	ofile.renameTo(nfile);
	
	try {
		if(ofile.createNewFile()){
			System.out.println("File was created");
		}
		else{
			System.out.println("File was not created");
		}	
	}
	catch(IOException e){
		System.out.println("Error"+e);
		
	}
	}
	
}