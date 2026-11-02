
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model {

    private String name;
    private String email;
    private String password;
    private String mobile;
    private String city;
    private String gender;
    private String course;

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // Registration Method

    public int register() {

        String sql = "INSERT INTO student(name,email,password,mobile,city,gender,course) VALUES(?,?,?,?,?,?,?)";

        try (Connection connect = jdbcutil.getConnection()) {

            if (connect == null) {
                System.out.println("Database connection failed!");
                return 0;
            }

            try (PreparedStatement pstmnt =
                    connect.prepareStatement(sql)) {

                pstmnt.setString(1, name);
                pstmnt.setString(2, email);
                pstmnt.setString(3, password);
                pstmnt.setString(4, mobile);
                pstmnt.setString(5, city);
                pstmnt.setString(6, gender);
                pstmnt.setString(7, course);

                int row = pstmnt.executeUpdate();

                return row;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
