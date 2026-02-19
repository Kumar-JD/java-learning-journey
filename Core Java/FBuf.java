import java.io.*;
import java.io.IOException;
import java.util.*;
class FBuf{
	public static void main(String args[]){
		//fetach the all the  content in our file 
		
		try{
			FileReader f = new FileReader("sample.txt");
			BufferedReader br = new BufferedReader(f);
			String line;
			while ((line=br.readLine())!= null){
				System.out.println(line);
			}
		}
		catch(IOException e){
			
			System.out.println("Error"+e);
			
		}
	}
}