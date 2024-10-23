package sep30.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BasicConn {

	public static void main(String[] args) {
		
		
//		try {
//			Class.forName("com.mysql.cj.jdbc");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			//2 creating connection object 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anp_C9284","root","1234") ;
			
			// 3 creating statement object 
			Statement st  = con.createStatement() ;
			
			// 4 execute query 
			ResultSet  rs  = st.executeQuery("select * from Employees");
			
			
			//basic crud operation 
			//single ton class
			// what is dao pattern (data access object )
			//basic project with 2 or 3 entity
			//full functional project using dao pattern by jdbc
			
			//hibernate 
			
		while(rs.next())	{
			System.out.println( "ID  ->"+rs.getInt(1) +" name -->" + rs.getString(2) + " salary " +rs.getInt(3) );
			
			}
			
		// closing the connection 
		con.close()	 ;
		} 
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}