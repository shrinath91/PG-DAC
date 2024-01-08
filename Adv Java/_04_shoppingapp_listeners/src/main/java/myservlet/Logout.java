package myservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entities.User;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con = null;
	
	public void init(ServletConfig config) throws ServletException {
		con = (Connection)config.getServletContext().getAttribute("jdbccon");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		PreparedStatement ps = null;
		HttpSession session = request.getSession(false);
		if(session != null)
		{
			User user = (User)session.getAttribute("userinfo");
			String userid = user.getUid();
			Timestamp logout_time = new Timestamp(new Date().getTime());
			int n = 0;
			try 
			{
				ps = con.prepareStatement("Update logrecord set logouttime = ? where userid = ? and logouttime is NULL");
				ps.setTimestamp(1, logout_time);
				ps.setString(2, userid);
				n = ps.executeUpdate();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			if(n>0)
			{
				out.print("Successfully Logout!!!<br/>");
				session = request.getSession(false);
				if(session != null)
				{
					session.invalidate();
					out.print("<br/> You are logged out successfully ");
					out.print("<br/> <a href='Login.jsp'> Login again? </a> ");
				}
				
			}
			else
			{
				out.print("Log Record not generated!!!<br/>");
				out.print("<br/> <a href='Login.jsp'> Login again? </a> ");

			}
		}
		else
		{
			out.print("Session not Found<br/>");
			out.print("<br/> <a href='Login.jsp'> Login again? </a> ");

			
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
