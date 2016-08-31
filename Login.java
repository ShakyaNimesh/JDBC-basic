
package jdbcemployee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login {
    Connection con;
    PreparedStatement pstat;
    ResultSet rs;
    
    public Login(String uname, String pname){
        String user="Select * from Login_tbl where Username = ? and Password = ? ";
        con=DatabaseConnection.getConnection();
        try {
            pstat=con.prepareStatement(user);
            pstat.setString(1, uname);
            pstat.setString(2, pname);
            rs=pstat.executeQuery();
            if(rs.next()){
                System.out.println("Login Successful");
            }else{
                System.out.println("Username or password not found");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
