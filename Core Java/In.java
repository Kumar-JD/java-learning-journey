import java.io.*;
class In{
	public static void main(String args[])throws Exception // throws small unwanted errors ni rakunda 
	{
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(i);
		
		
		System.out.print("enter any character     :  ");
		//char c = (char)b.read();
		String s = b.readLine();

		System.out.println("your enterd charcterid  : "+s);
		
	}
}