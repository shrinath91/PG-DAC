package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.StatementImpl;

public class _6_Scrollable_Unscrollable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String jdbcurl = "jdbc:mysql://localhost:3306/know_it";
		Connection con = DriverManager.getConnection(jdbcurl,"root","root");
		System.out.println("Connection Established");
		
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stmt.executeQuery("Select * from emp10");
		
		while(rs.next())
		{
//			if(rs)
		}
		
		
		

	}

}
