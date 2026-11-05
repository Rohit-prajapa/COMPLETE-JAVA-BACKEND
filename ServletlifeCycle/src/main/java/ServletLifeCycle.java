

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/ServletLifeCycle")
public class ServletLifeCycle extends HttpServlet {
	
	static {
		System.out.println("life Cycle of servlet");
	}
	public ServletLifeCycle() {
		System.out.println("Servlet object is Created");
	}
	
	public void init(ServletConfig config) throws ServletException {
	System.out.println("Servlet is Initialized");
	}

	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Service method to handle http request and respond back to client");
	}
	
   public void destroy() {
		
	}

}
