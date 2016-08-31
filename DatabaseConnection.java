package jdbcemployee;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public static Connection getConnection() {
        Connection con = null;
        try {
           Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "root", "");
           // System.out.println("Server Connected");

        } catch (Exception e) {
            System.out.println("Error occured:" + e);
        }
        return con;
    }

    public static void main(String[] args) {
        getConnection();

    }
}
