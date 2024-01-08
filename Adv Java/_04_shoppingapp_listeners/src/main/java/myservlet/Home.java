package myservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		con = (Connection)getServletContext().getAttribute("jdbccon");		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		RequestDispatcher rd = request.getRequestDispatcher("/header");
		rd.include(request, response);
		
		
		PrintWriter out = response.getWriter();
		int n = 0;
		Cookie[] all = request.getCookies();
		if(all!=null)
		{
			for(Cookie cookie : all)
			{
				if(cookie.getName().equals("VisitCountCookie"))
					n = Integer.parseInt(cookie.getValue());
			}
		}
 		Cookie cookie = new Cookie("VisitCountCookie",""+ ++n);
		response.addCookie(cookie);
		
		
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from category");
			out.print("<h1>Select Category</h1>");
			
			while(rs.next())
			{
				out.print("<a href= 'getproduct?catid="+rs.getInt(1)+"'>");
				out.print(rs.getString(2));
				out.print("</a>");
				
				out.print("<br/>");
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
		
		out.print("Visit Count: "+n);
		out.print("<a href='home'>Refresh</a>");
//		rd = request.getRequestDispatcher("Home.jsp");
//		rd.include(request, response);
	}

	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
