import java.sql.*;

class JDBC0{
	public static void main(String args[]){
		String Driver ="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/school";
		String user="root"; //orcale user = System
		String password="****";
		try{
			//step-1 Register the Driver
			
			Class.forName(Driver);
			
			//step-2 Get Connection
			
			Connection Con = DriverManager.getConnection(url,user,password);
			
			//step-3 create the statement object
			
			Statement stmt = Con.createStatement();
			
			//step-4 Exeute the connection 
			stmt.executeUpdate("insert into students values(4,'Kumar','10B',15)");
			
			
			
			//step-5 close the connection 
			
			Con.close();
			
		}
		catch (Exception e){
			System.out.println(e);
		}
		
	}
}