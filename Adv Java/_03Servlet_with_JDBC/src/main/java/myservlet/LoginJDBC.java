package myservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginjdbc")
public class LoginJDBC extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String jdbcurl = "jdbc:mysql://localhost:3306/shoppingdb";
			con =  DriverManager.getConnection(jdbcurl,"root","root");
			System.out.println("connection established");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		try
		{
			con.close();			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		String u = request.getParameter("uid");
		String p = request.getParameter("pwd");
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		try
		{
			ps = con.prepareStatement("Select * from users where u_id=? and password=?");
			ps.setString(1, u);
			ps.setString(2, p);
			rs = ps.executeQuery();

			if(rs.next())
			{
//				out.print("<h1>Success</h1>");
				RequestDispatcher rd = request.getRequestDispatcher("/home");
				rd.forward(request, response);
			}
			else
			{
				response.sendRedirect("/_03Servlet_with_JDBC/Loginform.html");
				//
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
				rs.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		}
		
		
	}

}
