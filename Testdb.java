package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Testdb {

	public static void main(String[] args) {

        try {
        	
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver found");
        Connection connection=DriverManager.getConnection(
        		
        		"jdbc:mysql://localhost:3306/Princi", "root","root");
        System.out.println("Connection Success");
        Statement statement=connection.createStatement();
        ResultSet rs=statement.executeQuery("SELECT * FROM princi.student");
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
