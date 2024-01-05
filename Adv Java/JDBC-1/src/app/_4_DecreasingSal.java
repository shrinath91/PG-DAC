package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class _4_DecreasingSal {

	public static void main(String[] args) throws Exception
	{

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String jdbcurl = "jdbc:mysql://localhost:3306/know_it";
		Connection con = DriverManager.getConnection(jdbcurl,"root","root");
		System.out.println("Connection Established");
		
		Statement s = con.createStatement();
		
		ResultSet res = s.executeQuery("SELECT * FROM know_it.emp100 order by sal;");
		
		while(res.next())
		{
			System.out.print(res.getInt(1)+" : ");
			System.out.print(res.getString(2)+" : ");
			System.out.print(res.getFloat(6)+" : ");
			System.out.println(res.getInt(8));
		}
		con.close();
		
		
		
	}

}
