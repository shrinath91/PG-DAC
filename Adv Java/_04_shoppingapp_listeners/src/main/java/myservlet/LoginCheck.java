
package myservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entities.User;

@WebServlet("/logincheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		con = (Connection)config.getServletContext().getAttribute("jdbccon");
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@SuppressWarnings("resource")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		String u = request.getParameter("uid");
		String p = request.getParameter("pwd");
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		Cookie cookie;
		User user = null;
		try
		{
			HttpSession session = request.getSession();
			ps = con.prepareStatement("Select * from users where u_id=? and password=?");
			ps.setString(1, u);
			ps.setString(2, p);
			rs = ps.executeQuery();

			
			

			if(rs.next())
			{
//				out.print("<h1>Success</h1>");
//				RequestDispatcher rd = request.getRequestDispatcher("/home");
//				rd.forward(request, response);
				
				user = new User(rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6),rs.getString(7));
				session.setAttribute("userinfo", user);
				
				Cookie[] all = request.getCookies();
				if(all != null)
				{
					for(Cookie c : all)
					{
						if(c.getName().equals("LoginMsgCookie"))
						{
							c.setMaxAge(0);
							response.addCookie(c);
						}
					}
				}
				
				ps 	= con.prepareStatement("Insert into logrecord(userid,logintime) values(?,?)");
				ps.setString(1, u);
				Timestamp login_time = new Timestamp(new Date().getTime());
				ps.setTimestamp(2, login_time);
				ps.execute();
				response.sendRedirect("home");
				
			}
			else
			{
				cookie = new Cookie("LoginMsgCookie","Login_Failed");
				response.addCookie(cookie);
				response.sendRedirect("Login.jsp");
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
		out.close();		
		
	}

}
