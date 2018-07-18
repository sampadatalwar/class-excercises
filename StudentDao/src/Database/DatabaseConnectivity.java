/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;
import java.sql.*;
/**
 *
 * @author test
 */
public class DatabaseConnectivity {
    
    static Connection con=null;
    public static Connection connect() throws Exception
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@192.168.1.47:1521:xe";
        con=DriverManager.getConnection(url,"User4","password");
        return con;
    }

    
    
}
