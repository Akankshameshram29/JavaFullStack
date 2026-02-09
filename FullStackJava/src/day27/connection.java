package day27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost:3306/Studentdb";
		String url1 = "oracle:jdbc:thin:@localhost:1521";
		String user = "root";
		String pass = "Am110032*";
		String sql = "Select * from student";
		//loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded successfully");
		
		//establishing the connection
		System.out.println(DriverManager.getDrivers().hasMoreElements());

		Connection connection =DriverManager.getConnection(url,user,pass);
		System.out.println("Connection establsihed successfully");
		
		
		//creating 
		Statement  st = connection.createStatement();
		
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" " + rs.getString(2) + " "+ rs.getString(3)+" "+ rs.getString(4));
		}
	}
	
}
