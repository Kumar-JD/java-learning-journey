import java.io.*;
import java.io.IOException;
class FilDel{
	public static void main(String args[]){
		File f = new File("example.txt");	
			if(f.delete()){
				System.out.println("File was deleted");
			}
			else{
				System.out.println("unable to delete the file ");
			}
		
	}

}