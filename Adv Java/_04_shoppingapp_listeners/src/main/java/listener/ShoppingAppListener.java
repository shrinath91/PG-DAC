package listener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class ShoppingAppListener implements ServletContextListener {

	Connection con = null;
	public void contextInitialized(ServletContextEvent sce)  { 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String jdbcurl = "jdbc:mysql://localhost:3306/shoppingdb";
			con = DriverManager.getConnection(jdbcurl,"root","root");
			System.out.println("Connection Done");
			sce.getServletContext().setAttribute("jdbccon", con);
			System.out.println("Con has been successfully set as Context level attribute");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    
    public void contextDestroyed(ServletContextEvent sce)  { 
    	try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    }

	
}
