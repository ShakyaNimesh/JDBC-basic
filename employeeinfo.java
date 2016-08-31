package jdbcemployee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class employeeinfo {

    Connection con;
    PreparedStatement pstat;
    ResultSet rs;

    public employeeinfo() {
        con = DatabaseConnection.getConnection();
        try {
            pstat = con.prepareStatement("Select * from tbl_employee");
            rs = pstat.executeQuery();
            while (rs.next()) {
                System.out.print(rs.getString(1) + " ");
                System.out.print(rs.getString(2) + " ");
                System.out.println(rs.getString(3));
            }
        } catch (SQLException ex) {
            System.err.println("Error occured:" + ex);
        }

    }

    public static void main(String[] args) {
        new employeeinfo();
    }

}
