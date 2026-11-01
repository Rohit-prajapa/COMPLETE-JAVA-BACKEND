

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/RegisterServletApp")
public class RegisterServletApp extends HttpServlet {
	
 public RegisterServletApp() {
	 System.out.println("Servlet Object is Created successfully");
 }
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String city=request.getParameter("city");
		PrintWriter writer = response.getWriter();
		
		
		response.sendRedirect("/FourthSevlet/success.jsp");
//		writer.println("Hello  " +name);
//		writer.println("i know you are from "+city);
	}

}
