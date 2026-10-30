

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request,
                           HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("uname");
        String city = request.getParameter("ucity");
        String email = request.getParameter("uemail");
        String password = request.getParameter("upassword");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body bgcolor='lightgreen'>");

        out.println("<center>");

        out.println("<h1>Registration Successful!</h1>");
        out.println("<h2>Welcome " + name + "</h2>");

        out.println("<p>City: " + city + "</p>");
        out.println("<p>Email: " + email + "</p>");

        out.println("</center>");

        out.println("</body>");
        out.println("</html>");
    }
}