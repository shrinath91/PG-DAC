package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class _5_Dept_Emp {

	public static void main(String[] args) throws Exception 
	{

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String jdbcurl = "jdbc:mysql://localhost:3306/know_it";
		Connection con = DriverManager.getConnection(jdbcurl,"root","root");
		System.out.println("Connection Established");
		
		Statement s = con.createStatement();
		
		ResultSet res = s.executeQuery("select d.dname, avg(sal) from emp e, dept d group by d.dname order by avg(sal)");
		
		while(res.next())
		{
			System.out.print(res.getString(1)+" : ");
			System.out.println(res.getFloat(2));
		}
		con.close();

	}

}
