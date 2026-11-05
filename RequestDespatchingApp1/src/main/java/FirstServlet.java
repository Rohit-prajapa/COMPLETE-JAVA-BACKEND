
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest request,
                        HttpServletResponse response)
                        throws ServletException, IOException {

        System.out.println("Controller in First Servlet");

        String name = request.getParameter("name");
        String city = request.getParameter("city");

        // Create session
        HttpSession session = request.getSession();

        // Store data in session
        session.setAttribute("name", name);
        session.setAttribute("city", city);

        // Forward request to SecondServlet
        RequestDispatcher rd =
            request.getRequestDispatcher("/SecondServlet");

        rd.forward(request, response);
    }
}
