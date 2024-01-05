package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test_Connection {
	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String jdbcurl = "jdbc:mysql://localhost:3306/know_it";
			Connection Con = DriverManager.getConnection(jdbcurl,"root","root");
			System.out.println("Connection Established");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class Driver not found");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("Connection rejected to DB");
		}
		
	}

}
