package app;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class _4_StoredProcedure {

	public static void main(String[] args) throws Exception 
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String jdbcurl = "jdbc:mysql://localhost:3306/know_it";
		Connection con = DriverManager.getConnection(jdbcurl,"root","root");
		System.out.println("Connection Established");
		
		CallableStatement cs = con.prepareCall("{call getEmp}");
	}

}
