package jdbcemployee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JDBCemployee {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter username:");
        String uname = br.readLine();
        System.out.print("Please enter Password:");
        String pname = br.readLine();
        new Login(uname, pname);
    }

}
