import java.io.*;
import java.io.IOException;
class FWrite{
	public static void main (String args[]){
		try{
		FileWriter w = new FileWriter("sample.txt");
		w.write("Hello java !");
		w.write("\nNew line added");
		w.close();
		}
		catch (IOException e){
			System.out.println("Error"+e);
		}
		
	}
}