/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImpl;

import Dao.StudentD;
import Database.DatabaseConnectivity;
import Model.StudentBean;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author test
 */
public class StudenDaoImpl implements StudentD
{
    //@Override
    public boolean insertdata(StudentBean s) throws Exception
    {
        int i=0;
        boolean status=false;
        
        Connection con=DatabaseConnectivity.connect();
        Statement st=con.createStatement();
        String q1="insert into details values("+s.getsId()+",'"+s.getsName()+"')";
        i=st.executeUpdate(q1);
        
        if(i>0)
        {
            status=true;
        }
        return status;
    }

    
}
