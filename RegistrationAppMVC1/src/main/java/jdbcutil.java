
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcutil {

    private static final String URL =
        "jdbc:mysql://localhost:3306/registrationDB";

    private static final String USERNAME = "root";

    private static final String PASSWORD = "admin@123";

    public static Connection getConnection() {

        try {
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection con = DriverManager.getConnection(
                URL, USERNAME, PASSWORD
            );

            System.out.println("Database Connected Successfully!");

            return con;

        } catch (ClassNotFoundException e) {

            System.out.println("MySQL Driver Not Found!");
            e.printStackTrace();

        } catch (SQLException e) {

            System.out.println("Database Connection Failed!");
            e.printStackTrace();
        }

        return null;
    }
}
