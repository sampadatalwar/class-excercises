/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparedstatementop;
import java.sql.*;

/**
 *
 * @author test
 */
public class PreparedStatementOp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con=null;
        PreparedStatement stm=null;
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.47:1521:xe","User4","password");
            String q1="Update details set id=? where name=?";
            stm=con.prepareStatement(q1);
            stm.setInt(1,4);
            stm.setString(2,"Sampada");
            
            int r=stm.executeUpdate();
            System.out.println(r);
            System.out.println();
            
            String q2="Select id,name from details";
            stm=con.prepareStatement(q2);
            ResultSet rs=stm.executeQuery();
            
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" :  "+rs.getString(2));
            }
            
            rs.close();
            stm.close();
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    
}
