
<%@page import="java.text.CollationKey"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form action="logincheck" method="post">
		uid:<input type="text" name="uid"/> </br>
		pwd:<input type="text" name="pwd"/> </br>
		<span id="msg">
		<%
			Cookie[] all = request.getCookies();
			if(all != null)
			{
				for(Cookie c : all)
				{
					if(c.getName().equals("LoginMsgCookie"))
					{
						out.print(c.getValue());
						out.print("<br/>");
					}
				}
			}
		 %>
		
		</span>
		
		<input type="submit" value="Login"/> </br>
		
	</form>
		<a href="/_04_shoppingapp_listeners/Register.html">Register</a> </br>
		

</body>
</html>