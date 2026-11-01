

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/Register")
public class Register extends HttpServlet {

	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Control in servlet");
		
		String name=request.getParameter("name");
		 String email=request.getParameter("email");
		 String password=request.getParameter("password");
		 String mobile=request.getParameter("mobile");
		 String city=request.getParameter("city");
		 String gender=request.getParameter("gender");
		 String Course=request.getParameter("course");
		 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		   String url = "jdbc:mysql://localhost:3306/registrationDB";
			String username ="root";
			
			String password1 ="admin@123";
			Connection connect = DriverManager.getConnection(url,username,password1);
			
			
			PreparedStatement pstmnt = connect.prepareStatement(
				    "INSERT INTO student(name, email, password, mobile, city, gender, course) VALUES (?, ?, ?, ?, ?, ?, ?)"
				);
			pstmnt.setString(1, name);
			pstmnt.setString(2, email);
			pstmnt.setString(3, password);
			pstmnt.setString(4, mobile);
			pstmnt.setString(5, city);
			pstmnt.setString(6, gender);
			pstmnt.setString(7, Course);
			
			int rows = pstmnt.executeUpdate();
			PrintWriter writer = response.getWriter();
			if(rows>0) {
				writer.println("<h1>Registation is Successfully Done</h1>");
			}
			else {
				System.out.println("<h1>Registation is not Successfully Done</h1>");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		 
	}

}
