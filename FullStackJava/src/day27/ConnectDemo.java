package day27;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public class ConnectDemo{
	public static void main(String[] args) throws Exception 
	{	
		//loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successfully");
		
		//Esablishing the Conneciton
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Noor@0209");
		System.out.println("Connection established");
		
		//create statemement
		Statement statement = connection.createStatement();
		
		//execute the query
//     statement.executeUpdate("create table Phone(id int primary key,brand varchar(20),price int)");
		
		statement.executeUpdate("insert into phone values(101,'samsung',100000)");
 
		System.out.println("0 row affected");
		
	}
}