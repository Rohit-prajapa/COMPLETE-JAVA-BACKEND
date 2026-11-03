
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/firstServlet")
public class FirstServletApp extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public FirstServletApp() {
        System.out.println("Servlet container created successfully");
    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        String name = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();

        writer.println("<html><body>");
        writer.println("<h1>Hello: " + name + "</h1>");
        writer.println("<h3>Here is your email: " + email + "</h3>");
        writer.println("<h3>Registration successful!</h3>");
        writer.println("</body></html>");

        writer.close();
    }
}
