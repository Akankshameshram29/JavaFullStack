package day29;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/Studentdb";
	    String username = "root";
	    String password = "Am110032*";
	    
	    String query = "Select * from phone where name = ?";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    System.out.println("Driver loaded successfully");
	    
	    Connection con = DriverManager.getConnection(url,username,password);
	    System.out.println("Connection Established Successfully");
	    
	    PreparedStatement pst = con.prepareStatement(query);
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the name");
	    String name = sc.nextLine();
	    
	    pst.setString(1, name);
	    
	    
	    ResultSet rs = pst.executeQuery();
	    
	    while(rs.next()) {
			System.out.println(rs.getInt(1)+" " + rs.getString(2) + " "+ rs.getString(3));
		}
	    
	    rs.close();
        pst.close();
        con.close();
        sc.close();
	    
      
	}

}
