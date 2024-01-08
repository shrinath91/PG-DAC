package myservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String jdbcurl = "jdbc:mysql://localhost:3306/shoppingdb";
			con = DriverManager.getConnection(jdbcurl,"root","root");
			System.out.println("connection established");
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void destroy() {
		// TODO Auto-generated method stub
		try 
		{
			con.close();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uid = request.getParameter("username");
		String pwd = request.getParameter("pass");
		String fname = request.getParameter("fname");
		String mname = request.getParameter("mname");
		String lname = request.getParameter("lname");
		String eml = request.getParameter("email");
		String cont = request.getParameter("cont");
		
		PreparedStatement ps = null;
		PrintWriter out = response.getWriter();
		int rs = 0;
		try
		{
			ps = con.prepareStatement("insert into users values(?,?,?,?,?,?,?)");
			ps.setString(1, uid);
			ps.setString(2, pwd);
			ps.setString(3, fname);
			ps.setString(4, mname);
			ps.setString(5, lname);
			ps.setString(6, eml);
			ps.setString(7, cont);
			try
			{
				rs = ps.executeUpdate();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			if(rs>0)
			{
				out.print("Successfully Registered!!!");
				out.print("<br/> <a href='login.jsp'> Login </a> ");

			}
			else
			{
				out.print("Failed to  Registered!!!");				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				ps.close();
//				rs.close();				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
	}

}
