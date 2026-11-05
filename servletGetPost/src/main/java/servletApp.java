import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/servletApp")
public class servletApp extends HttpServlet {


	public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("control in servlet");
		
		String name=request.getParameter("name");
		String city=request.getParameter("city");
		
		if(name.equals("Rohit") && city.equals("varanasi")) {
			System.out.println("Success!! HE is Right Rohit");
		}
		else {
			System.out.println("Different Rohit Logged in");
		}
	}

}
