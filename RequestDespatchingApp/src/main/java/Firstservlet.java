

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/Firstservlet")
public class Firstservlet extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Controller in First servlet");
		RequestDispatcher requsDispatch = request.getRequestDispatcher("/secondServlet");
		requsDispatch.forward(request, response);
		PrintWriter Writer = response.getWriter();
		Writer.println("<h1>response From servlet One</h1>");
		Writer.close();
	}

}
