package myservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/getproduct")
public class GetProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		con = (Connection)config.getServletContext().getAttribute("jdbccon");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("catid"));
		PreparedStatement ps;
		ResultSet rs;
		try 
		{
			ps = con.prepareStatement("Select * from product where cat_id = ?");
			ps.setInt(1, id);
			rs = ps.executeQuery();
			
			out.print("<form action='addtocart' method='post'>");
			out.print("Select Product:</br>");
			out.print("<select name='product'>");
			while(rs.next())
			{
				out.print("<option value="+rs.getInt(1)+">");
				out.print(rs.getString(2));
				out.print("</option>");
			}
			out.print("</select>");
			out.print("<input type='submit' value='Add to cart'>");
			out.print("</form>");
			
			out.print("<a href='home'>Go back to Home</a>");
			
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
