package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class _2Min_Max_sal{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String jdbcurl = "jdbc:mysql://localhost:3306/know_it";
		Connection con = DriverManager.getConnection(jdbcurl,"root","root");
		System.out.println("Connection Established");
		
		PreparedStatement ps = con.prepareStatement("");
	}

}
