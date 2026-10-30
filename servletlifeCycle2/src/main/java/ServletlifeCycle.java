
import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servletlifeCycle")
public class ServletlifeCycle extends HttpServlet {

    private static final long serialVersionUID = 1L;

    // 1. Static block: Class Loading
    static {
        System.out.println("Servlet is Loaded.......");
    }

    // 2. Constructor: Object Creation
    public ServletlifeCycle() {
        System.out.println("Servlet Object is Created....");
    }

    // 3. init(): Initialization
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("Servlet is Initialized....");
    }

    // 4. service(): Handles client requests
    @Override
    protected void service(HttpServletRequest request,
                           HttpServletResponse response)
                           throws ServletException, IOException {

        System.out.println("Service method handles the HTTP request");

        response.setContentType("text/html");

        response.getWriter().println(
            "<h1>Servlet Life Cycle Executed Successfully!</h1>"
        );
    }

    // 5. destroy(): Destruction
    @Override
    public void destroy() {
        System.out.println("Servlet is Destroyed....");
    }
}
