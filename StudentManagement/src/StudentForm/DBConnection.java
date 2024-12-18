package StudentForm;

import java.sql.*;

public class DBConnection {

	//Connection class used to connect java with database
	Connection conn;
	
	public DBConnection() {
		
		try {
			
			//Load the MYSQL Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Connecting java with MySQL
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbdemo","root","Hello_123");
			System.out.println("Connection Established");
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		new DBConnection();
	}
	
}
