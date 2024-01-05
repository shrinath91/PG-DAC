package myservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/logincheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uid = request.getParameter("uid");
		String pwd = request.getParameter("pwd");
		String color = request.getParameter("color");
		
		if(uid.equals("shrinath")&& pwd.equals("shri123"))
			response.getWriter().print("<h1 style='color:"+color+"'>Login Success!!</h1>");
		else
			response.getWriter().print("Unsuccessfull login!!");
			
		
	}

}
