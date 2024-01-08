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

@WebServlet("/confirmcart")
public class ConfirmCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		con = (Connection)config.getServletContext().getAttribute("jdbccon");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sesssion = request.getSession();
		User user = (User)sesssion.getAttribute("userinfo");
		String username = user.getUid();
		String mail = user.getEmail();
		String contact = user.getContact();
		Timestamp order_time = new Timestamp(new Date().getTime());
		int tot_ammt = (int)sesssion.getAttribute("tot_cart_price");
		//
		//removing cart as it is confirmed
		sesssion.removeAttribute("cart");
		
		PreparedStatement ps = null;
		int n = 0;
		try 
		{
			ps = con.prepareStatement("Insert into shopping(user_id, shoppingDate, totalprice) values(?,?,?)");
			ps.setString(1, username);
			ps.setTimestamp(2, order_time);
			ps.setInt(3, tot_ammt);
			n = ps.executeUpdate();
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(n>0)
		{
			PrintWriter out = response.getWriter();
			out.print("Ordered Successfully!!!<br/>");
			out.print("Bill will be mailed at "+mail+"<br/>");
			out.print("Courier will contact you at "+contact+"<br/>");
			
			out.print("<br/> <a href='home'> Go back for selection </a>");
			out.print("<br/> <a href='logout'> Logout </a>"); 
			
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
