package myservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/viewcart")
public class ViewCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con =  null;
	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		con = (Connection)config.getServletContext().getAttribute("jdbccon");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("/header");
		rd.include(request, response);
		
		
		HttpSession session = request.getSession();
		List<Integer> plist = (List)session.getAttribute("cart");
		
		PrintWriter out = response.getWriter();
		if(plist == null)
		{
			out.print("<h2> Cart is empty </h2>");
			out.print("<br/> <a href='home'> Go back for selection </a>");
		}
		else
		{
			out.print("<h3>Cart</h3>");
			out.print("<table border=1>");
			out.print("<tr>");
			out.print("<td></td>");
			out.print("<td>Product</td>");
			out.print("<td>Price</td>");
			out.print("</tr>");
			
			PreparedStatement ps = null;
			ResultSet rs = null;
			try 
			{
				ps = null;
				rs = null;
				int cnt = 0;
				int tot_ammt = 0;
				for(int n : plist)
				{
					ps = con.prepareStatement("Select * from product where p_id = ?");
					ps.setInt(1, n);
					rs = ps.executeQuery();
					rs.next();
					out.print("<tr>");
					out.print("<td>"+ ++cnt+"</td>");
					out.print("<td>"+ rs.getString(2) +"</td>");
					out.print("<td>"+ rs.getString(4) +"</td>");
					out.print("</tr>");
					tot_ammt = tot_ammt + Integer.parseInt(rs.getString(4));
				}
				out.print("<tr>");
				out.print("<td colspan='2'>Total</td>");
				out.print("<td>"+ tot_ammt +"</td>");
				out.print("</tr>");
				out.print("</table>");
				
			session.setAttribute("tot_cart_price", tot_ammt);
				
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			finally 
			{
				try 
				{
					ps.close();
					rs.close();
				} catch (SQLException e) 
				{
					e.printStackTrace();
				}
				
			}
			out.print("<br/> <a href='home'> Go back for selection </a>");
			out.print("<br/> <a href='confirmcart'> Confirm cart </a>"); 
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
