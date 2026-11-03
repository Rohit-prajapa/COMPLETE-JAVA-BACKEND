
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/Register")
public class Register extends HttpServlet {

    @Override
    public void service(HttpServletRequest request,
                        HttpServletResponse response)
                        throws ServletException, IOException {

        // Read form data
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String mobile = request.getParameter("mobile");
        String city = request.getParameter("city");
        String gender = request.getParameter("gender");
        String course = request.getParameter("course");

        // Create Model object
        Model model = new Model();

        // Set values
        model.setName(name);
        model.setEmail(email);
        model.setPassword(password);
        model.setMobile(mobile);
        model.setCity(city);
        model.setGender(gender);
        model.setCourse(course);

        // Register student
        int row = model.register();

        // Redirect according to result
        if (row > 0) {
            response.sendRedirect(
                request.getContextPath() + "/success.jsp"
            );
        } else {
            response.sendRedirect(
                request.getContextPath() + "/failure.jsp"
            );
        }
    }
}
