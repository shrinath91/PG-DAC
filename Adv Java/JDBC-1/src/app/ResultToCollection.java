package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ResultToCollection {

	public static void main(String[] args) throws Exception 
	{

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String jdbcurl = "jdbc:mysql://localhost:3306/know_it";
		Connection con = DriverManager.getConnection(jdbcurl,"root","root");
		System.out.println("Connection Established");
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("Select * from emp100");
		
		Set<Emp> emps = new TreeSet<Emp>(new Comparator<Emp>() {
			public int compare(Emp o1, Emp o2)
			{
				int diff = 0;
				if(o1.getSal() > o2.getSal())
					diff = 	-1;
				else if(o1.getSal() < o2.getSal())
					diff = 1;
				else
				{
					diff = o1.getEmpno() - o2.getEmpno();
				}			
				return diff;
			}
		});
		
		while(rs.next())
		{
			Emp e = new Emp(rs.getInt(1),rs.getString(2),rs.getFloat(6));
			emps.add(e);		
		}
		
		//iterate thr' the collection
		for(Emp e : emps)
		{
			System.out.println(e);
		}
		rs.close();
		stmt.close();
		con.close();
		
	}

}
