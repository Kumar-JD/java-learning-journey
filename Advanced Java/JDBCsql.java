import java.sql.*;
import java.io.*;

class JDBCsql{
	public static void main(String args[]){
		String Driver ="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/school";
		String user="root"; //orcale user = System
		String password="3272";
		try{
			//step-1 register the driver
			Class.forName(Driver);
			//step-2 get connection 
			Connection Con = DriverManager.getConnection(url,user,password);
			//step-3 create statement object
			Statement stmt = Con.createStatement();
			//step-4 write the query 
			Scanner s = new Scanner();
			
			System.ou.println("Enter the user name :");
			String username = s.nextLine();
			
			System.out.println("Enter password : ");
			String pass = s.nextLine();
		
			PreparedStatement preStmt = Con.preparestatement();
			
			
		}
		catch(Exception e){
			System.out.println("Error"+e);
		}
	}
}