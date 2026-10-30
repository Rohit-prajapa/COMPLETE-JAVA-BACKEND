import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Registration extends HttpServlet {

    public Registration() {
        super();
    }

    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("Controller in servlet");

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String upassword = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");
        String mobile = request.getParameter("mobile");
        String gender = request.getParameter("gender");
        String dob = request.getParameter("dob");
        String city = request.getParameter("city");

        try {

            // 1. Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Database details
            String url = "jdbc:mysql://localhost:3306/registration_db";
            String user = "root";
            String dbPassword = "admin@123";

            // 3. Establish connection
            Connection connect = DriverManager.getConnection(
                    url, user, dbPassword
            );

            System.out.println("Database connected successfully");

            // 4. SQL Query
            String query = "INSERT INTO users "
                    + "(name, email, password, confirm_password, mobile, gender, dob, city, terms) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            // 5. Prepare statement
            PreparedStatement ps = connect.prepareStatement(query);

            // 6. Set values
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, upassword);
            ps.setString(4, confirmPassword);
            ps.setString(5, mobile);
            ps.setString(6, gender);
            ps.setString(7, dob);
            ps.setString(8, city);
            ps.setBoolean(9, true);

            // 7. Execute query
            int n = ps.executeUpdate();

            // 8. Send response
            PrintWriter pw = response.getWriter();

            if (n != 0) {
                pw.println("<h1>Registration Successfully Done</h1>");
            } else {
                pw.println("<h1>Registration Failed</h1>");
            }

            // 9. Close resources
            ps.close();
            connect.close();

        } catch (ClassNotFoundException e) {

            e.printStackTrace();

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}