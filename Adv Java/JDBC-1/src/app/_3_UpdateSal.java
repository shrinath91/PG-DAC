package app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class _3_UpdateSal {
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String jdbcurl = "jdbc:mysql://localhost:3306/know_it";
		Connection con = DriverManager.getConnection(jdbcurl,"root","root");
		System.out.println("Connection Established");
		
		PreparedStatement ps = con.prepareStatement("update emp100 set sal=? where empno=?");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Eneter EmpNo of Employee to update:");
		int empno = Integer.parseInt(br.readLine());
		System.out.print("ENter New Salary: ");
		float sal = Float.parseFloat(br.readLine());
		
		ps.setFloat(1, sal);
		ps.setInt(2, empno);
		
		int n = ps.executeUpdate();
		System.out.println(n+" record updatetd!");
		con.close();
	}

}
