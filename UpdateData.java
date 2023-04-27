package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateData {

	public static void main(String[] args) {
		try {
        	
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        System.out.println("Driver found");
	        Connection connection=DriverManager.getConnection(
	        		
	        		"jdbc:mysql://localhost:3306/Princi", "root","root");
	        System.out.println("Connection Success");
	        Statement statement=connection.createStatement();
	        Scanner sc = new Scanner(System.in);
	        int id = sc.nextInt();
	        String name = sc.next();
	        String usercol = sc.next();
	        
	        String uquery = "UPDATE `princi`.`user` SET `name` = '"+name+"', `usercol` = '"+usercol+"' WHERE (`id` = '"+id+"');";
	        statement.executeUpdate(uquery);
	        System.out.println("Data Updated Successfully");
	        
	        
	        ResultSet rs=statement.executeQuery("SELECT * FROM princi.user");
	        while(rs.next())
	        {
	        	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	        }
	        
	        }
	        catch(Exception e) {
	        	System.out.println(e);
	        }
	}
}
