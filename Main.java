package jdbcTest;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize Model
            Model model = new Model();
            model.connect();
            
            // Initialize View
            View view = new View();
            
            // Initialize Controller
            Controller controller = new Controller(model, view);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
