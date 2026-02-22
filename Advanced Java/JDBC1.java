import java.sql.*;

class JDBC1{
	public static  void main(String args[]){
		String Driver ="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/school";
		String user="root"; //orcale user = System
		String password="****";
		try{
		//step-1 register the driver 
		Class.forName(Driver);
		
		//step-2 register driver
		
		Connection con = DriverManager.getConnection(url,user,password);
		
		//step-3 create the statement object 
		
		Statement stmt = con.createStatement();
		
		//step-4 write query 
		ResultSet result = stmt.executeQuery("select * from students");
		
		
		while (result.next()){
			//System.out.println(result.getInt(1));
		System.out.println(result.getInt(1) + "  " +result.getString(2) + "  " +result.getString(3) + "  " +result.getInt(4));
		}
		
		//step-5 close the connection 
		con.close();
		
		}
		catch(Exception e){
			System.out.println("Error"+e);
			
		}
		
		
		
	}
}