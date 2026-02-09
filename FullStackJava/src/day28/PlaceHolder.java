package day28;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;

public class PlaceHolder {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/Studentdb";
	    String username = "root";
	    String password = "Am110032*";
	    
	    String query = "Insert into Phone values(?,?,?)";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    System.out.println("Driver loaded successfully");
	    
	    Connection con = DriverManager.getConnection(url,username,password);
	    System.out.println("Connection Established Successfully");
	    
	    PreparedStatement pst = con.prepareStatement(query);
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("please enter id");
	    int id = sc.nextInt();
	    
	    System.out.println("please enter brand name");
	    String brand = sc.next();
	    
	    
	    System.out.println("please enter price");
	    int price = sc.nextInt();
	    
	    pst.setInt(1,id);
	    pst.setString(2, brand);
	    pst.setInt(3, price);
	    
	    
	
	    
	    pst.executeUpdate();
	    
	    System.out.println("Data Inserted Successfully");
	    
	    pst.close();
	    con.close();
	    
	    System.out.println("Connection Closed....");
	    
	    
	    

	}

}
