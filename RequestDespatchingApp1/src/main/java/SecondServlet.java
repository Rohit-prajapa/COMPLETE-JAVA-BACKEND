
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest request,
                        HttpServletResponse response)
                        throws ServletException, IOException {

        System.out.println("Control in second servlet");

        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();

        HttpSession session = request.getSession(false);

        if (session != null) {

            String name = (String) session.getAttribute("name");
            String city = (String) session.getAttribute("city");

            writer.println("<h1>Response From Second Servlet</h1>");
            writer.println("<h2>Name: " + name + "</h2>");
            writer.println("<h2>City: " + city + "</h2>");

        } else {
            writer.println("<h2>Session not found!</h2>");
        }

        writer.close();
    }
}
