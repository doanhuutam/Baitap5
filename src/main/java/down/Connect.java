package down;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    public static java.sql.Connection getConnection() {
        try {
            String jdbcURL = "jdbc:mysql://localhost:3306/Baitap5";
            String jdbcUsername = "root";
            String jdbcPassword = "raisingthebar12";
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
            return connection;


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
