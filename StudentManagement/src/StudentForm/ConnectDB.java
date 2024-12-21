package StudentForm;

import java.sql.*;

public class ConnectDB {

	//Connection class used to connect java with database
	Connection conn;
	
	public ConnectDB() {
		
		try {
			
			//Load the MYSQL Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Connecting java with MySQL
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Hello_123");
			System.out.println("Connection Established");
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		new ConnectDB();
	}
	
}
