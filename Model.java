package jdbcTest;

import java.sql.*;

public class Model {

    private Connection conn;

    // Database connection
    public void connect() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/student_enquiries";
        String username = "root";
        String password = ""; // use your actual credentials
        conn = DriverManager.getConnection(url, username, password);
    }

    // Method to store an enquiry
    public boolean storeEnquiry(String name, String email, String message) {
        String query = "INSERT INTO enquiries (name, email, message) VALUES (?, ?, ?)";
        try (PreparedStatement pst = conn.prepareStatement(query)) {
            pst.setString(1, name);
            pst.setString(2, email);
            pst.setString(3, message);
            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
