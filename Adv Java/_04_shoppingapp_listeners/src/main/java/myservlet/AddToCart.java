package myservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/addtocart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int pid = Integer.parseInt(request.getParameter("product"));
		HttpSession session = request.getSession();
		List<Integer> plist = null;
		plist = (List)session.getAttribute("cart");
		if(plist == null)
		{
			plist = new ArrayList<Integer>(); 
		}
		plist.add(pid);
		session.setAttribute("cart", plist);
		
		PrintWriter out = response.getWriter();
		out.print("Product ID"+pid+" succesfully added!!!");
		out.print("<br/> <a href='home'> Go back for selection </a>");
		out.print("<br/> <a href='viewcart'> View cart </a>");
	}

	

}
